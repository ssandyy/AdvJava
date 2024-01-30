package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DB.DbConnect;
import com.entities.Student;


public class StudentDaoImp implements StudentDAO {
	
	private Connection conn;
	
	
	public StudentDaoImp() {
		super();
		this.conn = DbConnect.getConn();
	}
	

	@Override
	public boolean studentRegister(Student std) {
		boolean f = false;
		try {
			String sql = "insert into student(fname, lname, Dob, gender, address, phone, fathername, classId,  rollno, password) values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps =conn.prepareStatement(sql);
			ps.setString(1, std.getFirstName());
			ps.setString(2, std.getLastName());
			ps.setString(3, std.getDob());
			ps.setString(4, std.getGender());
			ps.setString(5, std.getAddress());
			ps.setString(6, std.getPhone());
			ps.setString(7, std.getAddress());
			ps.setInt(8, std.getClassId());
			ps.setString(9, std.getRollNo());
			ps.setString(10, std.getPassword());
//			ps.setString(11, std.getRegistrationNo());
			
			
			
			/*
			 * String sql2 = "insert int classes(classSection) values(?)"; PreparedStatement
			 * ps2 = conn.prepareStatement(sql2); ps2.setString);
			 */
			
			
			int i = ps.executeUpdate();
			if(i==1) {
				f=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return f;
	}
	

	@Override
	public Student login(String rollno, String password) {
		Student std=null;
		try {
			String sql = "select * from student where rollno=? and password=?";
			PreparedStatement  ps = conn.prepareStatement(sql);
			ps.setString(1, rollno);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				std=new Student();
				std.setStudentId(rs.getInt(1));
				std.setFirstName(rs.getString(2));
				std.setLastName(rs.getString(3));
				std.setDob(rs.getString(4));
				std.setGender(rs.getString(5));
				std.setFatherName(rs.getString(6));
				std.setPhone(rs.getString(7));
				std.setAddress(rs.getString(8));
				std.setClassId(9);
				std.setRollNo(rs.getString(10));
				//((Object) std).setRegistrationNo(rs.getString(10));
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return std;
	}
	
	public List<Student> getAllStudentsDetails(){
		List<Student> list = new ArrayList<Student>();
		Student std=null;
		
		try {
		String sql = "select * from student"; 
		PreparedStatement  ps = conn.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				std=new Student();
				std.setStudentId(rs.getInt(1));
				std.setFirstName(rs.getString(2));
				std.setLastName(rs.getString(3));
				std.setDob(rs.getString(4));
				std.setGender(rs.getString(5));
				std.setFatherName(rs.getString(6));
				std.setPhone(rs.getString(7));
				std.setAddress(rs.getString(8));
				std.setClassId(rs.getInt(9));
				std.setRollNo(rs.getString(10));
				std.setRegistrationNo(rs.getString(11));
				std.setPassword(rs.getString(12));
				list.add(std);
            }
        
		}catch (SQLException e) {
            e.printStackTrace();
        }catch(Exception e) {
        	e.printStackTrace();
        }
        return list;
		
	}
	
	@Override
	public Student getStudentDetailsById(String regNo) {
		Student std=null;
		try {
			String sql = "select * from student where registrationNo=regNo";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				std=new Student();
				std.setStudentId(rs.getInt(1));
				std.setFirstName(rs.getString(2));
				std.setLastName(rs.getString(3));
				std.setDob(rs.getString(4));
				std.setGender(rs.getString(5));
				std.setFatherName(rs.getString(6));
				std.setPhone(rs.getString(7));
				std.setAddress(rs.getString(8));
				std.setClassId(rs.getInt(9));
				std.setRollNo(rs.getString(10));
				std.setRegistrationNo(rs.getString(11));
				std.setPassword(rs.getString(12));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return std;
	}

}
