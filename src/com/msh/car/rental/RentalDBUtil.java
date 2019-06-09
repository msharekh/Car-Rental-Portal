package com.msh.car.rental;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.msh.car.rental.Car;;

public class RentalDBUtil {

	private DataSource dataSource;

	public RentalDBUtil(DataSource dataSource) {

		this.dataSource = dataSource;
	}

	public List<Car> getCars() throws Exception {

		List<Car> cars = new ArrayList<>();

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// get a connection
			con = dataSource.getConnection();

			// create sql statement
			String sql = "SELECT * FROM car";

			// execute query
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			// process result set
			while (rs.next()) {

				// Retrieve data from row
				int carId = rs.getInt("car_id");
				String carName = rs.getString("car_name");

				// create new student object
				Car car = new Car(carId, carName);

				// add it to list
				cars.add(car);

			}
//			System.out.println("cars cnt: " + cars.size());
			// close JDBC objects

		} finally {
			// TODO: handle finally clause
			close(con, stmt, rs);
		}

		return cars;

	}

	private void close(Connection con, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void addCustomer(Customer customer) throws Exception {
		Connection con = null;
		PreparedStatement stmt = null;

		try {
			con = dataSource.getConnection();

			stmt = con.prepareStatement("INSERT INTO customer " + "(customer_name) values" + "(?)");
			stmt.setString(1, customer.getCustomerName());
			stmt.execute();

		} finally {
			close(con, stmt, null);
		}
	}

	public void addCar(Car car) throws Exception {

		Connection con = null;
		PreparedStatement stmt = null;

		try {

			// create sql to insert
			con = dataSource.getConnection();
			String sql = "INSERT INTO car " + "(car_name )" + "values " + "(?)";

			stmt = con.prepareStatement(sql);

			// set params - note it is one base not zero base
			stmt.setString(1, car.getCarName());

			// execute sql insert
			stmt.execute();

		} finally {
			// clean up JDBC
			close(con, stmt, null);
		}

	}

	public void deleteCar(String carId) throws Exception {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement stmt = null;

		try {

			// create sql to insert
			con = dataSource.getConnection();
			String sql = "DELETE FROM car WHERE car_id = ?";

			stmt = con.prepareStatement(sql);

			// set params - note it is one base not zero base
			stmt.setString(1, carId);

			// execute sql insert
			stmt.execute();

		} finally {
			// clean up JDBC
			close(con, stmt, null);
		}
	}

}
