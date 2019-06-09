package com.msh.car.rental;

import java.sql.*;

public class TestSql {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// register and load driver
//		Class.forName("com.mysql.jdbc.Driver");

//		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
		
		String url = "jdbc:mysql://localhost:3306/car_rental";
//		String url = "jdbc:mysql://localhost:3306/car_rental?useSSL=false&amp;serverTimezone=UTC";
		
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
