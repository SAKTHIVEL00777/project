package com.techymeet.webtechnology.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher rd=request.getRequestDispatcher("login.html");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//step-1 Normal Object creation 
	   //LoginOne lo=new LoginOne();
	   //lo.doPost(request, response);
	    
	    //step-2 to call the another servlet
		HttpSession session=request.getSession();
	   session.setAttribute("location", "Chennai");
		
		request.setAttribute("gender", "Male");
		
	    RequestDispatcher rd=request.getRequestDispatcher("loginOne");
	    rd.forward(request, response);
	    
	    //step-3 send redirect
		//response.sendRedirect("https://www.myjobbie.com/");
	}

}
