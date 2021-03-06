package pie.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import pie.DatabaseConnector;
import pie.service.UserService;
import pie.service.UserService.LoginResult;

public class LoginServlet extends HttpServlet {
	
	private UserService userService;

	public LoginServlet() {}
	
	public LoginServlet(UserService userService) {
		this.userService = userService;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("application/json");
		response.addHeader("Access-Control-Allow-Origin", "*");
		
		Connection conn = DatabaseConnector.getConnection();

		String userEmail = request.getParameter("userEmail");
		String userPassword = request.getParameter("userPassword");

		LoginResult loginResult = userService.login(userEmail, userPassword);
		
		JSONObject responseObject = new JSONObject();
		
		for (LoginResult result : LoginResult.values()) {
			if (result == loginResult) {
				responseObject.put("result", result.toString());
				break;
			}
		}
		
		PrintWriter out = response.getWriter();
		out.write(responseObject.toString());
	}
}