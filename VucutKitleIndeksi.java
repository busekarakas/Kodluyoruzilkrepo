package intro;
import java.util.*;
public class VucutKitleIndeksi {

	public static void main(String[] args) {
		/*Java ile kullan�c�dan boy ve kilo de�erlerini al�p bir de�i�kene atay�n.
		A�a��daki form�le g�re kullan�c�n�n "V�cut Kitle �ndeks" de�erini hesaplay�p ekrana yazd�r�n.*/
		
		double boy,kilo;
		Scanner inp= new Scanner(System.in);
		System.out.println("Boyunuzu girin(metre cinsinden):");
		boy=inp.nextDouble();
		System.out.println("Kilonuzu girin:");
		kilo=inp.nextDouble();
		
		double indeks=kilo/(boy*boy);
		System.out.println("�ndeksiniz:"+indeks);
	}

}
