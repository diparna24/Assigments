

public class Exercise1 {
	
public interface Exponent {

	public double exponent(int base , int exponent) ;
}

	
 public static void main(String[] args) {
	
	 Exponent exp = (base , exponent)-> { 
		 return Math.pow(base, exponent);
	 };
	 
	 System.out.println(exp.exponent(2, 3));
}
	
}
