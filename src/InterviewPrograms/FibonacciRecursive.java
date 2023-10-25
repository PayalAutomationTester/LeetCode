package InterviewPrograms;

public class FibonacciRecursive {
	public static int fibo = 0;
	public static int newFibo = 1, oldFibo = 0, i = 1;

	public static void main(String[] args) {
		int num = 10;
		
		//calling function written by me
		FindFibonacci(num);
		System.out.println("\n" + num + "th Fibonacci number is : " + fibo);
		
		//calling ChatGPT function
		int fiboNumber = ComputeFiboNumber(num);
		System.out.println(fiboNumber);
	}

	
	//my logic for recursive
	public static void FindFibonacci(int num) {
		if (fibo == 0 || fibo == 1) {
			System.out.print(fibo + "\t");
			i++;
		}
		fibo = newFibo + oldFibo;
		oldFibo = newFibo;
		newFibo = fibo;
		System.out.print(fibo + "\t");
		i++;
		if (i <= num) {
			FindFibonacci(num);
		}
	}

	
	//more optimized code from chatGPT
		public static int ComputeFiboNumber(int num) {
			if (num <= 1) {
				return num;
			}
			
			return (ComputeFiboNumber(num - 1) + ComputeFiboNumber(num - 2));

		}
	
}
