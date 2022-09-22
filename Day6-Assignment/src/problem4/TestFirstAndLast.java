package problem4;

public class TestFirstAndLast {

	public static void main(String[] args) {
		int[] input1 = { 1, 2, 3, 4, 5 };
		int[] input2 = { 4, 5, 6, 7, 4, 4 };
		int[] input3 = { 5, 6, 9, 7, 8, 3, 2, 1 };

		try {
			// TestFirstAndLastUtility.testFirstAndLastElementEquality(input2);
			// TestFirstAndLastUtility.testFirstAndLastElementEquality(input3);
			TestFirstAndLastUtility.testFirstAndLastElementEquality(input1);
		} catch (InvaildArrayException ia) {
			System.out.println("Exception occurred: " + ia);
			ia.printStackTrace();
		}
	}

}
