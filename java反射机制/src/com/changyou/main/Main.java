package com.changyou.main;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Properties;

import org.junit.Test;

import com.changyou.common.DateUtil;
import com.changyou.model.ApolloErpWorkerinfo;
import com.changyou.model.Person;
import com.changyou.model.StudentInvoke;

public class Main {
	
	//Java反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法和属性；
	//这种动态获取的信息以及动态调用对象的方法的功能称为Java语言的反射机制。
	//http://blog.csdn.net/ochangwen/article/details/51474278
	
	public static void main(String[] args) {
		
	}
	
	
	/** 
	 * 反射机制获取类有三种方法 
	 */  
	@Test
	public void testGetClass() throws ClassNotFoundException {  
	    Class clazz = null;  
	  
	    //1 直接通过类名.Class的方式得到  
	    clazz = Person.class;  
	    System.out.println("通过类名: " + clazz);  
	  
	    //2 通过对象的getClass()方法获取,这个使用的少（一般是传的是Object，不知道是什么类型的时候才用）  
	    Object obj = new Person();  
	    clazz = obj.getClass();  
	    System.out.println("通过getClass(): " + clazz);  
	  
	    //3 通过全类名获取，用的比较多，但可能抛出ClassNotFoundException异常  
	    clazz = Class.forName("com.changyou.model.Person");  
	    System.out.println("通过全类名获取: " + clazz);  
	}  
	
	/** 
	 * Class类的newInstance()方法，创建类的一个对象。 
	 */  
	@Test 
	public void testNewInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException {  
	  
	    Class clazz = Class.forName("com.changyou.model.Person");  
	  
	    //使用Class类的newInstance()方法创建类的一个对象  
	    //实际调用的类的那个 无参数的构造器（这就是为什么写的类的时候，要写一个无参数的构造器，就是给反射用的）  
	    //一般的，一个类若声明了带参数的构造器，也要声明一个无参数的构造器  
	    Object obj = clazz.newInstance();  
	    System.out.println(obj);  
	} 
	
	/** 
	 * ClassLoader类装载器 
	 */  
	@Test  
	public void testClassLoader1() throws ClassNotFoundException, IOException {  
	    //1、获取一个系统的类加载器  
	    ClassLoader classLoader = ClassLoader.getSystemClassLoader();  
	    System.out.println("系统的类加载器-->" + classLoader);  
	  
	    //2、获取系统类加载器的父类加载器(扩展类加载器（extensions classLoader）)  
	    classLoader = classLoader.getParent();  
	    System.out.println("扩展类加载器-->" + classLoader);  
	  
	    //3、获取扩展类加载器的父类加载器  
	    //输出为Null,无法被Java程序直接引用  
	    classLoader = classLoader.getParent();  
	    System.out.println("启动类加载器-->" + classLoader);  
	  
	    //  
	  
	    //4、测试当前类由哪个类加载器进行加载 ,结果就是系统的类加载器  
	    classLoader = Class.forName("com.changyou.model.Person").getClassLoader();  
	    System.out.println("当前类由哪个类加载器进行加载-->"+classLoader);  
	  
	    //5、测试JDK提供的Object类由哪个类加载器负责加载的  
	    classLoader = Class.forName("java.lang.Object").getClassLoader();  
	    System.out.println("JDK提供的Object类由哪个类加载器加载-->" + classLoader);  
	}  
	
    @Test  
    public void testGetResourceAsStream() throws ClassNotFoundException, IOException {  
    	//       这么写的话，文件需要放到src目录下  
        //       InputStream in = new FileInputStream("test.properties");  
  
        //5、关于类加载器的一个主要方法  
        //调用getResourceAsStream 获取类路径下的文件对应的输入流  
        InputStream in = this.getClass().getClassLoader()  
                .getResourceAsStream("com/changyou/config/test.properties");  
        System.out.println("in: " +in);  
  
        Properties properties = new Properties();  
        properties.load(in);  
  
        String driverClass = properties.getProperty("dirver");  
        String jdbcUrl = properties.getProperty("jdbcUrl");  
        //中文可能会出现乱码，需要转换一下  
        String user = new String(properties.getProperty("user").getBytes("ISO-8859-1"), "UTF-8");  
        String password = properties.getProperty("password");  
  
        System.out.println("diverClass: "+driverClass);  
        System.out.println("user: " + user);  
    } 
    
