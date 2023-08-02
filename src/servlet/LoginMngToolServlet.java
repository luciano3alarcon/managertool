package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.copy.DaoLoginMngTool;

@WebServlet("/managertool/LoginMngToolServlet")
public class LoginMngToolServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private DaoLoginMngTool daoLoginMngTool = new DaoLoginMngTool();

	public LoginMngToolServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String servicemanager = request.getParameter("servicemanager");
			String password = request.getParameter("password");

			if (this.daoLoginMngTool.passwordValidierung(servicemanager, password)) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("mngtooluebersicht.jsp");
				dispatcher.forward(request, response);
			}else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("accessdenied.jsp");
				dispatcher.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
