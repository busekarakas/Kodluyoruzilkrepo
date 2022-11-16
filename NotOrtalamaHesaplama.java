package intro;
import java.util.Scanner;
public class NotOrtalamaHesaplama {

	public static void main(String[] args) {
		
		int matematik,fizik,kimya,turkce,tarih,muzik;
		double ort;
		
		System.out.println("Matemik notunuzu girin:");
		Scanner input = new Scanner(System.in);
		matematik=input.nextInt();
				
		System.out.println("Fizik notunuzu girin:");
		fizik=input.nextInt();
		
		System.out.println("Kimya notunuzu girin:");
		kimya=input.nextInt();
		
		System.out.println("Türkçe notunuzu girin:");
		turkce=input.nextInt();
		
		System.out.println("Tarih notunuzu girin:");
		tarih=input.nextInt();
		
		System.out.println("Müzik notunuzu girin:");
		muzik=input.nextInt();
		
		ort=((matematik+fizik+kimya+turkce+tarih+muzik)/6.0);
		System.out.println("Ortalama:"+ort);
		
		String cikti=(ort<60)? "Kaldý" : "Geçti";
		System.out.println(cikti);
	}

}
