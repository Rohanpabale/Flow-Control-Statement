package while_Loop;

//while using with the if else condition
import java.util.Scanner;

public class To_Check_Number_Positive_Negative_Zero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int number = sc.nextInt();

		while (number < 999) { // number is not greater than 999
			if (number > 0) {
				System.out.println("number is positive");
			} else if (number < 0) {
				System.out.println("number is negative");
			} else
				System.out.println("number is zero");

			// keeps looping until the user is not enter 999
			System.out.println("enter 999 to stop");
			number = sc.nextInt();

		}

	}

}
