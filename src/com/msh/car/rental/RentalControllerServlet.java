package com.msh.car.rental;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.msh.car.rental.Car;
import com.msh.car.rental.RentalDBUtil;

/**
 * Servlet implementation class RentalControllerServlet
 */
@WebServlet("/RentalControllerServlet")
public class RentalControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private RentalDBUtil rentalDBUtil;

	@Resource(name = "jdbc/web_car_rental")

	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		try {

			rentalDBUtil = new RentalDBUtil(dataSource);

		} catch (Exception e) {
			// TODO: handle exception
//			throw new ServerException(e);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {
			System.out.println("----------START TRY------------");

			// read the command parameter
			String cmd = request.getParameter("command");

			System.out.println("cmd: " + cmd);

			// if the command missing
			if (cmd == null) {
				cmd = "LIST";
			}

			// route to method
			switch (cmd) {
			case "LIST":
				listCars(request, response);
				break;
			case "ADD":
				addCar(request, response);
				break;
//			case "LOAD":
//				loadStudent(request, response);
//				break;
//			case "UPDATE":
//				updateStudent(request, response);
//				break;
//			case "DELETE":
//				deleteStudent(request, response);
//				break;
			default:
				listCars(request, response);
				break;
			}

			//

		} catch (Exception e) {
			// TODO: handle exception

			throw new ServerException(e.getMessage());
		}
	}

	private void listCars(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		// get students from db util
		List<Car> cars = rentalDBUtil.getCars();
		// add students to the request
		request.setAttribute("CAR_LIST", cars);

		// send request to JSP page
		RequestDispatcher dispatcher = request.getRequestDispatcher("list-cars.jsp");
		dispatcher.forward(request, response);
	}

	private void addCar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		// read student info from form
		String carName = request.getParameter("carName");

		// create student object
		Car car = new Car(carName);

		// add student to database
		rentalDBUtil.addCar(car);

		// send back to main page
		listCars(request, response);
	}

}
