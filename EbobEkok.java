package intro;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		// girilen iki sayýnýn while döngüsüyle ebob ve ekok unu bulma
		int s1, s2, ebob = 0, ekok;
		int i = 1;
		Scanner inp = new Scanner(System.in);
		System.out.println("Birinci sayýyý girin:");
		s1 = inp.nextInt();

		System.out.println("Ýkinci sayýyý girin:");
		s2 = inp.nextInt();

		while (i <= s1) {

			if (s1 % i == 0 && s2 % i == 0) {
				ebob = i;
			}
			i++;
		}
		System.out.println("Ebob:" + ebob);

		ekok = (s1 * s2) / ebob;
		System.out.println("Ekok:" + ekok);
	}

}
