package intro;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub C(n,r) = n! / (r! * (n-r)!)
		Scanner inp = new Scanner(System.in);

		int n1, r1, n2 = 1, r2 = 1, s2 = 1, result;

		System.out.print("Kombinasyon ifadesinin gösterimi, C(n,r) þeklindedir.\nLütfen 'n' sayýsýný giriniz: ");
		n1 = inp.nextInt();
		System.out.print("Lütfen 'r' sayýsýný giriniz: ");
		r1 = inp.nextInt();

		int s1 = n1 - r1;

		for (int i = 1; i <= n1; i++) {
			n2 *= i;
		}

		for (int i = 1; i <= r1; i++) {
			r2 *= i;
		}

		for (int i = 1; i <= s1; i++) {
			s2 *= i;
		}
		result = n2 / (r2 * s2);
		System.out.println("C(" + n1 + "," + r1 + "):"+result);
	}

}
