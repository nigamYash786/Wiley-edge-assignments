package problem5;

public class CheckAnagramUtility {
	public static boolean checkAnagram(String str1, String str2) {
		int[] countArray = new int[256];
		if (str1.length() != str2.length())
			return false;
		for (int i = 0; i < str1.length(); i++) {
			countArray[(int) str1.charAt(i)] += 1;
		}
		for (int i = 0; i < str2.length(); i++) {
			countArray[(int) str2.charAt(i)] -= 1;
		}
		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] != 0)
				return false;
		}
		return true;
	}
}
