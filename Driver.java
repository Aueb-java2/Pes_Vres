import java.sql.*;

public class Driver {

	public static void questionDB(String s) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();  

		} catch (Exception e) {

			throw new Exception("MySQL Driver error: " + e.getMessage());
		}
		try {
			Connection myConn = DriverManager.getConnection(
					"jdbc:mysql://prometheus.dmst.aueb.gr/stavros_pesvres",
					"stavros" , "jihg76463");
			PreparedStatement myStmt = myConn.prepareStatement("SELECT DISTINCT QuizQuestion "
					+ "FROM Question "
					+ "WHERE QuestionID = ?");
			myStmt.setString(1, s);
			ResultSet myRs = myStmt.executeQuery();
			while (myRs.next()) {
				Countdown.question = myRs.getString("QuizQuestion");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
	public static void answerDB(String s) throws SQLException {
		
		try {
			Connection myConn = DriverManager.getConnection(
					"jdbc:mysql://prometheus.dmst.aueb.gr/stavros_pesvres",
					"stavros" , "jihg76463");
			PreparedStatement myStmt = myConn.prepareStatement("SELECT DISTINCT Answer, Points "
					+ "FROM Choice AS C, Question AS Q "
					+ "WHERE C.QuestionID = Q.QuestionID AND Q.QuestionID = ?");
			myStmt.setString(1, s);
			ResultSet myRs = myStmt.executeQuery();
			int i = 0;
			while (myRs.next() && i < 10) {
				Countdown.answers[i] = myRs.getString("Answer");
				Countdown.points[i] = myRs.getInt("Points");
				i++;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}			
}
