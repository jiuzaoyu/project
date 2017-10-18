package com.changyou.model;

import java.util.Date;

public class ApolloErpWorkerinfo implements java.io.Serializable {


	// Fields

	

	private Integer workerinfoId;
	private String workerinfoNo;
	private String naturalId;
	private String workerinfoName;
	private Date birthday;
	private String sex;
	private String country;
	private String nation;
	private String politics;
	private String passport;
	private String degree;
	private String foreignLanguage;
	private String languageLevel;
	private String marriage;
	private Integer children;
	private String recruitType;
	private String workerinfoStatus;
	private Date joinDate;
	private Date convertDate;
	private Date exercitationStartDate;
	private Date exercitationEndDate;
	private Date contractEndDate;
	private Date contractContinueDate;
	private Date exitDate;
	private String corporation;
	private String workerAttribute;
	private Integer changyouLevel;
	private Integer postLevel;
	private Integer managerLevel;
	private Integer changyouTitle;
	private String specialityLevel;
	private String recommender;
	private String outEmail;
	private String telephone;
	private String mobile;
	private String workPos;
	private String bankName;
	private String bankAccount;
	private String bankNo;
	private String luckyIp;
	private String happyIp;
	private String outIp;
	private String taxiStart;
	private String taxiEnd;
	private String headPhoto;
	private Date workerinfoAddDate;
	private String workerinfoDelete;
	private Date workerinfoDeleteDate;
	private String attendanceType;
	
	
	private String postNo;
	private String postName;
	
	private Date updateDate;
	
	private String contractSubject;
	
	private String workingLocation;//工作地点
	
	private Date firstWorkDate;//首次工作时间
	
	private String workAgeTotal;//累计工龄

	// Constructors
	
	

	public Date getUpdateDate() {
		return updateDate;
	}

	public String getNaturalId() {
		return naturalId;
	}

