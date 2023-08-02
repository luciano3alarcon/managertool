package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MngToolSingleConnection {

//	Die URL-Verbidung mit PostGresql verläuft in WIN 11 übers Port 5431. Das Port wurde von mir neu konfiguriert
	private static String dataBank = "jdbc:postgresql://locahost:5431/managertool?autoReconnect=true";
	private static String username = "postgres";
	private static String password = "admin";
	private static Connection connection = null;

	static {
		verbinden();
	}

	public MngToolSingleConnection() {
		verbinden(); 
	}

	private static void verbinden() {

		try {
			if(connection == null) {
				Class.forName("org.postgreslq.Driver");
				connection = DriverManager.getConnection(dataBank, username, password);
				connection.setAutoCommit(false);
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException("Fehler ist bei DB-Verbindung passiert. Siehe Class SingleConnection.");
			
		}
	}

	public static Connection getConnection() {
		return connection;
	}
}
