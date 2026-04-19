package while_Loop;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check prime or not ");
		int number = sc.nextInt();

		int i = 1;
		int count = 0;
		while (i <= number) {
			if (number % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 2)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}
}
