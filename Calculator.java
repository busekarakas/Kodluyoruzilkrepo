package intro;

import java.util.Scanner;

public class Calculator {
	static void plus() {
		int number, sum = 0, i = 1;
		while (true) {
			System.out.println(i + ".sayý:");
			Scanner inp = new Scanner(System.in);
			number = inp.nextInt();
			if (number == 0) {
				break;
			}
			sum += number;
			i++;
		}
		System.out.println("Sonuç: " + sum);
	}

	static void minus() {
		int count, number1, result = 0;
		System.out.println("Kaç sayý gireceksiniz:");
		Scanner inp = new Scanner(System.in);
		count = inp.nextInt();

		for (int i = 1; i <= count; i++) {
			System.out.println(i + ".sayýyý girin:");
			number1 = inp.nextInt();

			if (i == 1) {

				result = number1;
			} else {

				result -= number1;
			}

		}
		System.out.println("Sonuç " + result);
	}

	static void times() {
		int number, result = 1;
		int i = 1;

		while (true) {
			System.out.println(i + ".sayý:");
			Scanner inp = new Scanner(System.in);
			number = inp.nextInt();
			if (number == 1) {
				break;
			}
			result *= number;
			i++;

		}
		System.out.println("Sonuç: " + result);
	}

	static void divided() {
		int count;
		double number1, result = 0.0;
		System.out.println("Kaç sayý gireceksiniz:");
		Scanner inp = new Scanner(System.in);
		count = inp.nextInt();

		for (int i = 1; i <= count; i++) {
			System.out.println(i + ".sayýyý girin:");
			number1 = inp.nextInt();

			if (i == 1) {

				result = number1;
			} else {
				if (number1 == 0) {
					System.out.println("Böleni 0 giremezsiniz");
				} else {
					result /= number1;
				}
			}

		}
		System.out.println("Sonuç: " + result);
	}

	static void power() {
		int base, exponent, result = 1;

		Scanner inp = new Scanner(System.in);
		System.out.println("Üssü alýnacak sayýyý girin:");
		base = inp.nextInt();

		System.out.println("Üs olacak sayýyý girin:");
		exponent = inp.nextInt();

		for (int i = 1; i <= exponent; i++) {
			result *= base;

		}
		System.out.println("Sonuç: " + result);
	}

	static void fac() {
		int s1, result = 1;
		Scanner inp = new Scanner(System.in);
		System.out.println("Faktoriyeli alýnacak sayýyý girin:");
		s1 = inp.nextInt();

		for (int i = 1; i <= s1; i++) {
			result *= i;
		}
		System.out.println("Sonuç: " + result);
	}

	static void mod() {
		int result;
		Scanner inp = new Scanner(System.in);
		System.out.println("Modu alýnacak sayýyý girin:");
		int number = inp.nextInt();

		System.out.println("Modu girin:");
		int mod = inp.nextInt();

		result = number % mod;
		System.out.println("Sonuç: " + result);

	}

	static void rectangle() {
		int k1, k2;
		Scanner inp = new Scanner(System.in);
		System.out.println("Uzun kenarý girin:");
		k1 = inp.nextInt();

		System.out.println("Kýsa kenarý girin:");
		k2 = inp.nextInt();

		int perimeter = (k1 * 2) + (k2 * 2);
		int area = k1 * k2;
		System.out.println("Dikdörtgenin çevresi: " + perimeter + "\nDikdörtgenin alaný: " + area);

	}

	public static void main(String[] args) {
		int choice;
		String menu = "1- Toplama Ýþlemi\n" + "2- Çýkarma Ýþlemi\n" + "3- Çarpma Ýþlemi\n" + "4- Bölme iþlemi\n"
				+ "5- Üslü Sayý Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n"
				+ "8- Dikdörtgen Alan ve Çevre Hesabý\n" + "0- Çýkýþ Yap";

		Scanner inp = new Scanner(System.in);

		do {
			System.out.println("Yapmak istediðiniz iþlemi seçin:\n " + menu);
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
				System.out.println("Çýkýþ yapýldý");
				break;
			default:
				System.out.println("Geçersiz giriþ yaptýnýz");
			}
		} while (choice != 0);

	}

}
