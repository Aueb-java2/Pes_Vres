import java.sql.*;

public class DBelements {
	
	public void categories() throws SQLException {
			
		Statement myStmt = Driver.connectToDB();
		ResultSet myRs = null;
		
		try {		
			myRs = myStmt.executeQuery("select * from Category");
			while (myRs.next()) {
				System.out.println(myRs.getString(myRs.getString("CategoryName")));
			}
		}	
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
		}
	}
	
	/* λοιπές μέθοδοι για την ανάκτηση των υπόλοιπων στοιχείων από τη βάση*/
}