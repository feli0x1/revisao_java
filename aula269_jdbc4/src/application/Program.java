package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"UPDATE seller " +
					"SET BaseSalary = BaseSalary * ? " +
					"WHERE " +
					"DepartmentId = ?"
					);
			st.setDouble(1, 1.2);
			st.setInt(2, 1);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println(rowsAffected + " employees had their salary increased!");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}
	
}