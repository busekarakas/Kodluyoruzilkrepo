package intro;

import java.util.Scanner;

public class RecursivePow {
	static int pow(int base, int exponent) {
		int result = 1;

		if (exponent == 0) {
			result = 1;
		} else {
			if (exponent == 1) {
				return base;
			} else {
				result = pow(base, exponent - 1) * base;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int base, exponent, result = 1, select;

		while (true) {
			Scanner inp = new Scanner(System.in);
			System.out.println("�ss� al�nacak say�y� girin:");
			base = inp.nextInt();

			System.out.println("�s olacak say�y� girin:");
			exponent = inp.nextInt();

			System.out.println(pow(base, exponent));

			System.out.println("��k�� yapmak isterseniz 0 a bas�n");
			select = inp.nextInt();
			if (select == 0) {
				break;
			}
		}

	}

}
