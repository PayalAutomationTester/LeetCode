package EasyPrograms;

import java.util.Arrays;

public class RemoveElementArray_27 {

//	Input: nums = [0,1,2,2,3,0,4,2], val = 2
//	Output: 5, nums = [0,1,4,0,3,_,_,_]
//	Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//	Note that the five elements can be returned in any order.
//	It does not matter what you leave beyond the returned k (hence they are underscores).
	
	public static void main(String[] args) {

		int[] arr = {0,1,2,2,3,0,4,2};
		int val = 2;
		int j = 0;
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			j = i + 1;
			if (arr[i] == val) {
				while (j < arr.length) {
					if (arr[j] != val) {
						arr[i] = arr[j];
						arr[j] = val;
						break;
					} else {
						j++;
					}
				}

				if (j >= arr.length) {
					break;
				}

			}
			
			k++;
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("K value is =" + k);

	}

}
