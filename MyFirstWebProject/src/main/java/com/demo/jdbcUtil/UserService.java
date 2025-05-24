package com.demo.jdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {
	public static boolean verifyUser(String username, String password) {
		String query = "SELECT * FROM user WHERE user_name=? AND password=?";

		try (Connection connection = JdbcUtilMyBook.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			return rs.next(); // returns true if a matching user is found
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}
	public static void insert( String username, String password) {
		String query = "INSERT INTO user (user_name, password) VALUES (?, ?)";
		try (Connection connection = JdbcUtilMyBook.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setString(1, username);
			ps.setString(2,password);
			
			int record = ps.executeUpdate();
			if (record == 1) {
				System.out.println("Record inserted");
			} else {
				System.out.println("Record not inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace(); 
		}
	}

}
