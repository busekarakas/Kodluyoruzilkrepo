package intro;

import java.util.Scanner;

public class AtmProject {

	public static void main(String[] args) {
		String passaword, userName;
		int balance = 1500;
		int right = 3; // yanlýþ girme hakký
		int select;
		int amount;
		

		Scanner inp = new Scanner(System.in);

		while (right > 0) {
			System.out.println("Kullanýcý adýnýz:");
			userName = inp.nextLine();
			System.out.println("Þifreniz:");
			passaword = inp.nextLine();

			if (userName.equals("buse") && passaword.equals("1234")) {

				do {
					System.out.println(
							"Baþarýlý giriþ yaptýnýz. Yapmak istediðiniz iþlemi girin.\n 1-Para Yatýrma\n 2-Para Çekme\n 3- Bakiye Sorgulama\n 4- Çýkýþ");
					select = inp.nextInt();

					switch (select) {
					case 1:
						System.out.println("Yatýrmak istediðiniz para miktarýný girin:");
						amount = inp.nextInt();
						balance += amount;
						System.out.println("Ýþlem baþarýlý");
						break;
					case 2:
						System.out.println("Çekmek istediðiniz para miktarýný girin:");
						amount = inp.nextInt();
						if (amount > balance) {
							System.out.println("Bakiyeniz yetersiz");
							break;
						} else {
							balance -= amount;
							System.out.println("Ýþlem baþarýlý");
						}
						break;
					case 3:
						System.out.println("Bakiyeniz:" + balance);
						break;
					case 4:
						System.out.println("Çýkýþ yapýldý");
						right = 0;
						break;
					default:
						System.out.println("Geçersiz bir giriþ yaptýnýz");
					}
				}
				while (select != 4); {
					System.out.println("Görüþmek üzere");
				}
			} else {
				right--;
				System.out.println("Girdiðiniz bilgiler yanlýþ.Lütfen tekrar girin.\n Kalan hakkýnýz:" + right);
				if (right == 0) {
					System.out.println(
							"Tüm hakkýnýzý kullandýnýz. Hesabýnýz kilitlenmiþtir. Bankaya giderek hizmet alabilirsiniz.");
				}
			}
		}

	}

}
