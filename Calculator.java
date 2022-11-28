package intro;

import java.util.Scanner;

public class Calculator {
	static void plus() {
		int number, sum = 0, i = 1;
		while (true) {
			System.out.println(i + ".say�:");
			Scanner inp = new Scanner(System.in);
			number = inp.nextInt();
			if (number == 0) {
				break;
			}
			sum += number;
			i++;
		}
		System.out.println("Sonu�: " + sum);
	}

	static void minus() {
		int count, number1, result = 0;
		System.out.println("Ka� say� gireceksiniz:");
		Scanner inp = new Scanner(System.in);
		count = inp.nextInt();

		for (int i = 1; i <= count; i++) {
			System.out.println(i + ".say�y� girin:");
			number1 = inp.nextInt();

			if (i == 1) {

				result = number1;
			} else {

				result -= number1;
			}

		}
		System.out.println("Sonu� " + result);
	}

	static void times() {
		int number, result = 1;
		int i = 1;

		while (true) {
			System.out.println(i + ".say�:");
			Scanner inp = new Scanner(System.in);
			number = inp.nextInt();
			if (number == 1) {
				break;
			}
			result *= number;
			i++;

		}
		System.out.println("Sonu�: " + result);
	}

	static void divided() {
		int count;
		double number1, result = 0.0;
		System.out.println("Ka� say� gireceksiniz:");
		Scanner inp = new Scanner(System.in);
		count = inp.nextInt();

		for (int i = 1; i <= count; i++) {
			System.out.println(i + ".say�y� girin:");
			number1 = inp.nextInt();

			if (i == 1) {

				result = number1;
			} else {
				if (number1 == 0) {
					System.out.println("B�leni 0 giremezsiniz");
				} else {
					result /= number1;
				}
			}

		}
		System.out.println("Sonu�: " + result);
	}

	static void power() {
		int base, exponent, result = 1;

		Scanner inp = new Scanner(System.in);
		System.out.println("�ss� al�nacak say�y� girin:");
		base = inp.nextInt();

		System.out.println("�s olacak say�y� girin:");
		exponent = inp.nextInt();

		for (int i = 1; i <= exponent; i++) {
			result *= base;

		}
		System.out.println("Sonu�: " + result);
	}

	static void fac() {
		int s1, result = 1;
		Scanner inp = new Scanner(System.in);
		System.out.println("Faktoriyeli al�nacak say�y� girin:");
		s1 = inp.nextInt();

		for (int i = 1; i <= s1; i++) {
			result *= i;
		}
		System.out.println("Sonu�: " + result);
	}

	static void mod() {
		int result;
		Scanner inp = new Scanner(System.in);
		System.out.println("Modu al�nacak say�y� girin:");
		int number = inp.nextInt();

		System.out.println("Modu girin:");
		int mod = inp.nextInt();

		result = number % mod;
		System.out.println("Sonu�: " + result);

	}

	static void rectangle() {
		int k1, k2;
		Scanner inp = new Scanner(System.in);
		System.out.println("Uzun kenar� girin:");
		k1 = inp.nextInt();

		System.out.println("K�sa kenar� girin:");
		k2 = inp.nextInt();

		int perimeter = (k1 * 2) + (k2 * 2);
		int area = k1 * k2;
		System.out.println("Dikd�rtgenin �evresi: " + perimeter + "\nDikd�rtgenin alan�: " + area);

	}

	public static void main(String[] args) {
		int choice;
		String menu = "1- Toplama ��lemi\n" + "2- ��karma ��lemi\n" + "3- �arpma ��lemi\n" + "4- B�lme i�lemi\n"
				+ "5- �sl� Say� Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n"
				+ "8- Dikd�rtgen Alan ve �evre Hesab�\n" + "0- ��k�� Yap";

		Scanner inp = new Scanner(System.in);

		do {
			System.out.println("Yapmak istedi�iniz i�lemi se�in:\n " + menu);
			choice = inp.nextInt();
			switch (choice) {
			case 1:
				plus();
				break;
			case 2:
				minus();
				break;
			case 3:
				times();
				break;
			case 4:
				divided();
				break;
			case 5:
				power();
				break;
			case 6:
				fac();
				break;
			case 7:
				mod();
				break;
			case 8:
				rectangle();
				break;
			case 0:
				System.out.println("��k�� yap�ld�");
				break;
			default:
				System.out.println("Ge�ersiz giri� yapt�n�z");
			}
		} while (choice != 0);

	}

}
