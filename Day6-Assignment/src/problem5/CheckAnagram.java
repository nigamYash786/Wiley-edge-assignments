package problem5;

public class CheckAnagram {

	public static void main(String[] args) {
		String str1 = "SILENT";
		String str2 = "LISTEN";
		boolean isAnagram = CheckAnagramUtility.checkAnagram(str1, str2);
		if (isAnagram)
			System.out.println(str1 + " and " + str2 + " are ANAGRAMS.");
		else
			System.out.println(str1 + " and " + str2 + " are NOT ANAGRAMS.");
	}

}
