package intro;

import java.util.Scanner;

public class Exponentiation {

	public static void main(String[] args) {
		// Java döngüler ile girilen sayýya kadar olan 4 ve 5'in kuvvetlerini ekrana
		// yazdýran programý yazýyoruz.

		int s1;

		Scanner inp = new Scanner(System.in);
		System.out.println("Limit sayýyý girin:");
		s1 = inp.nextInt();

		for (int i = 1; i <= s1; i *= 4) {
			System.out.println(i);

		}
		for (int i = 1; i <= s1; i *= 5) {
			System.out.println(i);

		}
	}

}
