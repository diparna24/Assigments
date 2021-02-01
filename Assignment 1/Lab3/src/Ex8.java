/**Create a method that accepts a String and checks if it is a positive string. 
*  A string is considered a positive string, if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order.
*  @diparna
*/


import java.util.*;
public class Ex8 {
public static void main(String[] args) {
	String str = getInputString();
	if(checkString(str)) {
		System.out.println(str+" is positive string");
	}
	else {
		System.out.println(str+" is not a positive string");
	}
	
}
private static boolean checkString(String str) {
	int length = str.length();
	char [] array = str.toCharArray();
	char beforeChar=array[0];
	for(int index=0;index<length;index++) {
		if(array[index]<beforeChar) {
			return false;
		}
		beforeChar = array[index];
	}
	return true;
}
private static String getInputString() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String ");
	String str = sc.nextLine();
	return str;
}
}