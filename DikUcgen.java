package intro;
import java.util.Scanner;

public class DikUcgen {
	
	public static void main(String[] args) {
		//Java ile kullan�c�dan dik kenarlar�n�n uzunlu�unu alan ve hipoten�s�  hesaplayan program� yaz�n.
		
		int kenar1,kenar2;
		double hipotenus;
		
		Scanner input= new Scanner(System.in);
		System.out.println("1.dik kenar� girin:");
		kenar1=input.nextInt();
		
		System.out.println("2.dik kenar� girin:");
		kenar2= input.nextInt();
		
		hipotenus= Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
		
		System.out.println("Hipoten�s:"+hipotenus);
		
		//�� kenar uzunlu�unu kullan�c�dan ald���n�z ��genin alan�n� hesaplayan program� yaz�n�z.
		
		int k1,k2,k3;
		
		System.out.println("1.kenar� girin:");
		k1=input.nextInt();
		
		System.out.println("2.kenar� girin:");
		k2= input.nextInt();
		
		System.out.println("3.kenar� girin:");
		k3=input.nextInt();
		
		double uzunluk=(k1+k2+k3)/2;
		double alan= Math.sqrt(uzunluk *(uzunluk - k1)* (uzunluk -k2) * (uzunluk -k3));
		System.out.println("��genin alan�:"+alan);
	}

}
