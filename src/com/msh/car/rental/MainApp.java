package com.msh.car.rental;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
		// check_database();

		checkSimpleCode();
	}

	private static void checkSimpleCode() {
		// TODO Auto-generated method stub
		System.out.println("START.....1");

		String personName = "Mona";

		System.out.println("END.......2");
	}

	private static void check_database() throws SQLException {
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);

		String url = "jdbc:mysql://localhost:3306/car_rental";
		// String url =
		// "jdbc:mysql://localhost:3306/car_rental?useSSL=false&amp;serverTimezone=UTC";

		String user = "car_rental_user";
		String password = "car_rental_user";
		String sql = "select * from car";

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		if (rs.next()) {
			String car_name = rs.getString("car_name");
			System.out.println("car_name: " + car_name);
		}
	}

}
