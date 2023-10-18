import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		String sen = "welcome to rnt";
		sen = sen + " ";
		String revsen = "", word = "";

		for (int i = 0; i < sen.length(); i++) {
			char ch = sen.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				revsen = word + " " + revsen;
				word = "";
			}
		}
		System.out.println(revsen);

	}

}
