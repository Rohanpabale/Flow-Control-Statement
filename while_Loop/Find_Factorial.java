package while_Loop;

public class Find_Factorial {
	public static void main(String[] args) {
		int number = 5;
		int product = 1;
		while (number > 0) {
			product = (number * product);
			number--;
		}
		System.out.println(product);
	}
}
