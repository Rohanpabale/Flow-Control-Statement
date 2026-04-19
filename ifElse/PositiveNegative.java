package ifElse;

// if else simple example 
import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int number = sc.nextInt();
		// using if else
		if (number >= 0)
			System.out.println("number " + number + " is positive");
		else
			System.out.println("number " + number + " is negative");
	}
}
