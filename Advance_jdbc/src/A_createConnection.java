
//import java.sql.Connection;
//import java.sql.DriverManager;

import java.sql.*;//jdbc package

public class A_createConnection {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// load the driver
			String url = "jdbc:mysql://localhost:3306/akshay_info";
			String username = "root";
			String password = "Maharathi@100";
			Connection con = DriverManager.getConnection(url, username, password);// create a connection

			if (con.isClosed())// close connection
			{
				System.out.println("connection is closed");
			} else {
				System.out.println("connection is created");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
