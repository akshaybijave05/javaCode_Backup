package D_FileHandling;

//Write on file__

import java.io.*;

public class B_WriteFile {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\Akshay.tex");
			// FileWriter it's class
			fw.write("Welcome to javaTpoint.");// write() method help write on file
			fw.close(); // close() method (security purpose used)
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Success...");
	}

}
