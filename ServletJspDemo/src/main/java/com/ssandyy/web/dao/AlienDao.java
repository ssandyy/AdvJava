package com.ssandyy.web.dao;

import java.sql.*;


import com.ssandyy.web.model.Alien;


public class AlienDao {
	
	public Alien getAlien(int aidtest) {
		
		Alien a = new Alien();
		/*
		 * a.setAidtest(201); a.setAnametest("hello"); a.setAsaltest("366665");
		 */
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/neonhiber", "root", "");
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from alien_test where aidtest="+aidtest);
			
			while(rs.next()) {
				a.setAidtest(aidtest);
				a.setAnametest(rs.getString("anametest"));
				a.setAsaltest(rs.getString("asaltest"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return a;
	}
	
}
