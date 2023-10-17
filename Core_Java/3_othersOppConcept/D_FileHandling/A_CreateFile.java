package D_FileHandling;
/*file handling defines how we can read & write data on a file is called as file handling.
 java IO package contains all the classes through which we can performed all input & output 
 operations in the file.*/
//create file
import java.io.*; //* means all file classes used.
public class A_CreateFile
{

	public static void main(String[] args)// throws IOException   //by using throws
	{
	  File obj=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Akshay.tex");//file is super class
	  try
	  {
		  if(obj.createNewFile())//createNewFile() it's file handling method for creating new file
		  {
			  System.out.print("file successful created");
		  }
		  else
		  {
			  System.out.println("file already exists!");
		  } 
	  }
	  catch(IOException i)
	  {
		  System.out.println("exception handled!");
		  
	  }
	 

	}

}
