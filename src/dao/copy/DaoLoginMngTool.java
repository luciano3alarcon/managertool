package dao.copy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.SingleConnection;

public class DaoLoginMngTool {

	private static Connection connection;

	public DaoLoginMngTool() {
		connection = SingleConnection.getConnection();
	}

	public boolean passwordValidierung(String username, String password) throws Exception {

		String sqlStatement = "SELECT * FROM managertool WHERE " + "login = '" + username + "' and password = '"
				+ password + "'";
		PreparedStatement prepStatement = connection.prepareStatement(sqlStatement);
		ResultSet resultSet = prepStatement.executeQuery();

		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

}
