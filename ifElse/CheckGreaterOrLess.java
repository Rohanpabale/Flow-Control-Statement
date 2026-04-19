package ifElse;
// checking greater or not using only if

import java.util.Scanner;

public class CheckGreaterOrLess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int number = sc.nextInt();
		System.out.println("enter second number");
		int number2 = sc.nextInt();

		if (number < number2)
			System.out.println(number + " is less than " + number2);
		if (number > number2)
			System.out.println(number + " is greater than " + number2);
	}

}
