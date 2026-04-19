package while_Loop;

import java.util.Scanner;

public class Palindrome_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number to check it is palindrom or not");
		int number = sc.nextInt();
		int temp = number;
		int reverse = 0;

		while (temp > 0) {
			int operation = temp % 10;
			reverse = (reverse * 10) + operation;
			temp = temp / 10;

		}
		if (number == reverse)
			System.out.println("it is palindrome");
		else
			System.out.println("not a palindrome");
	}
}
