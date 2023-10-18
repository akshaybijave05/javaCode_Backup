package D_FileHandling;

//file detele opration we can any file,folder delete

import java.io.*;

public class D_FileDelete {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\HP\\OneDrive\\Desktop\\Akshay.tex");
		
		if (f.delete())// delete() method used to delete any file or folder etc..
		{
			System.out.println(f.getName() + " - file deleted");
		} else {
			System.out.println("Failed to delete the file");
		}

	}

}
