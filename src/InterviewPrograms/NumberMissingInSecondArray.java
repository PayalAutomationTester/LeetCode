package InterviewPrograms;

import java.util.HashSet;

public class NumberMissingInSecondArray {

	public static void main(String[] args) {
		// 8. Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 find which number is not present
		// in the second array.

		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 2, 3, 1, 0, 5 };
		int missingNo = 0;
		HashSet<Integer> set = new HashSet<>();

		for (int a : array2) {
			set.add(a);
		}

		for (int a : array1) {
			if (!(set.contains(a))) {
				missingNo = a;
			}
		}

		System.out.println(missingNo);
	}

}
