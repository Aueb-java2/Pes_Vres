import java.sql.*;

public class Driver {

	@SuppressWarnings("finally")
	public static Statement connectToDB() throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		
			try {
				myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PesVres", "root" , "t8180046");
				myStmt = myConn.createStatement();
			}
			finally {
				if (myConn != null) {
					myConn.close();
				}
				
				if (myStmt != null) {
					myStmt.close();
				}
				return myStmt;
			}
	}		
			
}