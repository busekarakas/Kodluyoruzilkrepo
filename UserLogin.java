package intro;
import java.util.*;
public class UserLogin {

	public static void main(String[] args) {
		/*E�er �ifre yanl�� ise kullan�c�ya �ifresini s�f�rlay�p s�f�rlamayaca��n� sorun,
		 *  e�er kullan�c� s�f�rlamak isterse yeni girdi�i �ifrenin hatal� girdi�i ve unuttu�u �ifre ile ayn� olmamas� gerekti�ini kontrol edip , 
		 *  �ifreler ayn� ise ekrana "�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz." sorun yoksa "�ifre olu�turuldu" yazan program� yaz�n�z.*/
		
		String userName,passaword,passawordd;
		int control;
		Scanner inp= new Scanner(System.in);
		System.out.println("Kullan�c� ad�n�z� girin:");
		userName=inp.nextLine();
		
		System.out.println("�ifrenizi girin:");
		passaword=inp.nextLine();
		
		if (passaword.equals("1234")){
			System.out.println("Oturum a��ld�");
		}
		else {
			System.out.println("Girilen �ifre yanl��. �ifre s�f�rlamak ister misiniz? Evet ise 1'e Hay�r ise 0'a bas�n");
			control=inp.nextInt();
			if (control==1){
				System.out.println("Yeni �ifrenizi girin:");
				passawordd=inp.next();
				
				if (passawordd.equals("1234")) {
					System.out.println("Yeni �ifreniz eskisiyle ayn� olamaz. Oturum a��lamad�");
					
				}else {
					System.out.println("�ifre olu�turuldu: "+passawordd);
				}
			}
			else if (control==0) {
				System.out.println("Oturum a��lmad�");
			}else {
				System.out.println("Ge�erli griri� yapmad�n�z");
			}
			
		}
	}

}
