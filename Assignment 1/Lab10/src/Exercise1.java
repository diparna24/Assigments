import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Exercise1 {
public static void main(String[] args) {
	try {
		BufferedReader reader= new BufferedReader (new FileReader(new File("src//Source.txt")));
		String line = reader.readLine();
		int count = 1;
		while (line!=null) {
			System.out.println(count+" "+line);
			line= reader.readLine();
			count ++;
		} 
		reader.close();
		
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
