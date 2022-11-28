package intro;

import java.util.Scanner;

public class PalindromNumber {
	static boolean isPalidrom(int number) {
		int temp = number, reservenumber = 0, lastnumber;
		while (temp != 0) {
			lastnumber = temp % 10;
			reservenumber = (reservenumber * 10) + lastnumber;
			temp /= 10;
		}
		if (reservenumber == number) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int number;
		Scanner inp = new Scanner(System.in);

		System.out.println("Sayıyı girin:");
		number = inp.nextInt();
		if (isPalidrom(number) == true) {
			System.out.println(number + " sayısı palindrom bir sayıdır");
		} else {
			System.out.println(number + " sayısı palindrom bir sayı değildir");
		}
	}

}
