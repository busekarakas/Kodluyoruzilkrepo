package intro;
import java.util.*;
public class HesapMakinesi {

	public static void main(String[] args) {
		// switch case ile hesap makinesi
		
		int s1,s2,select;
		
		Scanner inp= new Scanner(System.in);
		System.out.println("Birinci sayýyý girin:");
		s1=inp.nextInt();
		
		System.out.println("2.sayýyý girin:");
		s2=inp.nextInt();
		
		System.out.println("1-Toplama \n2-Çýkarma \n3-Çarpma \n4-Bölme");
		System.out.println("Ýþlemi seçin:");
		
		select=inp.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("Toplama iþlemi sonucu:");
			System.out.println(s1+s2);
			break;
		case 2:
			System.out.println("Çýkarma iþlemi sonucu:");
			System.out.println(s1-s2);
			break;
		case 3:
			System.out.println("Çarpma iþlemi sonucu:");
			System.out.println(s1*s2);
			break;
		case 4:
			System.out.println("Bölme iþlemi sonucu:");
			System.out.println(s1/s2);
			break;
		default:
			System.out.println("Geçerli bir deðer girmediniz");
		}
	}

}
