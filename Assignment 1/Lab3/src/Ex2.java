/**Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol 
 * ** @diparnabiswas
 *
 */

public class Ex2{
	
	public static void main(String[] args)
    {
        String input = "EARTH";
 
        // getBytes() method to convert string
       
        byte[] strAsByteArray = input.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
      
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
 
        System.out.println(input+"|"+new String(result));
    }
}
