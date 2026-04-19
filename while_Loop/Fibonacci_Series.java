package while_Loop;

public class Fibonacci_Series {
	// 0 1 1 2 3 5 8 13 21 34......
	public static void main(String[] args) {
		// starting two numbers are 0 and 1
		// nextNumber= addition of previous 2 numbers
		int firstNumber = 0;
		int secondNumber = 1;
		int i = 1; // loop eteration

		while (i <= 10) {
			System.out.println(firstNumber);

			int nextNumber = firstNumber + secondNumber;

			// swap the numbers

			firstNumber = secondNumber;
			secondNumber = nextNumber;

			i++;
		}

	}
}
