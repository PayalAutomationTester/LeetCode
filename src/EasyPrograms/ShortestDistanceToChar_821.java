package EasyPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ShortestDistanceToChar_821 {

	public static void main(String[] args) {

		String str = "loveleetcode"; char k = 'e';
	//	String str = "aaab" ; char k = 'b';
		int shortestDis;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int[] distance = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == k) {
				arr.add(i);
			}

		}

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == k) {
				distance[i] = 0;
			} 
			else {
				shortestDis = Math.abs(i - arr.get(0));
				for (int j = 1; j < arr.size(); j++) {
					if (Math.abs(i - arr.get(j)) < shortestDis) {
						shortestDis = Math.abs(i - arr.get(j));
					}
				}

				distance[i] = shortestDis;

			}

		}

		System.out.println(Arrays.toString(distance));
	}

}
