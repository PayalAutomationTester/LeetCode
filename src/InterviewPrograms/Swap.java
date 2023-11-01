package InterviewPrograms;

public class Swap {

	public static void main(String[] args) {
		// 15. How to swap two numbers without using temp variable?

		int num1 = 10;
		int num2 = 20;
		System.out.println("Before num1 = " + num1);
		System.out.println("Before num2 = " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After num1 = " + num1);
		System.out.println("After num2 = " + num2);

	}

}
