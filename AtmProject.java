package intro;

import java.util.Scanner;

public class AtmProject {

	public static void main(String[] args) {
		String passaword, userName;
		int balance = 1500;
		int right = 3; // yanl�� girme hakk�
		int select;
		int amount;
		

		Scanner inp = new Scanner(System.in);

		while (right > 0) {
			System.out.println("Kullan�c� ad�n�z:");
			userName = inp.nextLine();
			System.out.println("�ifreniz:");
			passaword = inp.nextLine();

			if (userName.equals("buse") && passaword.equals("1234")) {

				do {
					System.out.println(
							"Ba�ar�l� giri� yapt�n�z. Yapmak istedi�iniz i�lemi girin.\n 1-Para Yat�rma\n 2-Para �ekme\n 3- Bakiye Sorgulama\n 4- ��k��");
					select = inp.nextInt();

					switch (select) {
					case 1:
						System.out.println("Yat�rmak istedi�iniz para miktar�n� girin:");
						amount = inp.nextInt();
						balance += amount;
						System.out.println("��lem ba�ar�l�");
						break;
					case 2:
						System.out.println("�ekmek istedi�iniz para miktar�n� girin:");
						amount = inp.nextInt();
						if (amount > balance) {
							System.out.println("Bakiyeniz yetersiz");
							break;
						} else {
							balance -= amount;
							System.out.println("��lem ba�ar�l�");
						}
						break;
					case 3:
						System.out.println("Bakiyeniz:" + balance);
						break;
					case 4:
						System.out.println("��k�� yap�ld�");
						right = 0;
						break;
					default:
						System.out.println("Ge�ersiz bir giri� yapt�n�z");
					}
				}
				while (select != 4); {
					System.out.println("G�r��mek �zere");
				}
			} else {
				right--;
				System.out.println("Girdi�iniz bilgiler yanl��.L�tfen tekrar girin.\n Kalan hakk�n�z:" + right);
				if (right == 0) {
					System.out.println(
							"T�m hakk�n�z� kulland�n�z. Hesab�n�z kilitlenmi�tir. Bankaya giderek hizmet alabilirsiniz.");
				}
			}
		}

	}

}
