package dao.copy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.MngToolSingleConnection;

public class DaoLoginMngTool {

	private static Connection connection;

	public DaoLoginMngTool() {
		connection = MngToolSingleConnection.getConnection();
	}

	public boolean passwordValidierung(String servicemanager, String password) throws Exception {

		String sqlStatement = "SELECT * FROM datalogin WHERE servmanager = '" + servicemanager + "' and password = '"
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
