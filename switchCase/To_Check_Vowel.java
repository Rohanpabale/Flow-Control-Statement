package switchCase;

import java.util.Scanner;

public class To_Check_Vowel {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // scanner class object
		System.out.println("enter any alphabet letter");
		char alphabetLetter = sc.next().charAt(0); // user input
		// using switch case
		switch (alphabetLetter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(alphabetLetter + " is a vowel");
			break;

		default:
			System.out.println(alphabetLetter + " is a consonent");
			break;
		}

	}
}
