package do_While;

public class Fibonacci_Series {
	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 1;
		int i = 1;
		do {
			System.out.println(firstNumber); //
			int nextNumber = firstNumber + secondNumber; // next number in series

			// swapping the numbers
			firstNumber = secondNumber;
			secondNumber = nextNumber;
			i++;

		} while (i <= 10);
	}
}