    @Test  
    public void testMethod() throws ClassNotFoundException, NoSuchMethodException,   
            IllegalAccessException, InstantiationException, InvocationTargetException {  
        Class clazz = Class.forName("com.changyou.model.Person");  
      
        //1、得到clazz 对应的类中有哪些方法,不能获取private方法  
        Method[] methods =clazz.getMethods();  
        System.out.print("        getMethods: ");  
        for (Method method : methods){  
            System.out.print(method.getName() + ", ");  
        }  
      
        //2、获取所有的方法(且只获取当着类声明的方法，包括private方法）  
        Method[] methods2 = clazz.getDeclaredMethods();  
        System.out.print("\ngetDeclaredMethods: ");  
        for (Method method : methods2){  
            System.out.print(method.getName() + ", ");  
        }  
      
        //3、获取指定的方法  
        Method method = clazz.getDeclaredMethod("setName",String.class);//第一个参数是方法名，后面的是方法里的参数  
        System.out.println("\nmethod : " + method);  
      
        Method method2 = clazz.getDeclaredMethod("setName",String.class ,int.class);//第一个参数是方法名，后面的是方法里的参数  
        System.out.println("method2: " + method2);  
      
        //4、执行方法！  
        Object obj = clazz.newInstance();  
        method2.invoke(obj, "changwen", 22);  
    }  
    
    /** 
     * 获取当前类的父类中定义的私有方法 
     * 直接调用getSuperclass() 
     */  
    @Test  
    public void testGetSuperClass() throws Exception {  
        String className = "com.changyou.model.StudentInvoke";  
      
        Class clazz = Class.forName(className);  
        Class superClazz = clazz.getSuperclass();  
      
        System.out.println(superClazz);  
        //输出结果：class com.java.reflection.PersonInvoke  
    }  
    
    /** 
     * @param className  某个类的全类名 
     * @param methodName 类的一个方法的方法名，该方法也可能是私有方法 
     * @param args  调用该方法需要传入的参数 ...可变参数的意思 
     * @return 调用方法后的返回值 
     */  
    public Object invoke(String className, String methodName, Object ... args) {  
        Object obj = null;  
        try {  
            obj = Class.forName(className).newInstance();  
            return invoke(obj, methodName, args);  
     
        } catch (InstantiationException e) {  
            e.printStackTrace();  
        } catch (IllegalAccessException e) {  
            e.printStackTrace();  
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
        }  
        return invoke(null, methodName, args);  
    }  
    /** 
     * @param obj  方法执行的那个对象 
     * @param methodName 类的一个方法的方法名，该方法也可能是私有方法,还可能是该方法在父类中定义的私有方法 
     * @param args  调用该方法需要传入的参数 ...可变参数的意思 
     * @return 调用方法后的返回值 
     */  
    public Object invoke(Object obj, String methodName, Object ... args) {  
        //1、获取Method对象  
        Class [] parameterTypes = new Class[args.length];  
        for (int i=0 ; i<args.length; i++){  
            parameterTypes[i] = args[i].getClass();  
        }  
     
        try {  
            //2、执行Method方法  
            Method method = getMethod(obj.getClass(), methodName,parameterTypes);  
     
            //通过反射执行private方法  
            method.setAccessible(true);  
     
            //3、返回方法的返回值  
            return method.invoke(obj,args);  
     
        } catch (Exception e) {  
     
        }  
     
        return null;  
    }  
     
