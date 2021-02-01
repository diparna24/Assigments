	import java.util.*;
	public class Ex5 {

		public static void calculateSum (int n) {
			int sum = 0 ;
			for (int i=0 ; i <n ; i++) {
				if (i%3 == 0 && i%5 == 0 ) {
					sum = sum+i ;
					
				}
				System.out.println ("Sum of the first N numbers divisible by 3 or 5 is :" +sum);
				
			}
			Scanner sc = new Scanner (System.in);
			System.out.println ("enter a number :");
			int n1 = sc.nextInt();
			calculateSum(n1);
		}
			
	}
