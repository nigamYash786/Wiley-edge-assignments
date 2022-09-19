package problem3;

public class CountCharacterUtility {
	public static int countOccurrence(String str, char c) {
		if(str.length() < 1)
			return 0;
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c)
				count += 1;
		}
		return count;
	}
}
