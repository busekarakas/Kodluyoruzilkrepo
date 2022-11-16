package intro;
import java.util.Scanner;
public class Taksimetre {

	public static void main(String[] args) {
		//Java ile gidilen mesafeye (KM) göre taksimetre tutarýný ekrana yazdýran programý yazýn.
		
		int acilis=10,km;
		double ucret,kmucret=2.2;
		
		System.out.println("Taksimize hoþ geldiniz. Açýlýþ ücretimiz 10 TL'dir.");

		Scanner inp= new Scanner(System.in);
		System.out.println("Müþteri kaç km gitti:");
		km=inp.nextInt();
		ucret=(km*kmucret)+acilis;
		System.out.println("Tutan miktar:");
		ucret=(ucret<20)? 20:ucret;
		System.out.println(ucret+" TL");	
	}

}
