package D_string;

public class C_StringOperations {

	public static void main(String[] args) {
		
		String s = " akshay ";
		String s1 = "bijave";
		int a = 10;

		// string operation
		System.out.println("given string is:\n akshay  ");
		System.out.println(".length();return length of string:\n" + s.length());// length() return length of string
		System.out.println(".toLowerCase();return lower case string\n" + s.toLowerCase());
		System.out.println(".toUpperCase();return upper case string\n" + s.toUpperCase());
		System.out.println(".trim();remove all spaces  from string\n" + s.trim());
		System.out.println(".substring();returning a substring from start with you enter index\n" + s.substring(3));
		System.out.println(".substring();return a substring from start to the end\n" + s.substring(3, 6));
		System.out.println("replace();return a new string after replace\n" + s.replace('y', 'a'));
		System.out.println(".startWith();case are match  then true othewise false\n" + s.startsWith(" ak"));
		System.out.println(".endWith();case are match then true otherwise false\n" + s.endsWith("abc"));
		System.out.println(".charAt();return character at given index position\n" + s.charAt(5));
		System.out.println(".indexOf();return the index of the given string\n" + s.indexOf("a"));
		System.out.println(".indexOf();return the index of the given string before index\n" + s.indexOf("a"));
		System.out.println(".lastIndexOf();return the last index of the given  string\n" + s.lastIndexOf("a"));
		System.out.println(".equals();string is equal then true otherwise false\n" + s.equals(" akshay  "));
		System.out.println(".concat();new string add\n" + s.concat("bijave"));
		System.out.println(".compareTo();its compare the unicode values\n" + s.compareTo(s));
		System.out.println(".compareTo();its compare the unicode values and return unicode values\n" + s.compareTo(s1));
		System.out.println(".isEmpty();check empty or not and result true or false\n" + s.isEmpty());
		

	}

}
