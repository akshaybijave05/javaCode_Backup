import java.sql.*;

public class E_updateData {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay_info", "root",
					"Maharathi@100");
			
			PreparedStatement psmt = con.prepareStatement("update information set name='akshaybijave' where roll_no=1");
			psmt.executeUpdate();
			System.out.println("update data");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
