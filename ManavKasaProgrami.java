package intro;
import java.util.*;
public class ManavKasaProgrami {

	public static void main(String[] args) {
		//Java ile kullanýcýlarýn manavdan almýþ olduklarý ürünlerin kilogram deðerlerine göre toplam tutarýný ekrana yazdýran programý yazýn.
		double armut= 2.14;
		double elma= 3.67 ;
		double domates= 1.11;
		double muz= 0.95;
		double patlican= 5.00;
		double kg,tutar;
		
		Scanner inp= new Scanner(System.in);
		
		System.out.println("Armut kaç kg?");
		kg=inp.nextDouble();
		armut*=kg;
		
		System.out.println("Elma kaç kg?");
		kg=inp.nextDouble();
		elma*=kg;
		
		System.out.println("Domates kaç kg?");
		kg=inp.nextDouble();
		domates*=kg;
		
		System.out.println("Muz kaç kg?");
		kg=inp.nextDouble();
		muz*=kg;
		
		System.out.println("Patlýcan kaç kg?");
		kg=inp.nextDouble();
		patlican*=kg;
		
		tutar=armut+elma+muz+domates+patlican;
		
		System.out.println("Ödenmesi gereken fiyat: "+tutar+"TL");
		
		
	}

}
