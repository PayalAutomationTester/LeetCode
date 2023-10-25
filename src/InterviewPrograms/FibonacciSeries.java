package InterviewPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num = 10;
		int oldFebo = 0;
		int newFebo = 1;
		int febo = 0;

		for (int i = 1; i <= num; i++) {
			if (febo == 0 || febo == 1) {
				System.out.print(febo + "\t");
				i++;
			}
			febo = oldFebo + newFebo;
			oldFebo = newFebo;
			newFebo = febo;
			System.out.print(febo + "\t");

		}

	}

}
