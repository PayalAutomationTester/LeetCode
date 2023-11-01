package InterviewPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// 20. Reversing string without loop

		String str = "HELLO";

		String newstr = "";
		newstr = reverseString(str, newstr, str.length() - 1);
		System.out.println(newstr);
	}

	public static String reverseString(String str, String newstr, int i) {
		newstr = newstr + str.charAt(i);
		i--;
		if (i >= 0) {
			newstr = reverseString(str, newstr, i);
		}
		return newstr;
	}

}
