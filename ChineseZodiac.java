package intro;
import java.util.*;
public class ChineseZodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,mod;
		 Scanner inp= new Scanner(System.in);
		 System.out.println("Do�um y�l�n�z� girin:");
		 year=inp.nextInt();
		 
		 mod=year%12;
		 
		 switch(mod) {
		 case 0:
			 System.out.println("�in zodya�� burcunuz: Maymun");
			 break;
			 
		 case 1:
			 System.out.println("�in zodya�� burcunuz: Horoz");
			 break;
			 
		 case 2:
			 System.out.println("�in zodya�� burcunuz: K�pek");
			 break;
			 
		 case 3:
			 System.out.println("�in zodya�� burcunuz: Domuz");
			 break;
			 
		 case 4:
			 System.out.println("�in zodya�� burcunuz: Fare");
			 break;
			 
		 case 5:
			 System.out.println("�in zodya�� burcunuz: �k�z");
			 break;
			 
		 case 6:
			 System.out.println("�in zodya�� burcunuz: Kaplan");
			 break;
			 
		 case 7:
			 System.out.println("�in zodya�� burcunuz: Tav�an");
			 break;
			 
		 case 8:
			 System.out.println("�in zodya�� burcunuz: Ejderha");
			 break;
			 
		 case 9:
			 System.out.println("�in zodya�� burcunuz: Y�lan");
			 break;
			 
		 case 10:
			 System.out.println("�in zodya�� burcunuz: At");
			 break;
			 
		 case 11:
			 System.out.println("�in zodya�� burcunuz: Koyun");
			 break;
			 
		 }
	}

}
