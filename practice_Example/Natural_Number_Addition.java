package practice_Example;

import java.util.Scanner;

public class Natural_Number_Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the last number");
		int lastNumber = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= lastNumber) {
			sum = sum + i;
			i++;
		}
		System.out.println("the sum of natural numbers till " + lastNumber + " is " + sum);
	}
}
