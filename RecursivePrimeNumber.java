package intro;

import java.util.Scanner;

public class RecursivePrimeNumber {
	static int i = 2;

	public static void main(String[] args) {
		int number;
		boolean result;
		do {
			Scanner inp = new Scanner(System.in);
			System.out.println("Sayý:");
			number = inp.nextInt();
			result = prime(number);
			i = 2;
			if (result == true) {
				System.out.println("Asal sayýdýr");
			} else {
				System.out.println("Asal sayý deðildir");
			}

		} while (true);
	}

	public static boolean prime(int n) {

		if (n == 2 || n == 3 || n == 5 || n == 7) {
			return true;
		}
		if (n % i == 0) {
			return false;
		}
		i++;
		if (i < n) {
			return prime(n);
		} else {
			return true;
		}

	}

}
