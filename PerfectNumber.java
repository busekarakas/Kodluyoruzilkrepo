package intro;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// Mükemmel sayý programý.Bir sayýnýn kendisi hariç pozitif tam sayý çarpanlarý
		// (kalansýz bölen sayýlarýn) toplamý kendisine eþit olan sayýya mükemmel sayý
		// denir.

		int s1, sum = 0;

		Scanner inp = new Scanner(System.in);
		System.out.println("Sayý girin:");
		s1 = inp.nextInt();

		for (int i = 1; i <= s1 / 2; i++) {
			if (s1 % i == 0) {
				sum += i;
			}
		}
		if (s1 == sum) {
			System.out.println(s1 + " Mükemmel sayýdýr");
		} else {
			System.out.println(s1 + " Mükemmel sayý deðildir");
		}
	}

}
