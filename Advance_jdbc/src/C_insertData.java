import java.sql.*;

public class C_insertData {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay_info", "root",
					"Maharathi@100");
			
			// get the prepared statement object
			PreparedStatement psmt = con.prepareStatement("insert into information(roll_no,name)values(?,?)");
			
			// set query values
			psmt.setInt(1, 1);
			psmt.setString(2, "akshay");
			psmt.executeUpdate();
			System.out.println("insert data in db");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
