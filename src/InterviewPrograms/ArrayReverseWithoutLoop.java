package InterviewPrograms;

import java.util.Arrays;

public class ArrayReverseWithoutLoop {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 7, 0, 8, 1, 3, 9 };
		int i = 0;
		int j = arr.length - 1;
		reverseArray(arr,i,j);
		System.out.println(Arrays.toString(arr));
	}

	public static void reverseArray(int[] arr, int i, int j) {
		int k;
		k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
		i++;
		j--;
		if (i<j) {
			reverseArray(arr, i, j);
		}

	}

}
