import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class F_deleteData
{

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay_info", "root", "Maharathi@100");
	        Statement stmt=con.createStatement();
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        while(true)
	        {
	          System.out.println("enter delete record roll_no");
	          int id=Integer.parseInt(br.readLine());
	          stmt.executeUpdate("delete from information where roll_no="+id); 
	          System.out.println("recored deleted successful");
	          System.out.println("do yo want again record delete[yes/no]");
	          String ch=br.readLine();
	          if(ch.equals("no"))
	            break;
	        }
	        con.close();
	        
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		

}
