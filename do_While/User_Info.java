package do_While;

import java.util.Scanner;

public class User_Info {
	public static void main(String[] args) {
		String username = "rohan1234"; // set the username
		String password = "rohan0987"; // set password
		int userAttempt = 1;
		int attemptLeft = 2;

		Scanner sc = new Scanner(System.in);
		String uName; // initialization
		String uPassword;

		do {
			// code
			System.out.println("enter your username");
			uName = sc.next();
			System.out.println("enter your password");
			uPassword = sc.next();

			// condition for if username is correct and password is wrong
			if (username.equals(uName) && !password.equals(uPassword)) {
				System.out.println("username is match but wrong password ");
			}

			// condition for if both username and password is correct then log in sucess and
			// breaking the loop
			if (username.equals(uName) && password.equals(uPassword)) {
				System.out.println("log in success");
				break;
			}

			// condition for counting the user attempts and how many attempts left
			if (userAttempt < 4 && attemptLeft >= 1) {
				System.out.println("wrong info !!! please enter again you have " + attemptLeft + " attempt left");
			}

			// condition for if user exeeds all the attemptleft
			if (attemptLeft == 0) {
				System.out.println("sorry you have " + attemptLeft + " attempt left");
				System.out.println("please try after some time");
			}
			// increament decreament
			attemptLeft--;

			userAttempt++;

		} while (userAttempt < 4 && attemptLeft >= 0); // condition

	}
}
