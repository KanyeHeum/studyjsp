package ch02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet01")
public class HelloServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		
		try{
			PrintWriter out = response.getWriter();
			out.println("<HTML>");
			out.println("<HEAD><TITLE>처음작성하는 Servlet</TITLE></HEAD>");
			out.println("<BODY>");
			out.println("처음 작성하는 Servlet");
			out.println("</BODY>");
			out.println("</HTML>");
			out.close();
		}catch(Exception e){
			getServletContext().log("Error in HelloServlet:",e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