    /** 
     * 获取clazz 的methodName 方法， 该方法可能是私有方法，还可能是父类中的私有方法 
     */  
    public Method getMethod(Class clazz, String methodName, Class ... parameterTypes) {  
        //注意这个循环里的内容！！！  
        for (; clazz != Object.class; clazz = clazz.getSuperclass()){  
            try {  
                return clazz.getDeclaredMethod(methodName, parameterTypes);  
            } catch (Exception e) { //这里要写Exception，不然会出错，应该是有部分异常没有捕获  
     
            }  
        }  
        return null;  
    }  
    
    
    @Test  
    public void testInvoke2() {  
        Object obj = new StudentInvoke();  
        invoke(obj, "method1", 10);  
      
        Object result = invoke(obj, "method2");  
        System.out.println(result);  
    } 
    
    
    /** 
     * Field: 封装了字段的信息 
     */  
    @Test  
    public void testField() throws  
            ClassNotFoundException, NoSuchFieldException, IllegalAccessException {  
      
        Class clazz = Class.forName("com.java.reflection.Person");  
      
        //1、获取字段  
        //1.1 获取Field的数组,私有字段也能获取  
        Field[] fields = clazz.getDeclaredFields();  
        for (Field field: fields) {  
            System.out.print(field.getName() + ", ");  
        }  
      
        //1.2 获取指定名字的Field（如果是私有的，见下面的4)  
        Field field = clazz.getDeclaredField("name");  
        System.out.println("\n获取指定Field名=: " + field.getName());  
      
        Person person = new Person("ABC", 12);  
        //2、获取指定对象的Field的值  
        Object val = field.get(person);  
        System.out.println("获取指定对象字段'name'的Field的值=： " + val);  
      
        //3、设置指定对象的Field的值  
        field.set(person, "changwen2");  
        //System.out.println("设置指定对象字段'name'的Field的值=: " + person.name);  
      
        //4、若该字段是私有的，需要调用setAccessible(true)方法  
        Field field2 = clazz.getDeclaredField("age");  
        field2.setAccessible(true);  
        System.out.println("获取指定私有字段名=: " + field2.getName());  
    }  
    
    /** 
     * 一个实例： 
     * 反射获取一个继承Person2的Student类 
     * 设置字段"age"=20(该字段可能为私有，可能在其父类中） 
     */  
    @Test  
    public void testClassField() throws ClassNotFoundException, IllegalAccessException, InstantiationException {  
        String className = "com.java.reflection.Student";  
        String fieldName = "age";  //可能为私有，可能在其父类中  
        Object val = 20;  
      
        //创建className 对应类的对象，并为其fieldName赋值为val  
        Class clazz = Class.forName(className);  
        Field field = null;  
        for (Class clazz2 = clazz; clazz2 != Object.class; clazz2 = clazz2.getSuperclass()){  
            try {  
                field = clazz2.getDeclaredField(fieldName);  
            } catch (Exception e) {  
      
            }  
        }  
      
        Object obj = clazz.newInstance();  
        assert field != null;  
        field.setAccessible(true);  
        field.set(obj, val);  
      
       // Student stu = (Student) obj;  
       // System.out.println("age = " + stu.getAge());  
    }  
    
