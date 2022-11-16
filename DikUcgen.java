package intro;
import java.util.Scanner;

public class DikUcgen {
	
	public static void main(String[] args) {
		//Java ile kullanýcýdan dik kenarlarýnýn uzunluðunu alan ve hipotenüsü  hesaplayan programý yazýn.
		
		int kenar1,kenar2;
		double hipotenus;
		
		Scanner input= new Scanner(System.in);
		System.out.println("1.dik kenarý girin:");
		kenar1=input.nextInt();
		
		System.out.println("2.dik kenarý girin:");
		kenar2= input.nextInt();
		
		hipotenus= Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
		
		System.out.println("Hipotenüs:"+hipotenus);
		
		//Üç kenar uzunluðunu kullanýcýdan aldýðýnýz üçgenin alanýný hesaplayan programý yazýnýz.
		
		int k1,k2,k3;
		
		System.out.println("1.kenarý girin:");
		k1=input.nextInt();
		
		System.out.println("2.kenarý girin:");
		k2= input.nextInt();
		
		System.out.println("3.kenarý girin:");
		k3=input.nextInt();
		
		double uzunluk=(k1+k2+k3)/2;
		double alan= Math.sqrt(uzunluk *(uzunluk - k1)* (uzunluk -k2) * (uzunluk -k3));
		System.out.println("Üçgenin alaný:"+alan);
	}

}
