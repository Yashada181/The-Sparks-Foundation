package com.yashada;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/save")
public class FirstWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usrname=request.getParameter("username");
		String pwd=request.getParameter("password");
		PrintWriter pw=response.getWriter();
		if(usrname.equals("yashada") && pwd.equals("yasha"))
		{
			String myhtml = "<html><head><title>Login page Result</title><link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\"></head>";
			myhtml+="<body><h1 style=\"color:green;text-align:center\">LOGIN SUCCESSFUL</h1></body>";
			
			pw.println(myhtml);
		}
		else
		{
			String myhtml = "<html><head><title>Login page Result</title><link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\"></head>";
			myhtml+="<body><h1 style=\"color:red;text-align:center\">INVALID LOGIN</h1></body>";
			pw.println(myhtml);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
