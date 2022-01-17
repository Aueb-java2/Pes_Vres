import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class Queries {
	
	public static void category() throws SQLException{
		
		List<String> categories= new ArrayList<String>();
		DatabaseConnection dbcon = new DatabaseConnection();
		Statement myStmt = null;
		ResultSet myRs = null;
	
		try {	
			Connection con = dbcon.getConnection();
			myStmt = con.createStatement();
			myRs = myStmt.executeQuery("SELECT * FROM Category");
			while (rs.next()) {
					categories.add(new String(rs.getString("categoryName")))
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
		for (String c : categories){
			System.out.println(categories.getName());
		}
	}
	
}
