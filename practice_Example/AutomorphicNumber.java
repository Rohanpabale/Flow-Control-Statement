package practice_Example;

import java.util.Scanner;

public class AutomorphicNumber {
//automorphic------>the square of the given number ends with the same number for ex. 5*5=25 ends with 5;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check automorphic or not");
		int number = sc.nextInt();

		int square = number * number;
		int temp = number;

		while (temp > 0) {
			int rem1 = temp % 10;
			int rem2 = square % 10;

			if (rem1 != rem2) {
				System.out.println("not a automorphic");
				break;
			} else
				temp = temp / 10;
			square = square / 10;
			System.out.println("number is automorphic");
			break;
		}

	}
}
