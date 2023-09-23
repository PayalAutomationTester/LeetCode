package EasyPrograms;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(new Palindrome().palindrome("abc"));

	}
	
	public boolean palindrome(String input)
	{
		
		char[] inputChar = input.toCharArray();
		int i=0;
		int j= inputChar.length-1;
		while(i<=j)
		{
			if(inputChar[i]!=inputChar[j])
			{
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}

}
