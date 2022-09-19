package problem1;

public class StringUtility {

	public static String doReverse(String str) {
		String ans = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			ans += str.charAt(i);
		}
		return ans;
	}
}
