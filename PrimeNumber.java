package intro;

public class PrimeNumber {

	public static void main(String[] args) {
		// 1 - 100 arasýndaki asal sayýlarý ekrana yazdýran program.

		for (int i = 2; i < 100; i++) {

			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
				System.out.println(i);
			}
			if (i == 2 || i == 3 || i == 5 || i == 7) {
				System.out.println(i);
			}
		}

	}

}
