package intro;
import java.util.*;
public class VucutKitleIndeksi {

	public static void main(String[] args) {
		/*Java ile kullanýcýdan boy ve kilo deðerlerini alýp bir deðiþkene atayýn.
		Aþaðýdaki formüle göre kullanýcýnýn "Vücut Kitle Ýndeks" deðerini hesaplayýp ekrana yazdýrýn.*/
		
		double boy,kilo;
		Scanner inp= new Scanner(System.in);
		System.out.println("Boyunuzu girin(metre cinsinden):");
		boy=inp.nextDouble();
		System.out.println("Kilonuzu girin:");
		kilo=inp.nextDouble();
		
		double indeks=kilo/(boy*boy);
		System.out.println("Ýndeksiniz:"+indeks);
	}

}
