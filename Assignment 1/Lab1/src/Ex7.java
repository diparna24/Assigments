
/** Lab Book 1 Exercise 7
 * @author DIPARNA BISWAS
 * Create a method to check if a number is an increasing number
 */

import java.util.* ;
public class Ex7 {

public static void main(String args[]) {
      int number = 2341899;
      boolean a = checkNumber(number);
      System.out.println(a);
    }
   

 public static boolean checkNumber (int number ) {
	 int tens=0 ;
	 int hundreads=0 ;
	 while (number!=0) {
		tens=number%10 ;
		hundreads = (number/10)%10;
	 if (tens<hundreads ) 
		 return false ;
		 
	 }
	 number = number/10;
	
 return true ;
 }
 }
 