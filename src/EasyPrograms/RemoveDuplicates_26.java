package EasyPrograms;

import java.util.Arrays;

public class RemoveDuplicates_26 {

	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int k = removeDuplicates(nums);
		System.out.println(k);
		System.out.println(Arrays.toString(nums));

	}

	private static int removeDuplicates(int[] nums) {
		int i = 0, j = 1;
		while (j < nums.length) {

			if (nums[i] == nums[j]) {
				nums[j] = 0;
				j++;
			} else {
				nums[i + 1] = nums[j];
				i++;
				j++;
			}

		}
		return i + 1;
	}

}
