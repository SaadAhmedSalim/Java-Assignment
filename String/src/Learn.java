/**
 * 
 */

/**
 * @author saad
 *
 */
public class Learn {
	
	public static void main(String[]arg) {
		
		//  Write a Java program to get the character at the given index within the String
		
		String s1 = "Saad Ahmed Salim";
		System.out.println("My Original String is: "+s1);
		
		int a = s1.charAt(0);
		System.out.println("0 position character is: "+(char)a);
		
		/** Write a Java program to compare two strings lexicographically. 
			Two strings are lexicographically equal if they are the same length and 
			contain the same characters in the same positions. */
		String s2 = " A Pythonist.";
		
		int result = s1.compareTo(s2);
		
		if(result<0) {
			System.out.println(s1 +" is less than "+s2);
		}else if(result==0) {
			System.out.println(s1 +" equals to "+s2);
		}else {
			System.out.println(s1 +" is greater than "+s2);
		}
		
		// Write a Java program to concatenate a given string to the end of another string.
		
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		// Convert all the characters in a string to uppercase
		
		String s4 = s3.toUpperCase();
		System.out.println("All in Upper case: "+s4);
		
		// Get a substring of a given string between two specified positions
		
		String s5 = s1.substring(5, 10);
		System.out.println("Specified string: "+s5);
	}

}
