package jdbconnection;

import java.sql.*;
public class InsertQueryJdbc {
	public static void main(String[] args) throws Exception{
		
	/*
	 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection conn =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/cbse","root","");
	 * Statement st = conn.createStatement(); 
	 * int count = st.executeUpdate("INSERT INTO subject (subject_id, subject_name, subject_code) VALUES (8, 'test', 'dse')");
	 * 
	 * System.out.println(count);
	 */
		
		
		
		String url = "jdbc:mysql://localhost:3306/cbse";
		String username = "root";
		String password = "";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,username,password);
		
		/*
		 * String insertQuery = "INSERT INTO subject (subject_id, subject_name, subject_code) VALUES (?, ?, ?)";
		 * PreparedStatement ps = conn.prepareStatement(insertQuery); ps.setInt(1, 9);
		 * ps.setString(2, "Testing2"); 
		 * ps.setString(3, "test");
		 */
		
		
		String insertQuery = "INSERT INTO subject (subject_name, subject_code) VALUES (?, ?)";
		
		boolean response = true;
		PreparedStatement ps = conn.prepareStatement(insertQuery);
		
		do {
		System.out.println("Enter Subject Name : ");
		String name = new java.util.Scanner(System.in).nextLine();
		ps.setString(1, name);
		System.out.println("Enter Subject Code : ");
		String code = (new java.util.Scanner(System.in).nextLine());
		ps.setString(2, code);
		
		int rowsAffected = ps.executeUpdate();
		if(rowsAffected >0) {
			System.err.println("Data added successfully..!");
		}else {
			System.out.println("Something went wrong..!");
		}
		
		System.out.println("DO you want to add more data ? ( for (YES)--> Type : yes/1/true  OR  for(No)--> Type : no/false/0)");
		String resp = new java.util.Scanner(System.in).nextLine();
		/* response = Boolean.parseBoolean(resp); */
		if (resp.equalsIgnoreCase("no") || resp.equalsIgnoreCase("n") || resp.equalsIgnoreCase("false") || resp.equals("0")) {
			response = false; 
        }
		}
		while(response);
		System.out.println("Thanks for adding data ..!");
		
	}

}

