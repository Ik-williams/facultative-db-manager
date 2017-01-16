package com.ginee.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class testdb
 */
@WebServlet("/testdb")
public class testdb extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = "adminfaculty";
		String password = "adminfaculty";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/faculty_db?useSSL=false";
		
		String driver = "com.mysql.jdbc.Driver";
		
		try{
			
			PrintWriter out = response.getWriter();
			out.println("connecting to database "+ jdbcUrl);
			
			Class.forName(driver);
			Connection myConnection = DriverManager.getConnection(jdbcUrl, user, password);
			
			out.println("success!!!");
			myConnection.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new ServletException();
		}
	}

}
