package intro;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Sayýyý girin:");

		int number = inp.nextInt();
		
		int tempnumber = number;
		int i = 0, s, exp = 1, result = 0;

		while (tempnumber != 0) {
			tempnumber /= 10;
			i++;
		}
		tempnumber = number;

		while (tempnumber != 0) {
			s = tempnumber % 10;
			for (int j = 1; j <= i; j++) {
				exp *= s;

			}
			result += exp;
			exp = 1;
			tempnumber /= 10;
			if (tempnumber % 10 == 0) {
				tempnumber /= 10;
			}
		}
		System.out.println(result);
	}

}
