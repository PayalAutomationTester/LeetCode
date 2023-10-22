package InterviewPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicateNumberInArray {

	public static void main(String[] args) {
		// 7. An array of 1-100 exactly one number is duplicate find the number

		int[] array = new int[101];
		int j = 1;
		for (int i = 0; i < array.length; i++) {
			if (i != 6) {
				array[i] = j;
				j++;
			} else {
				array[i] = j;
			}
		}
		System.out.println(array.length + " : " + Arrays.toString(array));

		HashSet<Integer> Nums = new HashSet<>();
		int DuplicateNo = 0;
		for (int a : array) {
			if (Nums.contains(a)) {
				DuplicateNo = a;
				break;
			} else {
				Nums.add(a);
			}
		}

		System.out.println("Duplicate No = " + DuplicateNo);

	}

}
