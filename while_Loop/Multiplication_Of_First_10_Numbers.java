package while_Loop;

public class Multiplication_Of_First_10_Numbers {
	public static void main(String[] args) {
		int start = 1;
		int end = 10;
		int product = 1;
		int countTotalNumbers = 0;
		while (start <= end) {
			product = product * start;
			start++;
			countTotalNumbers++;

		}
		System.out.println("the product of number 1 to 10 is " + product);
		System.out.println("total count is " + countTotalNumbers);

	}
}
