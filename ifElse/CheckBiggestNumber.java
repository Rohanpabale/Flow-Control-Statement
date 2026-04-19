package ifElse;

// using nested
import java.util.Scanner; //importing 

public class CheckBiggestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // creating object of scanner class

		System.out.println("enter first number");
		int number1 = sc.nextInt(); // first number
		System.out.println("enter second number");
		int number2 = sc.nextInt(); // second number
		System.out.println("enter third number");
		int number3 = sc.nextInt(); // third number

		// using nested if else
		if (number1 > number2) {
			if (number1 > number3) {
				System.out.println(number1 + " is greater than " + number2 + " " + number3);
			} else {
				System.out.println(number3 + " is greater than " + number1 + " " + number2);
			}
		} else {
			if (number2 > number3) {
				System.out.println(number1 + " is greater than " + number2 + " " + number3);
			} else {
				System.out.println(number3 + " is greater than " + number1 + " " + number2);
			}
		}
	}
}