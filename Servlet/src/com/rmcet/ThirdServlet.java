package com.rmcet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter in = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		session.setAttribute("sessionName", "sessionValue");
		in.println("First name "+session.getAttribute("name"));
		in.println("Last name "+session.getAttribute("lname"));
		String Qualification=request.getParameter("Qualification");
		session.setAttribute("Qname", Qualification);;
		in.println("<html>");
		in.println("<body>");
		in.println("<form action=FourthServlet >");
		in.println("marks");
		in.println("<input type=text name=mark/>");
		in.println("<input type=submit />");
		in.println("</form>");
		in.println("</body>");
		in.println("<html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
