import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private final String dbServer = "prometheus.dmst.aueb.gr";
	private final String dbServerPort = "3306";
	private final String dbName = "stavros_pesvres";
	private final String dbusername = "stavros";
	private final String dbpassword = "jihg76463";
	private Connection con = null;
	public Connection getConnection() throws Exception {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();  

		} catch (Exception e) {

			throw new Exception("SQL Server Driver error: " + e.getMessage());
		}

		try {

			con = DriverManager.getConnection("jdbc:sqlserver://" 
				+ dbServer + ":" + dbServerPort + "/" + dbName, dbusername, dbpassword);
			return con;

		} catch (Exception e) {
			throw new Exception("Could not establish connection with the Database Server: " 
				+ e.getMessage());
		}

	} 
	public void close() throws SQLException {

		try {

			
			if (con != null)
				con.close(); 

		} catch (SQLException e) {

			throw new SQLException("Could not close connection with the Database Server: " 
				+ e.getMessage());
		}

	}

} 
