package ifElse;

import java.util.Scanner;

public class To_Check_Vowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner class object
		System.out.println("enter any a-z letter");
		char letter = sc.next().charAt(0);
		// using if else
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') // condition
			System.out.println(letter + " is a vowel");
		else
			System.out.println(letter + " is a consonent");
	}
}
