

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uname=request.getParameter("uname");	
	String email=request.getParameter("email");
	String cc=request.getParameter("cc");
	String mobno=request.getParameter("mobno");
	String pass=request.getParameter("pass");
      Member member=new  Member(uname,email,cc,mobno,pass);
	RegisterDao rDao=new RegisterDao();
	boolean b=rDao.insert(member);
	if(b) {
		RequestDispatcher rd=request.getRequestDispatcher("signin.jsp");
		rd.forward(request, response);
	}
	else {
		RequestDispatcher rd=request.getRequestDispatcher("memberRegister.jsp");
		rd.include(request, response);
	}
	}

}
