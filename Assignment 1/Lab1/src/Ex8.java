public class Ex8 {


	public static void main(String[] args) {
		int n = 5;
		boolean res =checkNumber(n);
		System.out.println(res);
	}

	private static boolean checkNumber(int n) {
		
		if(n==0) { return false; }
        while(n != 1)
        {
            
            if(n%2 != 0 && n != 1){ return false; }
            n = n/2;
        }
        return true;
	}

}

