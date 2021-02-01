public class Ex1 {

	public static int  getSecondSmallest(int a[], int n) {
		
		int i ,j ;
		int temp;
		for (i =0 ; i<n ; i++) {
			for (j = i+1 ; j< n ; j++) {
				if (a[i]> a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j]= temp;
					
				}
			}
		}
return a[1];
}
public static void main (String []args ) {
	int a[]= {1, 2, 3, 4, 5 };
	System.out.println (" Second smallest is :"+getSecondSmallest(a , 5)); } }