package intro;
import java.util.*;
public class UserLogin {

	public static void main(String[] args) {
		/*Eðer þifre yanlýþ ise kullanýcýya þifresini sýfýrlayýp sýfýrlamayacaðýný sorun,
		 *  eðer kullanýcý sýfýrlamak isterse yeni girdiði þifrenin hatalý girdiði ve unuttuðu þifre ile ayný olmamasý gerektiðini kontrol edip , 
		 *  þifreler ayný ise ekrana "Þifre oluþturulamadý, lütfen baþka þifre giriniz." sorun yoksa "Þifre oluþturuldu" yazan programý yazýnýz.*/
		
		String userName,passaword,passawordd;
		int control;
		Scanner inp= new Scanner(System.in);
		System.out.println("Kullanýcý adýnýzý girin:");
		userName=inp.nextLine();
		
		System.out.println("Þifrenizi girin:");
		passaword=inp.nextLine();
		
		if (passaword.equals("1234")){
			System.out.println("Oturum açýldý");
		}
		else {
			System.out.println("Girilen þifre yanlýþ. Þifre sýfýrlamak ister misiniz? Evet ise 1'e Hayýr ise 0'a basýn");
			control=inp.nextInt();
			if (control==1){
				System.out.println("Yeni þifrenizi girin:");
				passawordd=inp.next();
				
				if (passawordd.equals("1234")) {
					System.out.println("Yeni þifreniz eskisiyle ayný olamaz. Oturum açýlamadý");
					
				}else {
					System.out.println("Þifre oluþturuldu: "+passawordd);
				}
			}
			else if (control==0) {
				System.out.println("Oturum açýlmadý");
			}else {
				System.out.println("Geçerli gririþ yapmadýnýz");
			}
			
		}
	}

}
