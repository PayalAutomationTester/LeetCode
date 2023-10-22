package InterviewPrograms;

public class PrintCharacterCount {

	public static void main(String[] args) {
		// 5. Write code to print string “aaabbcbddc” as “a3b2c1b1d2c1”

		String str = "aaabbcbddcc";
		char k = str.charAt(0);
		String strnew = "";
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != k) {
				strnew = strnew + k + count;
				k = str.charAt(i);
				count = 1;
			} else {
				count++;
			}

		}
		strnew = strnew + k + count;
		System.out.println(strnew);

	}

}
