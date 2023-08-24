package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();		
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM seller");
			
			System.out.println("Seller's data");
			System.out.println("=============");
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name") +
						", " + rs.getString("Email") + ", " + rs.getDate("BirthDate") +
						", " + rs.getDouble("BaseSalary"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			// rs.close();
			// st.close();
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
	
}