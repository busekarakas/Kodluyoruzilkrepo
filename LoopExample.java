package intro;

import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) {
		/*
		 * Java d�ng�ler ile tek bir say� girilene kadar kullan�c�dan giri�leri kabul
		 * eden ve girilen de�erlerden �ift ve 4'�n katlar� olan say�lar� toplay�p
		 * ekrana basan program� yaz�yoruz.
		 */

		int s1, sum = 0;

		Scanner inp = new Scanner(System.in);

		for (int i; true;) {
			System.out.println("Say� girin:");
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
