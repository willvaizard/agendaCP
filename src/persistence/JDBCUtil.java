package persistence;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class JDBCUtil {

	private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	private static String JDBC_URL = "jdbc:jtds:sqlserver://192.168.0.10:1433/agenda";
	private static String JDBC_USER = "agenda";
	private static String JDBC_PASSWORD = "recepcao";
	
	
	//private static String JDBC_URL = "jdbc:mysql://localhost/bureau";
	//private static String JDBC_USER = "root";
	//private static String JDBC_PASSWORD = "rainbow";

	
	


	private static Driver driver = null;

	public static synchronized Connection getConnection() throws SQLException {
		if (driver == null) {
			try {
				Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
				driver = (Driver) jdbcDriverClass.newInstance();
				DriverManager.registerDriver(driver);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO AO CONECTAR AO BANCO DE DADOS", JOptionPane.ERROR_MESSAGE);
				
			}
		}
		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	}

	public static void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

}
