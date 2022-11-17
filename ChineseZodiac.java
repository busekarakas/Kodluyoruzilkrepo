package intro;
import java.util.*;
public class ChineseZodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,mod;
		 Scanner inp= new Scanner(System.in);
		 System.out.println("Doðum yýlýnýzý girin:");
		 year=inp.nextInt();
		 
		 mod=year%12;
		 
		 switch(mod) {
		 case 0:
			 System.out.println("Çin zodyaðý burcunuz: Maymun");
			 break;
			 
		 case 1:
			 System.out.println("Çin zodyaðý burcunuz: Horoz");
			 break;
			 
		 case 2:
			 System.out.println("Çin zodyaðý burcunuz: Köpek");
			 break;
			 
		 case 3:
			 System.out.println("Çin zodyaðý burcunuz: Domuz");
			 break;
			 
		 case 4:
			 System.out.println("Çin zodyaðý burcunuz: Fare");
			 break;
			 
		 case 5:
			 System.out.println("Çin zodyaðý burcunuz: Öküz");
			 break;
			 
		 case 6:
			 System.out.println("Çin zodyaðý burcunuz: Kaplan");
			 break;
			 
		 case 7:
			 System.out.println("Çin zodyaðý burcunuz: Tavþan");
			 break;
			 
		 case 8:
			 System.out.println("Çin zodyaðý burcunuz: Ejderha");
			 break;
			 
		 case 9:
			 System.out.println("Çin zodyaðý burcunuz: Yýlan");
			 break;
			 
		 case 10:
			 System.out.println("Çin zodyaðý burcunuz: At");
			 break;
			 
		 case 11:
			 System.out.println("Çin zodyaðý burcunuz: Koyun");
			 break;
			 
		 }
	}

}
