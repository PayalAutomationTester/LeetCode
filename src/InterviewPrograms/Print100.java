package InterviewPrograms;

public class Print100 {

	public static void main(String[] args) {

		printNum(1);

	}

	public static void printNum(int num) {
		System.out.println(num);
		num++;
		if (num <= 100) {
			printNum(num);
		}
	}

}
