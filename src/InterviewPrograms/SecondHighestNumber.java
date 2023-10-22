package InterviewPrograms;

public class SecondHighestNumber {

	public static void main(String[] args) {
		// 9. Find the second-highest number in a single loop

		int[] array = { 1, 5, 4, 9, 0, 3, 7, 2 };
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int a : array) {
			if (a > max) {
				secondMax = max;
				max = a;
			} else if (a > secondMax && a != max) {
				secondMax = a;
			}
		}

		if (secondMax != Integer.MIN_VALUE) {
			System.out.println("Second Highest Number : " + secondMax);
		} else {
			System.out.println("No second highest number present");
		}

	}

}
