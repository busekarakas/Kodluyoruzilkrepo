package intro;

import java.util.Scanner;

public class TriangleWithStars2 {

	public static void main(String[] args) {
		int step;

		Scanner inp = new Scanner(System.in);
		System.out.println("Kaç basamak istediðinizi girin:");
		step = inp.nextInt();

		for (int i = step - 1; i >= 1; i--) {
			for (int j = step; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
