package InterviewPrograms;

public class FirstOccurenceOf1 {

	public static void main(String[] args) {
		
	//  A long string of 00000000111111….. Till infinity, give me the index of the first 1 occurring	

		// using indexOf function
		String str = "0000001111111000111";
		int occ = str.indexOf('1');
		System.out.println("Fisrt occurrence of 1 is at index : " + occ);

		// using recursive function
		int index = 0;
		index = firstOccurence(str, index);
		System.out.println("First Occurence of 1 using recursive function : " + index);

	}

	// using recursive function
	private static int firstOccurence(String str, int index) {

		if (str.charAt(index) == '1' && index < str.length()) {
			return index;
		}
		return firstOccurence(str, index + 1);
	}

}
