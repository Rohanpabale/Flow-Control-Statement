package do_While;

import java.util.Scanner;

public class To_Check_Password {
	public static void main(String[] args) {
		int orgPassword = 1234;
		Scanner sc = new Scanner(System.in);
		int password;

		do {
			System.out.println("enter your password");
			password = sc.nextInt();

			if (orgPassword == password) {
				System.out.println("your password is correct");
				break; //break the loop if password is correct
			} else
				System.out.println("your password is wrong");

		} while (true); //always true so it will go in loop

	}
}
