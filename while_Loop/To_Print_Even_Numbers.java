package while_Loop;

import java.util.Scanner;

public class To_Print_Even_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number");
		int start = sc.nextInt();
		System.out.println("enter end number");
		int end = sc.nextInt();
		int count = 0;

		while (start <= end) {

			if (start % 2 == 0) {
				System.out.println(start);
				count++; // increasing the count value if both conditions are true

			}
			start++;
		}
		System.out.println("the total even numbers are " + count);
	}
}
