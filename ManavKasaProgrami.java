package intro;
import java.util.*;
public class ManavKasaProgrami {

	public static void main(String[] args) {
		//Java ile kullan�c�lar�n manavdan alm�� olduklar� �r�nlerin kilogram de�erlerine g�re toplam tutar�n� ekrana yazd�ran program� yaz�n.
		double armut= 2.14;
		double elma= 3.67 ;
		double domates= 1.11;
		double muz= 0.95;
		double patlican= 5.00;
		double kg,tutar;
		
		Scanner inp= new Scanner(System.in);
		
		System.out.println("Armut ka� kg?");
		kg=inp.nextDouble();
		armut*=kg;
		
		System.out.println("Elma ka� kg?");
		kg=inp.nextDouble();
		elma*=kg;
		
		System.out.println("Domates ka� kg?");
		kg=inp.nextDouble();
		domates*=kg;
		
		System.out.println("Muz ka� kg?");
		kg=inp.nextDouble();
		muz*=kg;
		
		System.out.println("Patl�can ka� kg?");
		kg=inp.nextDouble();
		patlican*=kg;
		
		tutar=armut+elma+muz+domates+patlican;
		
		System.out.println("�denmesi gereken fiyat: "+tutar+"TL");
		
		
	}

}
