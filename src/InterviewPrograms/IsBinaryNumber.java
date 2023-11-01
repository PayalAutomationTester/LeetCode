package InterviewPrograms;

public class IsBinaryNumber {

	public static void main(String[] args) {

		String number = "1010010110111111111000001";

		String binaryPattern = "^[01]+$";

		if (number.matches(binaryPattern)) {
			System.out.println("Number is binary number = " + number);
		} else {
			System.out.println("Number is not binary number..");
		}
	}

}
