package com.jsp.spring.student_db.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
		@Id
	private int sId;
	private String sName;
	private String sEmail;
	private byte sAge;
	private String sCourse;
	private String sCity;
	private long sPhoneNo;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public byte getsAge() {
		return sAge;
	}
	public void setsAge(byte sAge) {
		this.sAge = sAge;
	}
	public String getsCourse() {
		return sCourse;
	}
	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	public long getsPhoneNo() {
		return sPhoneNo;
	}
	public void setsPhoneNo(long sPhoneNo) {
		this.sPhoneNo = sPhoneNo;
	}
	@Override
	public String toString() {
		return "                                                                                                         "
				+ "Student :->[Student Id=" + sId + ",\n Student Name=" + sName + ",\n Student Email=" +
				sEmail + "\n, Student Age=" + sAge + ",\n Student Course="
				+ sCourse + ",\n Student City=" + sCity + ",\n Student PhoneNo=" + sPhoneNo + "]";
	}
}
