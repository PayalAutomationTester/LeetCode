package InterviewPrograms;

public class MaximumDifferenceArray {

	// Find maximum difference array - [23,67,1,6,97,21,7]

	public static void main(String[] args) {
		int[] arr = { 23, 67, 1, 6, 97, 21, 7 };
		int maxDiff = 0;

		for (int i = 0; i < arr.length ; i++) {
			System.out.println();
			for (int j = i + 1; j < arr.length ; j++) {
				if (maxDiff < Math.abs(arr[i] - arr[j])) {
					maxDiff = Math.abs(arr[i] - arr[j]);
				}
			}
		}

		System.out.println("Maximum difference in 2 elements of array = " + maxDiff);
	}

}
