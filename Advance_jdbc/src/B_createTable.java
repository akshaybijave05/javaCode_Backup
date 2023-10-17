
import java.sql.*;//jdbc package

public class B_createTable
{

	public static void main(String[] args) 
	{
		try {
		  	
			//load class 
			//Class.forName("com.mysql.jdbc.Driver");
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 
			 //create connection
				//String url="jdbc:mysql://localhost:3306/akshay_info";
				//String username="root";
				//String password="Maharathi@100";
				//Connection con=DriverManager.getConnection(url,username,password);
           
			 //create connection
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay_info", "root", "Maharathi@100");
			Statement stmt = con.createStatement(); //statement:super interface 
			//create query 
			stmt.executeUpdate("create table information(roll_no int,name varchar(12))");
			System.out.println("table created in db");
			con.close();//close the connection

		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
