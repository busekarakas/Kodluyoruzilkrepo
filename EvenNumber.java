package intro;
import java.util.*;
public class EvenNumber {

	public static void main(String[] args) {
		// Çift sayý ve girilen sayýyýya kadar 3 e ve 4 e tam bölünen sayýlar
		
		int k;
		Scanner inp= new Scanner(System.in);
		System.out.println("Sayý girin:");
		k=inp.nextInt();
		
		for(int i=0;i<k;i++) {
			if(i%2==0) {
				System.out.println("Çift sayýlar:"+i);
			}
			
		}
		for(int j=0;j<k;j++) {
			if(j%3==0 && j%4==0) {
				System.out.println("3 ün ve 4 ün katlarý:"+j);
			}
		}
		
		
	}

}
