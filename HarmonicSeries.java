package intro;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.println("Sayýyý girin:");

		int number = inp.nextInt();
		double sum = 0;

		for (double i = 1; i <= number; i++) {
			sum += 1 / i;
		}
		System.out.println(sum);
	}
}
