package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.DB.DbConnect;
import com.entities.Results;

public class ResultsDaoImp implements ResultDao{
	private Connection conn;

    public ResultsDaoImp() {
        super();
        this.conn = DbConnect.getConn();
    }

	@Override
	public boolean AddResultMarks(Results results) {
		boolean f = false;
        try {
            String sql = "insert into results(registrationNo, hindi, english, maths, science, socialscience) values (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, results.getRegistrationNo());
            ps.setInt(2, results.getHindi());
            ps.setInt(3, results.getEnglish());
            ps.setInt(4, results.getMaths());
            ps.setInt(5, results.getScience());
            ps.setInt(6, results.getSocialScience());
            
            int i = ps.executeUpdate();
            if(i==1) {
				f=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public List<Results> getAllStudentResults() {
		List<Results> list = new ArrayList<Results>();
		Results rsl = null;
		try {
			String sql = "select * from results";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				rsl=new Results();
				rsl.setRegistrationNo(rs.getString(1));
				rsl.setHindi(rs.getInt(2));
				rsl.setEnglish(rs.getInt(3));
				rsl.setMaths(rs.getInt(4));
				rsl.setScience(rs.getInt(5));
				rsl.setSocialScience(rs.getInt(6));
				list.add(rsl); 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	
	
	public String getStudentResult(String regno) {
			try {
				String sql = "select * from student inner join results where student.registrationNo=results.registrationNo and student.registrationNo='"+regno+"'";
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					rs.getInt(1);
					rs.getString(2);
					rs.getString(3);
					rs.getString(4);
					rs.getString(5);
					rs.getString(6);
					rs.getString(7);
					rs.getString(8);
					rs.getInt(9);
					rs.getInt(10);
					rs.getString(11);
					rs.getInt(17);
					rs.getInt(18);
					rs.getInt(19);
					rs.getInt(20);
					rs.getInt(21);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return regno;
		}
	}
	