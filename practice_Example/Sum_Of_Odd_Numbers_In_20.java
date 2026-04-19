package practice_Example;

public class Sum_Of_Odd_Numbers_In_20 {
	public static void main(String[] args) {
		int start = 1;
		int end = 20;
		int sum = 0;
		while (start <= end) {

			if (start % 2 == 1) {
				System.out.println("the sum of " + sum + " and " + start);
				sum = sum + start;
			}

			start++;
		}

		System.out.println(sum);
	}

}
