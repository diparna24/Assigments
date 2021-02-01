import java.util.Arrays;

public class Ex7 {

	public static int[] getSorted(int[] array) {

		int[] resultantArray = new int[array.length];
		int j = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			resultantArray[i] = array[j];
			j--;

		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(resultantArray[i]);

		}
		System.out.println("------------------after sort--------------------");
		Arrays.sort(resultantArray);
		return resultantArray;
	}

	public static void main(String[] args) {
		int[] myArray = { 2, 5, 4, 4, 23, 234, 65, 0 };
		int[] result = getSorted(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(result[i]);
		}

	}
}
