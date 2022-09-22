package problem1;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Wiley-Edge";
		System.out.println("Original string is: " + str);
		String reverse = StringUtility.doReverse(str);
		System.out.println("Reverse of the string is: " + reverse);
	}
}