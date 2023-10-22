package InterviewPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// 10. Remove duplicate number from a given array

		int[] array = { 2, 4, 5, 0, 7, 1, 5, 3, 9, 5 };

		// add unique no in set
		HashSet<Integer> set = new HashSet<>();
		for (int a : array) {
			set.add(a);
		}

		// create new array with unique numbers
		int[] newarray = new int[set.size()];
		int i = 0;
		for (int a : set) {
			newarray[i] = a;
			i++;
		}

		System.out.println(Arrays.toString(newarray));

	}

}
