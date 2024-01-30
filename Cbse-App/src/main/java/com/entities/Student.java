package com.entities;
// StudentId	fname	lname	age	gender	fathername	phone	address	classId	rollno	password
/**
 * 
 */
public class Student {
	private int StudentId;
	private String FirstName;
	private String LastName;
	private String Dob;
	private String Gender;
	private String FatherName;
	private String Phone;
	private String Address;
	private int ClassId;
	private String RollNo;
	private String RegistrationNo;
	
	public String getRegistrationNo() {
		return RegistrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		RegistrationNo = registrationNo;
	}
	private String Password;
	
	
	public int getStudentId() {
		return StudentId;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getClassId() {
		return ClassId;
	}
	public void setClassId(int classId) {
		ClassId = classId;
	}
	public String getRollNo() {
		return RollNo;
	}
	public void setRollNo(String rollno) {
		RollNo = rollno;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Dob="
				+ Dob + ", Gender=" + Gender + ", FatherName=" + FatherName + ", Phone=" + Phone + ", Address="
				+ Address + ", ClassId=" + ClassId + ", RollNo=" + RollNo + ", RegistrationNo=" + RegistrationNo
				+ ", Password=" + Password + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
