package intro;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// M�kemmel say� program�.Bir say�n�n kendisi hari� pozitif tam say� �arpanlar�
		// (kalans�z b�len say�lar�n) toplam� kendisine e�it olan say�ya m�kemmel say�
		// denir.

		int s1, sum = 0;

		Scanner inp = new Scanner(System.in);
		System.out.println("Say� girin:");
		s1 = inp.nextInt();

		for (int i = 1; i <= s1 / 2; i++) {
			if (s1 % i == 0) {
				sum += i;
			}
		}
		if (s1 == sum) {
			System.out.println(s1 + " M�kemmel say�d�r");
		} else {
			System.out.println(s1 + " M�kemmel say� de�ildir");
		}
	}

}
