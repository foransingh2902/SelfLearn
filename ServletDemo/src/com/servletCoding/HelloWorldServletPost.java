package com.servletCoding;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/HelloWorldServletPost")
public class HelloWorldServletPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int hitCount;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldServletPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init() {
		// Reset hit counter.
		hitCount = 0;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		++hitCount;
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// Step 1. set the content type
		response.setContentType("text/html");
		// browser will now know that we have sent .html data back as response
		// Step 2. set the printwriter
		PrintWriter out = response.getWriter();
		// Step 3. generate Html content
		out.println("<html><body>");
		out.println("<h2>Hello World <h2>");
		out.println("count is :" + hitCount);
		out.println("Time on the server is :" + new java.util.Date());
		out.println("</body></html>");
	}
}
