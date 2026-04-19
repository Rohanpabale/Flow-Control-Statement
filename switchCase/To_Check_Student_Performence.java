package switchCase;

import java.util.Scanner;

public class To_Check_Student_Performence {
	public static void main(String[] args) {
		// inside main method
		Scanner sc = new Scanner(System.in); // scanner class object
		System.out.println("please enter your grade");
		char grade = sc.next().charAt(0); // user input

		switch (grade) {
		case 'a':
			System.out.println("your performence is exellent");
			break;

		case 'b':
			System.out.println("your performence is good");
			break;

		case 'c':
			System.out.println("your performence is average");
			break;

		case 'd':
			System.out.println("your performence is very poor");
			break;

		default:
			System.out.println("you are failed please try again next year ");
			break; // no need to write break if default is a last line of the switch body
		}

	}
}
