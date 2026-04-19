package switchCase;

import java.util.Scanner;

public class To_Select_Season {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any season");
		String season = sc.next();
		System.out.println("enter month");
		String month = sc.next();
//-------------------------------------------------------------------
		switch (season) {
		case "monsoon":
			System.out.println("you select monsoon");

			switch (month) {
			case "june":
				System.out.println("june all festivles");
				break;

			case "july":
				System.out.println("july all festivles");
				break;

			case "august":
				System.out.println("august all festivles");
				break;

			case "september":
				System.out.println("september all festivles");
				break;

			default:
				System.out.println("invalid month");
				break;
			}
		}
		// --------------------------------------------------------------------
		switch (season) {
		case "winter":
			System.out.println("you select winter");

			switch (month) {
			case "october":
				System.out.println("october all festivles");
				break;

			case "november":
				System.out.println("november all festivles");
				break;

			case "december":
				System.out.println("december all festivles");
				break;

			case "january":
				System.out.println("january all festivles");
				break;

			default:
				System.out.println("invalid month");
				break;
			}
		}
		// ----------------------------------------------------------------------
		switch (season) {
		case "summer":
			System.out.println("you select summer");

			switch (month) {
			case "february":
				System.out.println("february all festivles");
				break;

			case "march":
				System.out.println("march all festivles");
				break;

			case "april":
				System.out.println("april all festivles");
				break;

			case "may":
				System.out.println("may all festivles");
				break;

			default:
				System.out.println("invalid month");
				break;
			}

		}

	}
}
