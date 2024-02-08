package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	String url = "jdbc:mysql://localhost:3306/servlet";
	String username= "root";
	String password = "";
	
	public boolean check(String uname, String pass) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = conn.prepareStatement("select * from loginservlet where uname=? and pass=?");
			ps.setString(1, uname);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				return true;
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
