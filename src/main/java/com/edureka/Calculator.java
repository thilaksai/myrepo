package com.edureka;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {

	private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        int a1= Integer.parseInt(request.getParameter("n1"));
        int a2= Integer.parseInt(request.getParameter("n2"));
        if(request.getParameter("r1")!=null)
        {
            out.println("<h1>Addition</h1>"+(a1+a2));
        }
        if(request.getParameter("r2")!=null)
        {
            out.println("<h1>Substraction</h1>"+(a1-a2));
        }
        if(request.getParameter("r3")!=null)
        {
            out.println("<h1>Multiplication</h1>"+(a1*a2));
        }if(request.getParameter("r1")!=null)
        {
            out.println("<h1>Division</h1>"+(a1/a2));
        }
        }
        catch(Exception e)
        {

        }
    }
      public int add(int a, int b) {
            return a + b ;
        }

	public int sub(int a, int b) {
            return a - b;
        }
	public int mul(int a, int b) {
            return a * b ;
        }
}
