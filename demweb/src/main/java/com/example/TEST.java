package com.example;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TEST
 */
@WebServlet("/TEST")
public class TEST extends HttpServlet {
	public void init() throws ServletException {
		ServletContext context = getServletContext();
		if (context.getAttribute("Đếm") == null) {
			context.setAttribute("Đếm", 0);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context = getServletContext();
		Integer visitCount = (Integer) context.getAttribute("Đếm");
		visitCount++;
		context.setAttribute("Đếm", visitCount);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
        out.println("<h1>Visit Counter Servlet</h1>");
        out.println("<p>Number of visits: " + visitCount + "</p>");
        out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
