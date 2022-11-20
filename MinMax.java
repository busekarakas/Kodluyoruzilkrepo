package intro;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// klavyeden girilen N tane sayma sayýsýndan en büyük ve en küçük sayýlarý bulan
		// ve bu sayýlarý ekrana yazan program
		int min = 0, max = 0, temp = 0;
		int count;

		Scanner inp = new Scanner(System.in);
		System.out.println("Kaç tane sayý gireceksiniz:");
		count = inp.nextInt();

		for (int i = 1; i <= count; i++) {
			System.out.println("Sayıyı girin:");
			if (i == 1) {
				min = inp.nextInt();
				max = min;
			} else {
				temp = inp.nextInt();
				if (temp < min) {
					min = temp;
				}
				if (temp > max) {
					max = temp;
				}
			}

		}
		System.out.println("En küçük sayý:" + min);
		System.out.println("En büyük sayý:" + max);
	}

}
