package intro;
import java.util.Scanner;
public class KdvTutarýHesaplama {

	public static void main(String[] args) {
		/*Java ile kullanýcýdan alýnan para deðerinin KDV'li fiyatýný ve KDV tutarýný hesaplayýp ekrana bastýran programý yazýn.
		  Eðer girilen tutar 0 ve 1000 TL arasýnda ise KDV oraný %18 , tutar 1000 TL'den büyük ise KDV oranýný %8 olarak KDV tutarý hesaplasýn*/
		double tutar,kdv;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Tutarý girin:");
		tutar= input.nextDouble();
		
		kdv=(tutar>1000)? 0.08:0.18;
		
		double kdvTutarý=tutar*kdv;
		double kdvliTutar =tutar+kdvTutarý;
		
		System.out.println("KDV'siz Fiyatýnýz:"+tutar);
		System.out.println("KDV'li Fiyatýnýz:"+kdvliTutar);
		System.out.println("KDV Tutarýnýz:"+kdvTutarý);
		
	}

}
