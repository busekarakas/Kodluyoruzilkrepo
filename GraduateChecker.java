package intro;
import java.util.*;
public class GraduateChecker {

	public static void main(String[] args) {
		//E�er girilen ders notlar� 0 veya 100 aras�nda de�il ise ortalamaya kat�lmas�n.Ge�me notu:55
		
		int matematik,fizik,turkce,kimya,muzik;
		double sum=0;
		int count=0;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Matematik notunu girin:");
		matematik= inp.nextInt();
		if (!(matematik<=0 || matematik>=100)) {
			sum+=matematik;
			count++;
		}
		
		System.out.println("Fizik notunu girin:");
		fizik= inp.nextInt();
		if (!(fizik<=0 || fizik>=100)) {
			sum+=fizik;
			count++;
		}
		
		System.out.println("T�rk�e notunu girin:");
		turkce= inp.nextInt();
		if (!(turkce<=0 || turkce>=100)) {
			sum+=turkce;
			count++;
		}
		
		System.out.println("Kimya notunu girin:");
		kimya= inp.nextInt();
		if (!(kimya<=0 || kimya>=100)) {
			sum+=kimya;
			count++;
		}
		
		System.out.println("M�zik notunu girin:");
		muzik= inp.nextInt();
		if (!(muzik<=0 || muzik>=100)) {
			sum+=muzik;
			count++;
		}
		double avg=sum/count;
		
		
		System.out.println("Ortalaman�z: "+avg);
		if (avg<55) {
			System.out.println("Kald�n�z");
		}else {
			System.out.println("Ge�tiniz");
		}
			
		}
		
	}


