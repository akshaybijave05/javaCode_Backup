import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class C_insertDataUser {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay_info", "root",
					"Maharathi@100");
			
			// get the prepared statement object
			PreparedStatement psmt = con.prepareStatement("insert into information(roll_no,name)values(?,?)");
			
			// user input like Scanner class
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while (true)// many record inserted.
			{
				
				// inser data by user
				System.out.println("enter id");
				int id = Integer.parseInt(br.readLine());// bufferedReader only allow to string so converted into string
				System.out.println("enter name");
				String name = br.readLine();
				// set the values to table sequence
				psmt.setInt(1, id);
				psmt.setString(2, name);
				psmt.executeUpdate();
				System.out.println("data inserted");
				System.out.println("do you want insert more record...yes/no");
				String ch = br.readLine();
				
				if (ch.equalsIgnoreCase("no"))
					break;

			}
			con.close();// connection close
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
