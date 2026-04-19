package switchCase;

import java.util.Scanner;

public class WeekDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner class object
		System.out.println("select day between 1-7");
		int day = sc.nextInt(); // user input
        //using switch case
		switch (day) {

		case 1:
			System.out.println("you selected Monaday");
			break;

		case 2:
			System.out.println("you selected Tuesday");
			break;

		case 3:
			System.out.println("you selected Wednesday");
			break;

		case 4:
			System.out.println("you selected Thursday");
			break;

		case 5:
			System.out.println("you selected is Friday");
			break;

		case 6:
			System.out.println("you selected Saturday");
			break;

		case 7:
			System.out.println("you selested Sunday");
			break;

		default:
			System.out.println("please enter correct data");
			break;
		}

	}
}
