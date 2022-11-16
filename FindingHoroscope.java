package intro;
import java.util.*;
public class FindingHoroscope {

	public static void main(String[] args) {
		int day, month;
		 Scanner inp= new Scanner(System.in);
		
	System.out.println("Burcunuzu bulacaðýz. Lütfen ayýn kaçýnda doðduðunuzu girin:");
	day=inp.nextInt();
	
	System.out.println("Lütfen hangi ay doðduðunuzu girin:");
	month=inp.nextInt();
	
	if (day<1 || day>31) {
		System.out.println("Geçersiz giriþ yaptýnýz");
	}
	else if (month<1 || month>12) {
		System.out.println("Geçersiz giriþ yaptýnýz");
	}
	else if(month==2 && day>29) {
		System.out.println("Geçersiz giriþ yaptýnýz");
	}
	
	else {
		
			if((month==3 && day>=21)||(month==4 && day<=20)) {
				System.out.println("Koç burcusunuz");
			}
			else if((month==3 && day<=20)||(month==2 && day>=20)) {
				System.out.println("Balýk burcusunuz");
			}
			else if ((month==4 && day>=21)||(month==5 && day<=21)) {
				System.out.println("Boða burcusunuz");
			}
			
			else if ((month==5 && day>=22)||(month==6 && day<=22)) {
				System.out.println("Ýkizler burcusunuz");
			}
			
			else if ((month==6 && day>=23)||(month==7 && day<=22)) {
				System.out.println("Yengeç burcusunuz");
			}
			
			else if ((month==7 && day>=23)||(month==8 && day<=22)) {
				System.out.println("Aslan burcusunuz");
			}
			
			else if ((month==8 && day>=23)||(month==9 && day<=22)) {
				System.out.println("Baþak burcusunuz");
			}
			
			else if ((month==9 && day>=23)||(month==10 && day<=22)) {
				System.out.println("Terazi burcusunuz");
			}
			
			else if ((month==10 && day>=23)||(month==11 && day<=21)) {
				System.out.println("Akrep burcusunuz");
			}
			
			else if ((month==11 && day>=22)||(month==12 && day<=21)) {
				System.out.println("Yay burcusunuz");
			}
			
			else if ((month==12 && day>=22)||(month==1 && day<=21)) {
				System.out.println("Oðlak burcusunuz");
			}
			
			else if ((month==1 && day>=22)||(month==2 && day<=19)) {
				System.out.println("Kova burcusunuz");
			}
		}
	}
	}


