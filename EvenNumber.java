package intro;
import java.util.*;
public class EvenNumber {

	public static void main(String[] args) {
		// �ift say� ve girilen say�y�ya kadar 3 e ve 4 e tam b�l�nen say�lar
		
		int k;
		Scanner inp= new Scanner(System.in);
		System.out.println("Say� girin:");
		k=inp.nextInt();
		
		for(int i=0;i<k;i++) {
			if(i%2==0) {
				System.out.println("�ift say�lar:"+i);
			}
			
		}
		for(int j=0;j<k;j++) {
			if(j%3==0 && j%4==0) {
				System.out.println("3 �n ve 4 �n katlar�:"+j);
			}
		}
		
		
	}

}
