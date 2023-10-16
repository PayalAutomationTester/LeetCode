package InterviewPrograms;

import java.util.Arrays;

public class MoveZerosToLeftInArray {

	public static void main(String[] args) {
		// Write a function to move all [0,1,5,4,32,80,0,4,0,1] 0 from to left.

		int[] arr = { 0, 1, 5, 4, 32, 80, 0, 4, 0, 0 };
		int j = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {

				for (int k = i; k > j; k--) {
					arr[k] = arr[k - 1];
				}

				arr[j] = 0;
				j++;

			}

		}

		System.out.println(Arrays.toString(arr));

	}

}
