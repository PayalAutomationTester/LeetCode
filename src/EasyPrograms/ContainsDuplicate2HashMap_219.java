package EasyPrograms;

import java.util.HashMap;

public class ContainsDuplicate2HashMap_219 {

	public static void main(String[] args) {

//		Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//		Example 1:
//		Input: nums = [1,2,3,1], k = 3
//		Output: true

		int[] nums = {1,2,3,1}; int k = 3;
		//int[] nums = {1,0,1,1}; int k = 1;
		//int[] nums = { 1, 2, 3, 1, 2, 3 }; int k = 2;

		boolean flag = false;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {
				if (Math.abs(i - (map.get(nums[i]))) <= k) {
					flag = true;
					break;
				}
				else {
					map.put(nums[i], i);
				}
			}

			else {
				map.put(nums[i], i);
			}
		}
		System.out.println(flag);

	}

}
