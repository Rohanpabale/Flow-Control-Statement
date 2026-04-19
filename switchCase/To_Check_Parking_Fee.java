package switchCase;

import java.util.Scanner;

public class To_Check_Parking_Fee {
	public static void main(String[] args) {
		int parkingFee = 0; // local variable value update while going down to the program
		Scanner sc = new Scanner(System.in);
		System.out.println("enter vahicle type");
		String vehicleType = sc.next(); // user input

		switch (vehicleType) {
		case "bike":
			parkingFee = 10; // parking fee for bike
			System.out.println("the parking fee for " + vehicleType + " is " + parkingFee);
			break;

		case "car":
			parkingFee = 20; // parking fee for car
			System.out.println("the parking fee for " + vehicleType + " is " + parkingFee);
			break;

		case "bus":
			parkingFee = 50; // parking fee for bus
			System.out.println("the parking fee for " + vehicleType + " is " + parkingFee);
			break;

		case "truck":
			parkingFee = 100; // parking fee for truck
			System.out.println("the parking fee for " + vehicleType + " is " + parkingFee);
			break;

		default:
			System.out.println("unknow vehicle type");
			break;
		}
	}
}
