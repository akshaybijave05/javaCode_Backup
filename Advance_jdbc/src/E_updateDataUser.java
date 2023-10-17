import java.util.*;
import java.sql.*;

public class E_updateDataUser
{
	public static void main(String[] args)
	 {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay_info","root","Maharathi@100");
			//String q="update info set name=? where id=?";
			Scanner s=new Scanner(System.in);
			System.out.println("enter update name");
			String name=s.nextLine();
			System.out.println("enter update id ");
			int id=Integer.parseInt(s.nextLine());
			PreparedStatement psmt=con.prepareStatement("update information set name=? where roll_no=?");
		    psmt.setString(1,name);
		    psmt.setInt(2,id);
		    psmt.executeUpdate();		
			System.out.println("data update by user mode");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
