
//select*from emp; program
import java.sql.*;
import java.sql.DriverManager;

public class D_showData {
	public static void main(String[] args) {
		
		try {
			// load class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay_info", "root",
					"Maharathi@100");
			Statement stmt = con.createStatement();
			
			// call statement
			ResultSet set = stmt.executeQuery("select*from information");
			
			// process data
			while (set.next()) {
				int id = set.getInt(1);// column no.or clmn name get
				String name = set.getString(2);
				System.out.println("id is:" + id);
				System.out.println("name is:" + name);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
