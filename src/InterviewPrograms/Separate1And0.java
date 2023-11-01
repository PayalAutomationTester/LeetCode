package InterviewPrograms;

public class Separate1And0 {

	public static void main(String[] args) {
		// Java program write 100011101101 separately and find the frequency

		String str = "100011101101";
		String str1 = "", str2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				str1 = str1 + '1';
			}
			if (str.charAt(i) == '0') {
				str2 = str2 + '0';
			}

		}

		System.out.println("Frequency of 1 is = " + str1.length() + ", " + str1);
		System.out.println(str1);
		System.out.println("Frequency of 0 is = " + str2.length() + ", " + str2);
		System.out.println(str2);

	}

}
