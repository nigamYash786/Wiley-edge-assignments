package problem3;

public class CharacterCount {

	public static void main(String[] args) {
		String str1 = "Hi,Hello,How Are You?";
		char character = 'H';
		System.out.println("The character " + character + " has occurred "
				+ CountCharacterUtility.countOccurrence(str1, character) + " times in the string: " + str1);
	}

}
