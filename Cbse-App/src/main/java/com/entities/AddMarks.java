package com.entities;

public class AddMarks {
	private int ResultId;
	private String ClassId;
	private String SubjectId;
	private String StudentId;
	private int Marks;
	
	
	public int getResultId() {
		return ResultId;
	}
	public void setResultId(int resultId) {
		ResultId = resultId;
	}
	public String getClassId() {
		return ClassId;
	}
	public void setClassId(String classId) {
		ClassId = classId;
	}
	public String getSubjectId() {
		return SubjectId;
	}
	public void setSubjectId(String subjectId) {
		SubjectId = subjectId;
	}
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public AddMarks() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AddMarks [ResultId=" + ResultId + ", ClassId=" + ClassId + ", SubjectId=" + SubjectId + ", StudentId="
				+ StudentId + ", Marks=" + Marks + "]";
	}
	
}
