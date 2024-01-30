package com.entities;

public class Classes {
	private int ClassId;
	private int Classz;
	private String ClassName;
	public int getClassId() {
		return ClassId;
	}
	public void setClassId(int classId) {
		ClassId = classId;
	}
	public int getClassz() {
		return Classz;
	}
	public void setClassz(int classz) {
		Classz = classz;
	}
	public String getClassName() {
		return ClassName;
	}
	public void setClassName(String className) {
		ClassName = className;
	}
	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Classes [ClassId=" + ClassId + ", Class=" + Classz + ", ClassName=" + ClassName + "]";
	}
}
