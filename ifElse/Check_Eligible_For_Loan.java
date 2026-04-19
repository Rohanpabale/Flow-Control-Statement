package ifElse;

import java.util.Scanner; 

public class Check_Eligible_For_Loan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner class object
		System.out.println("enter your salary");
		int employeeSalary = sc.nextInt();

		System.out.println("enter your cibil Score");
		int cibilScore = sc.nextInt();

		// using if else
		if (employeeSalary > 50000 && cibilScore > 750) {
			System.out.println("loan is approved");
		}

		else {
			System.out.println("loan not approved");
		}
	}
}
