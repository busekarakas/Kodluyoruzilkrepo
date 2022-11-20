package intro;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		// fibonacci serisi bulan program yazýyoruz. Fibonacci serisinin eleman sayýsýný
		// kullanýcýdan alýn.

		int step, n = 1, n1 = 1, n2;
		Scanner inp = new Scanner(System.in);
		System.out.println("Eleman sayýsýný girin:");
		step = inp.nextInt();

		for (int i = 1; i <= step; i++) {

			if (i == 1 || i == 2) {
				System.out.print("1,");

			} else {
				n2 = n + n1;
				System.out.print(n2 + ",");
				n = n1;
				n1 = n2;
			}
		}

	}

}
