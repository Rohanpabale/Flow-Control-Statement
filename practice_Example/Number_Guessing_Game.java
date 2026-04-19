package practice_Example;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
	public static void main(String[] args) {
		int closeOrNot = 10;
		Scanner sc = new Scanner(System.in);
		Random ran = new Random(); // using randrom class object

		int numberToGuess = ran.nextInt(100) + 1; // randomly set the value beetween 1- 100
		int guess;
		do {
			System.out.println("enter number to guess the number");
			guess = sc.nextInt();

			if (guess == numberToGuess)
				System.out.println("congrstulations you won!!! ");

			else if (guess < numberToGuess)
				System.out.println("number is less");

			else if (guess > numberToGuess)
				System.out.println("number is greater");

		} while (true);

	}
}