	public void setNaturalId(String naturalId) {
		this.naturalId = naturalId;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/** default constructor */
	public ApolloErpWorkerinfo() {
	}

	public String getContractSubject() {
		return contractSubject;
	}

	public void setContractSubject(String contractSubject) {
		this.contractSubject = contractSubject;
	}

	/** minimal constructor */
	public ApolloErpWorkerinfo(String workerinfoNo, Date workerinfoAddDate,
			String workerinfoDelete) {
		this.workerinfoNo = workerinfoNo;
		this.workerinfoAddDate = workerinfoAddDate;
		this.workerinfoDelete = workerinfoDelete;
	}
	public ApolloErpWorkerinfo(String workerinfoNo, String workerinfoName,
			String workerinfoDelete) {
		this.workerinfoNo = workerinfoNo;
		this.workerinfoName = workerinfoName;
		this.workerinfoDelete = workerinfoDelete;
	}

	/** full constructor */
	public ApolloErpWorkerinfo(Integer workerinfoId, String workerinfoNo,
			String workerinfoName, Date birthday, String sex, String country,
			String nation, String politics, String passport, String degree,
			String foreignLanguage, String languageLevel, String marriage,
			Integer children, String recruitType, String workerinfoStatus,
			Date joinDate, Date convertDate, Date exercitationStartDate,
			Date exercitationEndDate, Date contractEndDate,
			Date contractContinueDate, Date exitDate, String corporation,
			String workerAttribute, Integer changyouLevel, Integer postLevel,
			Integer managerLevel, Integer changyouTitle,
			String specialityLevel, String recommender, String outEmail,
			String telephone, String mobile, String workPos, String bankName,
			String bankAccount, String bankNo,
			String luckyIp, String happyIp, String outIp, String taxiStart,
			String taxiEnd, String headPhoto, Date workerinfoAddDate,
			String workerinfoDelete, Date workerinfoDeleteDate, String company,
			String postNo, String postName,String attendanceType) {
		super();
		this.workerinfoId = workerinfoId;
		this.workerinfoNo = workerinfoNo;
		this.workerinfoName = workerinfoName;
		this.birthday = birthday;
		this.sex = sex;
		this.country = country;
		this.nation = nation;
		this.politics = politics;
		this.passport = passport;
		this.degree = degree;
		this.foreignLanguage = foreignLanguage;
		this.languageLevel = languageLevel;
		this.marriage = marriage;
		this.children = children;
		this.recruitType = recruitType;
		this.workerinfoStatus = workerinfoStatus;
		this.joinDate = joinDate;
		this.convertDate = convertDate;
		this.exercitationStartDate = exercitationStartDate;
		this.exercitationEndDate = exercitationEndDate;
		this.contractEndDate = contractEndDate;
		this.contractContinueDate = contractContinueDate;
		this.exitDate = exitDate;
		this.corporation = corporation;
		this.workerAttribute = workerAttribute;
		this.changyouLevel = changyouLevel;
		this.postLevel = postLevel;
		this.managerLevel = managerLevel;
		this.changyouTitle = changyouTitle;
		this.specialityLevel = specialityLevel;
		this.recommender = recommender;
		this.outEmail = outEmail;
		this.telephone = telephone;
		this.mobile = mobile;
		this.workPos = workPos;
		this.bankName = bankName;
		this.bankAccount = bankAccount;
		this.bankNo = bankNo;
		this.luckyIp = luckyIp;
		this.happyIp = happyIp;
		this.outIp = outIp;
		this.taxiStart = taxiStart;
		this.taxiEnd = taxiEnd;
		this.headPhoto = headPhoto;
		this.workerinfoAddDate = workerinfoAddDate;
		this.workerinfoDelete = workerinfoDelete;
		this.workerinfoDeleteDate = workerinfoDeleteDate;		
		this.postNo = postNo;
		this.postName = postName;
		this.attendanceType = attendanceType;
	}

	// Property accessors
	
	public Integer getWorkerinfoId() {
		return this.workerinfoId;
	}

	public String getHeadPhoto() {
		return headPhoto;
	}

	public void setHeadPhoto(String headPhoto) {
		this.headPhoto = headPhoto;
	}

	public void setWorkerinfoId(Integer workerinfoId) {
		this.workerinfoId = workerinfoId;
	}

	public String getWorkerinfoNo() {
		return this.workerinfoNo;
	}

	public void setWorkerinfoNo(String workerinfoNo) {
		this.workerinfoNo = workerinfoNo;
	}

	public String getWorkerinfoName() {
		return this.workerinfoName;
	}

	public void setWorkerinfoName(String workerinfoName) {
		this.workerinfoName = workerinfoName;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getPolitics() {
		return this.politics;
	}

	public void setPolitics(String politics) {
		this.politics = politics;
	}

	public String getPassport() {
		return this.passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getForeignLanguage() {
		return this.foreignLanguage;
	}

	public void setForeignLanguage(String foreignLanguage) {
		this.foreignLanguage = foreignLanguage;
	}

	public String getLanguageLevel() {
		return this.languageLevel;
	}

	public void setLanguageLevel(String languageLevel) {
		this.languageLevel = languageLevel;
	}

	public String getMarriage() {
		return this.marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public Integer getChildren() {
		return this.children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}

	public String getRecruitType() {
		return this.recruitType;
	}

	public void setRecruitType(String recruitType) {
		this.recruitType = recruitType;
	}

	public String getWorkerinfoStatus() {
		return this.workerinfoStatus;
	}

	public void setWorkerinfoStatus(String workerinfoStatus) {
		this.workerinfoStatus = workerinfoStatus;
	}

	public Date getJoinDate() {
		return this.joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Date getConvertDate() {
		return this.convertDate;
	}

	public void setConvertDate(Date convertDate) {
		this.convertDate = convertDate;
	}

	public Date getExercitationStartDate() {
		return this.exercitationStartDate;
	}

	public void setExercitationStartDate(Date exercitationStartDate) {
		this.exercitationStartDate = exercitationStartDate;
	}

	public Date getExercitationEndDate() {
		return this.exercitationEndDate;
	}

	public void setExercitationEndDate(Date exercitationEndDate) {
		this.exercitationEndDate = exercitationEndDate;
	}

	public Date getContractEndDate() {
		return this.contractEndDate;
	}

	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public Date getContractContinueDate() {
		return this.contractContinueDate;
	}

	public void setContractContinueDate(Date contractContinueDate) {
		this.contractContinueDate = contractContinueDate;
	}

	public Date getExitDate() {
		return this.exitDate;
	}

	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}

	public String getCorporation() {
		return this.corporation;
	}

	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}

	public String getWorkerAttribute() {
		return this.workerAttribute;
	}

	public void setWorkerAttribute(String workerAttribute) {
		this.workerAttribute = workerAttribute;
	}

	public Integer getChangyouLevel() {
		return this.changyouLevel;
	}

	public void setChangyouLevel(Integer changyouLevel) {
		this.changyouLevel = changyouLevel;
	}

	public Integer getPostLevel() {
		return this.postLevel;
	}

	public void setPostLevel(Integer postLevel) {
		this.postLevel = postLevel;
	}

	public Integer getManagerLevel() {
		return this.managerLevel;
	}

	public void setManagerLevel(Integer managerLevel) {
		this.managerLevel = managerLevel;
	}

	public Integer getChangyouTitle() {
		return this.changyouTitle;
	}

	public void setChangyouTitle(Integer changyouTitle) {
		this.changyouTitle = changyouTitle;
	}

	public String getSpecialityLevel() {
		return this.specialityLevel;
	}

	public void setSpecialityLevel(String specialityLevel) {
		this.specialityLevel = specialityLevel;
	}

	public String getRecommender() {
		return this.recommender;
	}

	public void setRecommender(String recommender) {
		this.recommender = recommender;
	}

	public String getOutEmail() {
		return this.outEmail;
	}

	public void setOutEmail(String outEmail) {
		this.outEmail = outEmail;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWorkPos() {
		return this.workPos;
	}

	public void setWorkPos(String workPos) {
		this.workPos = workPos;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankNo() {
		return this.bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public String getLuckyIp() {
		return this.luckyIp;
	}

	public void setLuckyIp(String luckyIp) {
		this.luckyIp = luckyIp;
	}

	public String getHappyIp() {
		return this.happyIp;
	}

	public void setHappyIp(String happyIp) {
		this.happyIp = happyIp;
	}

	public String getOutIp() {
		return this.outIp;
	}

	public void setOutIp(String outIp) {
		this.outIp = outIp;
	}

	public String getTaxiStart() {
		return this.taxiStart;
	}

	public void setTaxiStart(String taxiStart) {
		this.taxiStart = taxiStart;
	}

	public String getTaxiEnd() {
		return this.taxiEnd;
	}

	public void setTaxiEnd(String taxiEnd) {
		this.taxiEnd = taxiEnd;
	}

	public Date getWorkerinfoAddDate() {
		return this.workerinfoAddDate;
	}

	public void setWorkerinfoAddDate(Date workerinfoAddDate) {
		this.workerinfoAddDate = workerinfoAddDate;
	}

	public String getWorkerinfoDelete() {
		return this.workerinfoDelete;
	}

	public void setWorkerinfoDelete(String workerinfoDelete) {
		this.workerinfoDelete = workerinfoDelete;
	}

	public Date getWorkerinfoDeleteDate() {
		return this.workerinfoDeleteDate;
	}

	public void setWorkerinfoDeleteDate(Date workerinfoDeleteDate) {
		this.workerinfoDeleteDate = workerinfoDeleteDate;
	}
	

	@Override
	public String toString() {
		return "ApolloErpWorkerinfo [workerinfoId=" + workerinfoId
				+ ", workerinfoNo=" + workerinfoNo + ", workerinfoName="
				+ workerinfoName + ", birthday=" + birthday + ", sex=" + sex
				+ ", country=" + country + ", nation=" + nation + ", politics="
				+ politics + ", passport=" + passport + ", degree=" + degree
				+ ", foreignLanguage=" + foreignLanguage + ", languageLevel="
				+ languageLevel + ", marriage=" + marriage + ", children="
				+ children + ", recruitType=" + recruitType
				+ ", workerinfoStatus=" + workerinfoStatus + ", joinDate="
				+ joinDate + ", convertDate=" + convertDate
				+ ", exercitationStartDate=" + exercitationStartDate
				+ ", exercitationEndDate=" + exercitationEndDate
				+ ", contractEndDate=" + contractEndDate
				+ ", contractContinueDate=" + contractContinueDate
				+ ", exitDate=" + exitDate + ", corporation=" + corporation
				+ ", workerAttribute=" + workerAttribute + ", changyouLevel="
				+ changyouLevel + ", postLevel=" + postLevel
				+ ", managerLevel=" + managerLevel + ", changyouTitle="
				+ changyouTitle + ", specialityLevel=" + specialityLevel
				+ ", recommender=" + recommender + ", outEmail=" + outEmail
				+ ", telephone=" + telephone + ", mobile=" + mobile
				+ ", workPos=" + workPos + ", bankNo=" + bankNo + ", luckyIp="
				+ luckyIp + ", happyIp=" + happyIp + ", outIp=" + outIp
				+ ", taxiStart=" + taxiStart + ", taxiEnd=" + taxiEnd
				+ ", headPhoto=" + headPhoto + ", workerinfoAddDate="
				+ workerinfoAddDate + ", workerinfoDelete=" + workerinfoDelete
				+ ", workerinfoDeleteDate=" + workerinfoDeleteDate
				+ ", postNo=" + postNo + ", postName=" + postName 
				+ ", attendanceType=" + attendanceType + "]";
	}

	public String getPostNo() {
		return postNo;
	}

	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getAttendanceType() {
		return attendanceType;
	}

	public void setAttendanceType(String attendanceType) {
		this.attendanceType = attendanceType;
	}

	public String getWorkingLocation() {
		return workingLocation;
	}

	public void setWorkingLocation(String workingLocation) {
		this.workingLocation = workingLocation;
	}

	public Date getFirstWorkDate() {
		return firstWorkDate;
	}

	public void setFirstWorkDate(Date firstWorkDate) {
		this.firstWorkDate = firstWorkDate;
	}

	public String getWorkAgeTotal() {
		return workAgeTotal;
	}

	public void setWorkAgeTotal(String workAgeTotal) {
		this.workAgeTotal = workAgeTotal;
	}
	
}
