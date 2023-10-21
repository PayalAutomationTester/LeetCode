package InterviewPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scan.next();
		Boolean flag=true;
		int j = str.length()-1;
		// "MADAM"
		
		for(int i=0;i<j;i++) {
			if(!(str.charAt(i)==str.charAt(j))) {
				flag=false;
				break;
			}
			j--;
		}
		
		System.out.println(flag);
	}

}
