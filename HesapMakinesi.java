package intro;
import java.util.*;
public class HesapMakinesi {

	public static void main(String[] args) {
		// switch case ile hesap makinesi
		
		int s1,s2,select;
		
		Scanner inp= new Scanner(System.in);
		System.out.println("Birinci say�y� girin:");
		s1=inp.nextInt();
		
		System.out.println("2.say�y� girin:");
		s2=inp.nextInt();
		
		System.out.println("1-Toplama \n2-��karma \n3-�arpma \n4-B�lme");
		System.out.println("��lemi se�in:");
		
		select=inp.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("Toplama i�lemi sonucu:");
			System.out.println(s1+s2);
			break;
		case 2:
			System.out.println("��karma i�lemi sonucu:");
			System.out.println(s1-s2);
			break;
		case 3:
			System.out.println("�arpma i�lemi sonucu:");
			System.out.println(s1*s2);
			break;
		case 4:
			System.out.println("B�lme i�lemi sonucu:");
			System.out.println(s1/s2);
			break;
		default:
			System.out.println("Ge�erli bir de�er girmediniz");
		}
	}

}
