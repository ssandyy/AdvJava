package com.DAO;

import java.util.List;

import com.entities.Student;

public interface StudentDAO {
	public boolean studentRegister(Student std);
	public Student login(String rollno, String password);
	public List<Student> getAllStudentsDetails();
	public Student getStudentDetailsById(String regNo);
		
}
