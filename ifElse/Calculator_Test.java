package ifElse;

import java.util.Scanner;

public class Calculator_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner class object
		System.out.println("enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("enter 2nd number");
		int num2 = sc.nextInt();

		System.out.println("enter 1 for addition");
		System.out.println("enter 2 for substraction");
		System.out.println("enter 3 for multiplication");
		System.out.println("enter 4 for division");

		int input = sc.nextInt();
//using switch case default break
		switch (input) {
		case 1:
			System.out.println("the addition is " + Calculator.addition(num1, num2)); // all methods return something
																						// hence we directly call it in
																						// printing statement
			break;

		case 2:
			System.out.println("the substraction is " + Calculator.substraction(num1, num2));
			break;

		case 3:
			System.out.println("the multiplication is " + Calculator.multiplication(num1, num2));
			break;

		case 4:
			System.out.println("the division is " + Calculator.division(num1, num2));
			break;

		default:
			System.out.println("invalid input");
			break;
		}

	}
}
