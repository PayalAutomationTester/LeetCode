package InterviewPrograms;

import java.util.HashMap;

public class MaximumRepeatedCharInString {
	// Code to find character which is maximum repeated "AABBBDDDD"

	public static void main(String[] args) {
		String str = "AABBCCCDDDD";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int maxChar = 0;
		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);

				if (map.get(str.charAt(i)) > maxChar) {
					maxChar = map.get(str.charAt(i));
				}
			}

			else {
				map.put(str.charAt(i), 1);
				maxChar = 1;

			}
		}

		System.out.println(map);
		System.out.println("Maximum repeated character = " + maxChar);

	}
}
