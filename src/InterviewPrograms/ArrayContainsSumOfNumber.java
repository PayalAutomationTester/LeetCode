package InterviewPrograms;

public class ArrayContainsSumOfNumber {

	public static void main(String[] args) {
		// An array containing a number, given a number, find the sum of that number exist in the given array

		int[] arr = { 11, 15, 23, 18, 20, 16, 29 };
		int number = 178;
		int sum = 0;

		while (number != 0) {
			sum = sum + number % 10;
			number = number / 10;
		}

		for (int a : arr) {
			if (a == sum) {
				System.out.println("array contains sum of given number " + sum);
				break;
			}
		}

	}

}
