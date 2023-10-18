package D_FileHandling;

//read data from a file 

import java.io.*;

public class C_FileRead {
	
	public static void main(String[] args) throws IOException// throws bypass
	{    
		// FileReader is a class
		FileReader obj = new FileReader("C:\\Users\\HP\\OneDrive\\Desktop\\Akshay.txt");

		int i;
		
		while ((i = obj.read()) != -1)// read() read the character by character and return int form values
			System.out.print((char) i);// character return
		obj.close();
	}
	
}
