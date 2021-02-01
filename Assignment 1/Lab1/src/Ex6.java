import java.util.*;
public class Ex6 {
	
	public static void main (String [] args ) {
		int n = 2 ;
		int result = calculateDifference(n);
		System.out.println ("The Difference is : "+result);
		
	}
	private static int calculateDifference(int n) {
		int sum=0 ;
		int sumofsquares=0 ;
		int squareofsums=0;
		
		for (int i=1 ; i<n ; i++) {
			sumofsquares= sumofsquares + (i*i) ;
			squareofsums = (squareofsums + i );
			
		}
		sum = sumofsquares + (squareofsums*squareofsums);
		
		return sum ;
	} }

         