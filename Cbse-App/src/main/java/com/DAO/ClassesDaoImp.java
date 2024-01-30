package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DB.DbConnect;
import com.entities.Classes;


public class ClassesDaoImp implements ClassesDoa {
	private Connection conn;
	
	
	public ClassesDaoImp() {
		super();
		this.conn = DbConnect.getConn();
	}
	


	@Override
	public List<Classes> getAllClasses() {
			List<Classes> list = new ArrayList<Classes>();
			Classes cls=null;
			
			try {
			String sql = "select * from classes"; 
			PreparedStatement  ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					cls=new Classes();
					cls.setClassId(rs.getInt(1));
					cls.setClassz(rs.getInt(2));
					cls.setClassName(rs.getString(3));
					

					list.add(cls);
	            }
	        
			}catch (SQLException e) {
	            e.printStackTrace();
	        }catch(Exception e) {
	        	e.printStackTrace();
	        }
	        return list;
			
		}
}
	
