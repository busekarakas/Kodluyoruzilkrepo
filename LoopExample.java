package intro;

import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) {
		/*
		 * Java döngüler ile tek bir sayý girilene kadar kullanýcýdan giriþleri kabul
		 * eden ve girilen deðerlerden çift ve 4'ün katlarý olan sayýlarý toplayýp
		 * ekrana basan programý yazýyoruz.
		 */

		int s1, sum = 0;

		Scanner inp = new Scanner(System.in);

		for (int i; true;) {
			System.out.println("Sayý girin:");
			s1 = inp.nextInt();
			if (s1 % 2 != 0) {
				break;
			} else if (s1 % 4 == 0) {
				sum += s1;
			}

		}
		System.out.println("Toplam:" + sum);
	}

}
