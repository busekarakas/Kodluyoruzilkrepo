package intro;
import java.util.Scanner;
public class KdvTutar�Hesaplama {

	public static void main(String[] args) {
		/*Java ile kullan�c�dan al�nan para de�erinin KDV'li fiyat�n� ve KDV tutar�n� hesaplay�p ekrana bast�ran program� yaz�n.
		  E�er girilen tutar 0 ve 1000 TL aras�nda ise KDV oran� %18 , tutar 1000 TL'den b�y�k ise KDV oran�n� %8 olarak KDV tutar� hesaplas�n*/
		double tutar,kdv;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Tutar� girin:");
		tutar= input.nextDouble();
		
		kdv=(tutar>1000)? 0.08:0.18;
		
		double kdvTutar�=tutar*kdv;
		double kdvliTutar =tutar+kdvTutar�;
		
		System.out.println("KDV'siz Fiyat�n�z:"+tutar);
		System.out.println("KDV'li Fiyat�n�z:"+kdvliTutar);
		System.out.println("KDV Tutar�n�z:"+kdvTutar�);
		
	}

}
