package intro;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1, s2 = 1;
		Scanner inp = new Scanner(System.in);
		System.out.println("girin");
		s1 = inp.nextInt();

		for (int i = 1; i <= s1; i++) {
			s2 *= i;
		}
		System.out.println(s2);
	}

}
