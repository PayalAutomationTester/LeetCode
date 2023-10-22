package InterviewPrograms;

import java.util.ArrayList;

public class CheckAnagramStrings {

	public static void main(String[] args) {

		String str1 = "integral";
		String str2 = "triangla";
		int index;
		ArrayList<Character> list = new ArrayList<>();

		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				list.add(str1.charAt(i));
			}

			for (int i = 0; i < str2.length(); i++) {
				try {
					index = list.indexOf(str2.charAt(i));
					list.remove(index);
				} catch (ArrayIndexOutOfBoundsException e) {
					break;
				}
			}

			if (list.size() == 0) {
				System.out.println("Strings are Anagram");
			} else {
				System.out.println("Strings are not Anagram");
			}
		}

		else {

			System.out.println("Strings are not Anagram");

		}

	}

}
