package intro;

import java.util.Scanner;

public class ResursivePattern {

	static void pattern(int number, int fix) {

		int result = number;

		System.out.print(number + " ");
		if (result > 0) {
			result -= 5;
			pattern(number - 5, fix);
		} else {
			patternplus(result, fix);
		}

	}

	static void patternplus(int rise, int fix) {
		int result1 = rise + 5;

		if (result1 <= fix) {
			System.out.print(result1 + " ");
			patternplus(rise + 5, fix);
		}
	}

	public static void main(String[] args) {
		int number, fix;
		Scanner inp = new Scanner(System.in);
		System.out.print("Say�:");
		number = inp.nextInt();
		fix = number;
		pattern(number, fix);

	}

}
/*
 * Girilen say� 0 veya negatif oldu�u yere kadar girilen say�dan 5 rakam�n�
 * ��kar�n. Her ��karma i�lemi s�ras�nda ekrana son de�eri yazd�r�n. Say�
 * negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme i�leminde
 * say�n�n son de�erini ekrana yazd�r�n.
 */