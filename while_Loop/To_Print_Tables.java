package while_Loop;

import java.util.Scanner;

//using while loop
public class To_Print_Tables {
	public static void main(String[] args) {

		int start = 1;
		int end = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int number = sc.nextInt();

		System.out.println("the table of " + number + " is as follows:-");

		while (start <= end) { // playing the loop till start is less than or equal to end
			System.out.println(number + " * " + start + " = " + (number * start));
			start++; // increment the i by 1
		}

	}
}