    /** 
     * 构造器：开发用的比较少 
     */  
    @Test  
    public void testConstructor() throws ClassNotFoundException, NoSuchMethodException,  
            IllegalAccessException, InvocationTargetException, InstantiationException {  
        String className = "com.java.reflection.Person";  
        Class<Person> clazz = (Class<Person>) Class.forName(className);  
      
        //1.获取Constructor对象  
        Constructor<Person>[] constructors =  
                (Constructor<Person>[]) Class.forName(className).getConstructors();  
      
        for (Constructor<Person> constructor: constructors) {  
            System.out.println(constructor);  
        }  
      
        Constructor<Person> constructor = clazz.getConstructor(String.class, Integer.class);  
        System.out.println("指定的-->" + constructor);  
      
        //2.调用构造器的newInstance()方法创建对象  
        Object obj= constructor.newInstance("changwen", 11);  
    }  

	
	/**
	 * 
	 * <p>Title: isChange</p> 
	 * <p>Description: 对比新旧数据</p>
	 * @author:zwj
	 * @param eeOld
	 * @param eeNew
	 * @return
	 * boolean true为发生改变，false没有发生改变
	 */
	private boolean isChange(ApolloErpWorkerinfo eeOld,ApolloErpWorkerinfo eeNew) throws Exception {
		try {
			//对ApolloErpWorkerinfo类中的String类型的字段进行对比
			String[] compareStr = { "workerinfoDelete", "bankNo",
					"corporation", "workerAttribute", "workerinfoName", "sex",
					"passport", "mobile", "telephone", "outEmail",
					"specialityLevel", "contractSubject", "workerinfoStatus","workingLocation","naturalId"};
			//对ApolloErpWorkerinfo类中的Date类型的字段进行对比
			String[] compareDate = { "updateDate", "convertDate", "joinDate",
					"exitDate" };
			Class oldClass = eeOld.getClass();
			Class newClass = eeNew.getClass();
			Field oldF;
			Field newF;
			Object oldFieldValue;
			Object newFieldValue;
			String oldFieldValueStr;
			String newFieldValueStr;
			Date oldFieldValueDate;
			Date newFieldValueDate;
			for (int i = 0; i < compareStr.length; i++) {
				//类的属性私有，必须用getDeclaredField，不能用getField
				oldF = oldClass.getDeclaredField(compareStr[i]);
				//设置些属性是可以访问的
				oldF.setAccessible(true);
				oldFieldValue = oldF.get(eeOld);
				newF = newClass.getDeclaredField(compareStr[i]);
				newF.setAccessible(true);
				newFieldValue = newF.get(eeNew);
				oldFieldValueStr = oldFieldValue == null ? "" : oldFieldValue
						.toString();
				newFieldValueStr = newFieldValue == null ? "" : newFieldValue
						.toString();
				if (!oldFieldValueStr.equals(newFieldValueStr)) {
					/*LogUtil.info("编号：" + eeOld.getWorkerinfoNo() + " 的"
							+ compareStr[i] + "发生变更+++++erp中："
							+ oldFieldValueStr + "+++++ehr中："
							+ newFieldValueStr);*/
					return true;
				}
			}
			for (int i = 0; i < compareDate.length; i++) {
				oldF = oldClass.getDeclaredField(compareDate[i]);
				oldF.setAccessible(true);
				oldFieldValue = oldF.get(eeOld);
				newF = newClass.getDeclaredField(compareDate[i]);
				newF.setAccessible(true);
				newFieldValue = newF.get(eeNew);
				if ((oldFieldValue != null && newFieldValue == null)
						|| (oldFieldValue == null && newFieldValue != null)) {
					return true;
				} else {
					if (oldFieldValue != null && newFieldValue != null) {
						oldFieldValueDate = (Date) oldFieldValue;
						newFieldValueDate = (Date) newFieldValue;
						if (!DateUtil.DateToString(newFieldValueDate,
								"yyy-MM-dd HH:mm:ss").equals(
								DateUtil.DateToString(oldFieldValueDate,
										"yyy-MM-dd HH:mm:ss"))) {
							/*LogUtil.info("编号："
									+ eeOld.getWorkerinfoNo()
									+ " 的"
									+ compareDate[i]
									+ "发生变更+++++erp中："
									+ DateUtil.DateToString(oldFieldValueDate,
											"yyy-MM-dd HH:mm:ss")
									+ "+++++ehr中："
									+ DateUtil.DateToString(newFieldValueDate,
											"yyy-MM-dd HH:mm:ss"));*/
							return true;
						}
					}
				}
			}
	
		} catch (Exception e) {
			//LogUtil.error("编号：" + eeOld.getWorkerinfoNo() + " 的数据erp和ehr比较报错:",e);
			return true;
		}
		return false;
	}
}
