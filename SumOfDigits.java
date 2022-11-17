package intro;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Sayýyý girin:");

		int number = inp.nextInt();
		int tempnumber = number;
		int i = 0, mod, sum = 0;
		while (tempnumber != 0) {
			tempnumber /= 10;
			i++;
		}
		tempnumber = number;

		while (tempnumber != 0) {
			mod = tempnumber % 10;
			sum += mod;

			tempnumber /= 10;
			if (tempnumber % 10 == 0) {
				tempnumber /= 10;
			}
		}
		System.out.println(sum);
	}

}
