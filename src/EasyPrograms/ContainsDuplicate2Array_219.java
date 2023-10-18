package EasyPrograms;

public class ContainsDuplicate2Array_219 {

	public static void main(String[] args) {

//		Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array 
//		such that nums[i] == nums[j] and abs(i - j) <= k.
//		Example 1:
//		Input: nums = [1,2,3,1], k = 3
//		Output: true

		//int[] nums = {1,2,3,1}; int k = 3;
		//int[] nums = {1,0,1,1}; int k = 1;
		int[] nums = { 1, 2, 3, 1, 2, 3 };  int k = 2;

		boolean flag = false;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {
					if (Math.abs(i - j) <= k) {
						flag = true;
						break;
					}

				}
			}

			if (flag == true) {
				break;
			}
		}

		System.out.println(flag);

	}

}
