package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate(
					"UPDATE seller " +
					"SET BaseSalary = 6000 " +
					"WHERE DepartmentId = 1"
					);
			
//			int x = 1;
//			if (x < 2) {
//				throw new SQLException("Fake error");
//			}
			
			int rows2 = st.executeUpdate(
					"UPDATE seller " +
					"SET BaseSalary = 3200 " +
					"WHERE DepartmentId = 2"
					);
			
			conn.commit();
			
			System.out.println("rows1 = " + rows1);
			System.out.println("rows2 = " + rows2);
		}
		catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back successfully! " +
				"What caused the transaction's rollback: " + e.getMessage());
			} catch (SQLException e2) {
				throw new DbException("Transaction rollback failed!" +
				"What caused the transaction's rollback to fail: " + e2.getMessage());
			}
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
	
}