
 interface StringSpacer {
	 
	public String giveMeSpace(String line);
}

public class Exercise2 {
	public static void main(String[] args) {
		
		StringSpacer spc = str->{ 
			char[] array = str.toCharArray();
			String result = "";
					for (int i=0; i<array.length;i++) {
						result = result+array[i]+" ";
						
					}
					return result ;
		};
		System.out.println(spc.giveMeSpace("DIPARNA"));
	}
}
