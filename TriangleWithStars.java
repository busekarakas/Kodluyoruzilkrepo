package intro;

import java.util.Scanner;

public class TriangleWithStars {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir Sayý Giriniz :");
		int n = klavye.nextInt();

		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j < (n - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int l = n - 1; l >= 1; l--) {
			for (int m = n; m >= l; m--) {
				System.out.print(" ");
			}
			for (int o = 1; o <= (2 * l - 1); o++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
