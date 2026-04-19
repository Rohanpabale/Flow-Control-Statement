package ifElse;

import java.util.Scanner;

public class To_Check_Eligible_For_DrivingLicense {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner class object
		System.out.println("enter your age");
		int age = sc.nextInt(); // user input
		System.out.println("if you have a learning lisence please enter 'true' and if not enter 'false'");
		boolean hasLearningLicense = sc.nextBoolean(); // user input

		if (age >= 18 && hasLearningLicense == true) { // condition
			System.out.println(" Eligible For learning license  ");

		} else
			System.out.println("not eligible for license");

	}
}
