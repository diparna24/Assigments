
import java.util.*;

public class Ex4 {

	public static HashMap<String, String> getStudents(HashMap<String, Integer> hmap) {

		HashMap<String, String> result = new HashMap<>();
		for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
			if (entry.getValue() >= 90) {
				result.put(entry.getKey(), "GOLD");
			} else if (entry.getValue() >= 80 && entry.getValue() < 90) {
				result.put(entry.getKey(), "SILVER");
			} else if (entry.getValue() >= 70 && entry.getValue() < 80) {
				result.put(entry.getKey(), "BRONZE");
			}
		}
		
		return result ;
	}
	
	public static void main(String[] args) {
		
		HashMap <String , Integer> marks = new HashMap<>();
		marks.put("efs123423", 94);
		marks.put("efgs26", 75);
		marks.put("efs12gf34ew23", 15);
		marks.put("efg546536s26", 85);
		
		HashMap<String, String> result= getStudents(marks);
		System.out.println(result);
	}
}
