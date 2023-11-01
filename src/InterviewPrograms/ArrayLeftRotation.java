package InterviewPrograms;

import java.util.Arrays;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// My logic
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int rotation = 2;
		// System.out.println(Arrays.toString(leftRotation(arr, rotation)));

		// ChatGPT
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int rotation2 = 2;
		System.out.println(Arrays.toString(leftRotation2(arr2, rotation2)));

	}

	// My logic
	public static int[] leftRotation(int[] arr, int rotation) {
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (i < arr.length - rotation) {
				k = arr[i];
				arr[i] = arr[i + rotation];
				arr[i + rotation] = k;
			} else if (arr.length % rotation != 0) {
				k = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = k;
			}

		}
		return arr;
	}

	// ChatGPT
	public static int[] leftRotation2(int[] arr, int rotation) {
		int[] temp = new int[rotation];
		for (int i = 0; i < rotation; i++) {
			temp[i] = arr[i];
		}

		for (int i = 0; i < arr.length - rotation; i++) {
			arr[i] = arr[i + rotation];
		}

		for (int i = 0; i < rotation; i++) {
			arr[arr.length - rotation + i] = temp[i];
		}
		return arr;
	}
}
