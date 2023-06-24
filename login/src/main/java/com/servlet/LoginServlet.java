package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			Class.forName("com.mysql.cj.jdbc.driver");
			try {
				Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3006/mydata", "root", "raja");
				String n = request.getParameter("txtName");
				String p = request.getParameter("txtPwd");
				PreparedStatement ps = con.prepareStatement("select uname from login where name =? and password =?"  );
				ps.setString(1, n);
				ps.setString(2, p);
				 ResultSet rs = ps.executeQuery();
				 if(rs.next()) {
					 RequestDispatcher rd =request.getRequestDispatcher("welcome.jsp");
					 rd.forward(request, response);
				 }else {
					 out.println("<font color red size = 18 >Login Failed!!<br>");
					 out.println("<a href=login.jsp> Tyr Again</a>");

				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
