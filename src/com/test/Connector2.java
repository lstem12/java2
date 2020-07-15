package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector2 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String id = "c##test";
			String pwd = "test";
			Connection conn = DriverManager.getConnection(url,id,pwd);
			Statement stmt = conn.createStatement();
			String sql = "select * from lent";
			ResultSet rs = stmt.executeQuery(sql);	
			/*while(rs.next()) {
				System.out.print(rs.getInt("num")+",");
				System.out.print(rs.getString("name")+",");
				System.out.print(rs.getString("id"));
				System.out.println();
			}*/	
			//int result = stmt.executeUpdate(sql);
			//System.out.println("실행 결과 반영 개수  :"+result);
			System.out.println(rs);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
