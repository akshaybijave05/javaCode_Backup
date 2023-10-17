import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		
		for(int i = 0; i < 4; i++) {
        	for(int j = 4-1; j >= 0; j--) {
        		if(j > i)
        		{
        			System.out.print(" ");
        		}
        		else {
        			System.out.print("*");
        			
        		}
        	}
        	System.out.println();
        }
		
	}
}