package InterviewPrograms;

public class ReverseString_2 {

	public static void main(String[] args) {

		String input = "NEWEST";

		String output = reverseString(input);
		System.out.println(output);

	}

	public static String reverseString(String str) {
		if (str.length() == 0) {
			return str;
		} else {
			str = reverseString(str.substring(1)) + str.charAt(0);
			return str;
		}
	}

}
