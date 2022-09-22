package problem4;

public class TestFirstAndLastUtility {
	
	public static boolean testFirstAndLastElementEquality(int[] input) throws InvaildArrayException {
		if(input.length <= 5)
			throw new InvaildArrayException();
		else
			if(input[0] == input[input.length - 1]) {
				System.out.println("First and last elements are EQUAL.");
				return true;
			}
		System.out.println("First and last elements are UNEQUAL");
		return false;
	}
}
