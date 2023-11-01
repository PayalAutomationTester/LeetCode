package InterviewPrograms;

import java.util.Arrays;

public class ArrayRightRotation {

	public static void main(String[] args) {

		// My logic
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int rotation = 2;
		System.out.println(Arrays.toString(rightRotation(arr, rotation)));

		// ChatGPT
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int rotation2 = 3;
		System.out.println(Arrays.toString(rightRotation2(arr2, rotation2)));

	}

	// My logic
	public static int[] rightRotation(int[] arr, int rotation) {
		int k = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			if (i > rotation - 1) {
				k = arr[i];
				arr[i] = arr[i - rotation];
				arr[i - rotation] = k;
			} else if (arr.length % rotation != 0) {
				k = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = k;
			}
		}

		return arr;
	}

	// ChatGPT int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static int[] rightRotation2(int[] arr, int rotation) {
		int[] temp = new int[rotation];

		for (int i = 0; i < rotation; i++) {
			temp[i] = arr[arr.length - rotation + i];
		}

		for (int i = arr.length - 1; i > rotation - 1; i--) {
			arr[i] = arr[i - rotation];
		}

		for (int i = 0; i < rotation; i++) {
			arr[i] = temp[i];
		}
		return arr;
	}

}
