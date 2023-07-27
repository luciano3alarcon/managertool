package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.copy.DaoLoginMngTool;

@WebServlet("/LoginMngToolServlet")
public class LoginMngToolServlet {

	private static final long serialVersionUID = 1L;

	private DaoLoginMngTool daoLoginMngTool = new DaoLoginMngTool();

	public LoginMngToolServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	private void doPost(HttpServletRequest request, HttpServletResponse response) {

		try {
			String username = request.getParameter("login");
			String password = request.getParameter("password");
			if(this.daoLoginMngTool.passwordValidierung(username, password)) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("mngtooluebersicht.jsp");
				dispatcher.forward(request, response);
			}else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("accessdenied.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
