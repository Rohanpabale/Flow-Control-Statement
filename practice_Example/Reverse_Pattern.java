package practice_Example;

// pattern program using nested for loop
public class Reverse_Pattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
}
