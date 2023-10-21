package EasyPrograms;

public class TwoSum_1 {

	public static void main(String[] args) {

		int[] nums = {-1,-2,-3,-4,-5};
		int target = -8;
		int[] indices = Sum(nums, target);
		System.out.println("["+indices[0]+","+indices[1]+"]");

	}

	public static int[] Sum(int[] nums, int target) {

		int num2, index1 = 0, index2 = 0;
		int[] indices = {index1,index2};

		for (int i = 0; i < nums.length - 1; i++) {

			
				num2 = target - nums[i];

				for (int j = i + 1; j < nums.length; j++) {

					if (nums[j] == num2) {
						index1 = i;
						index2 = j;
						break;
					}

				}
			}

		
		indices[0] = index1;
		indices[1] = index2;
		return indices;
	}

}
