package com.msh.car.rental;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private RentalDBUtil rentalDBUtil;

	@Resource(name = "jdbc/car_rental")

	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
 		
		rentalDBUtil = new RentalDBUtil(dataSource);

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
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
				listCustomers(request, response);
				break;
			case "ADD":
				addCustomer(request, response);
				break;
//			case "LOAD":
//				loadStudent(request, response);
//				break;
//			case "UPDATE":
//				updateStudent(request, response);
//				break;
			case "DELETE":
				deleteCustomer(request, response);
				break;
			default:
				listCustomers(request, response);
				break;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
		Object customerId = null;
		// TODO Auto-generated method stub
		rentalDBUtil.deleteCustomer(customerId);
		
	}

	private void listCustomers(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		List<Customer> customers  = rentalDBUtil.getCustomers();
		request.setAttribute("CUSTOMER_LIST", customers);

		String path = "customers.jsp";
		RequestDispatcher dispatcher =request.getRequestDispatcher(path);
		
	}

	private void addCustomer(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String customerName = request.getParameter("customerName");
		Customer customer = new Customer(customerName);
		rentalDBUtil.addCustomer(customer); 
		
		listCars(request, response);

	}

 }
