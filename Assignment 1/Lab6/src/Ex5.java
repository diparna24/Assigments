import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex5 {

	

	public static int getSecondSmallest(int[] a) {

		List<Integer> myList = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			myList.add(a[i]);

		}

		Collections.sort(myList);
		return myList.get(1);
}
	
	
	public static void main(String[] args) {
		int[] myList = { 5, 3, 4, 6, 1 };
		System.out.println(getSecondSmallest(myList));
	}
}
