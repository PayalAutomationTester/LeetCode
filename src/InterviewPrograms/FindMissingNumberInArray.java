package InterviewPrograms;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		// 6. An array of 1-100 one number is missing, find the number

		// add 1-100 number in array where 1 no is missing
		int j = 1;
		int[] array = new int[99];
		for (int i = 0; i < 99; i++) {
			if (j != 43) {
				array[i] = j;
				j++;
			} else {
				array[i] = ++j;
				j++;
			}
		}

		// Find out missing number
		float n = 100;
		float expectedSum = n / 2 * (1 + n);
		float actualSum = 0;

		for (int a : array) {
			actualSum = actualSum + a;
		}
		System.out.println(expectedSum + " - " + actualSum + " = " + (expectedSum - actualSum));

	}
}
