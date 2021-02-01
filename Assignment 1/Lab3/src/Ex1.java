
/** Write a java that reads a line of integers and then displays each integer and the sum of all integers. (Use String Tokenizer class)?
* @diparnabiswas
*/
  import java.util.* ;
  public class Ex1 {
	  public static void main (String [] args) {
		  String str = getInputString();
		  System.out.println ("Sum of Integers are : " +findSum(Str));
	  }
	  private static int findSum (String str1) {
		 
		  String [] str2 = str1.split(" ");
		  int length= str2.length;
		  int sum= 0 ;
		  for (int index = 0 ; index <length ; index ++) {
			  sum+= Integer.parseInt(Str2 [index]);
		  }
	  return sum ;
	  } 
	  private static String getInputString() {
		  Scanner sc = new Scanner (System.in);
		  System.out.println ("Enter the string");
		  String str= sc.nextLine();
		  return str;
	  }
  }
