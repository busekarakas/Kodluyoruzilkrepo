package intro;

import java.util.Scanner;

public class Exponentiation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base, exponent, result = 1;

		Scanner inp = new Scanner(System.in);
		System.out.println("�ss� al�nacak say�y� girin:");
		base = inp.nextInt();

		System.out.println("�s olacak say�y� girin:");
		exponent = inp.nextInt();

		for (int i = 1; i <= exponent; i++) {
			result *= base;

		}
		System.out.println(result);
	}

}
