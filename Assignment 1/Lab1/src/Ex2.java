/** 
 * @author Diparna Biswas
 *
 */


import java.util.Scanner;
public class Ex2 
{
	
	public static void main (String args[]) 
	{
		
		System.out.println(" Select a light among red , yellow , green " ) ;
		Scanner sc = new Scanner(System.in) ;
		String str = sc.nextLine() ;
		if ( str.equals ("Red"));
		{
			System.out.println (" STOP ") ;
		}
	if ( str.equals("Yellow")) 
			{
				System.out.println (" READY") ;
			}
		
			else if ( str.equals ("Green")) 
				{
					System.out.println (" GO") ;
				}
			
				
	} 
}
	