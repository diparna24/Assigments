import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ex2 {

	public static List<Integer> getValues(HashMap<String, Integer> hmap) {
		
		List<Integer> myList = new ArrayList<Integer>(hmap.values());
		Collections.sort(myList);
		return myList ;
	}
	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap <String, Integer>();
		hmap.put("diparna", 23);
		hmap.put("sagnik", 43);
		hmap.put("rahul", 14);
		System.out.println(getValues(hmap));
	}
}
