package intro;
import java.util.*;
public class ActivitySuggestion {

	public static void main(String[] args) {
		double derece;
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Hava s�cakl���n� girin:");
		derece=inp.nextDouble();
		//if ile yap�l�rsa 
		if (derece<=5) {
			System.out.println("Kayak yapmaya gidebilirsiniz");
		}
		else if(derece>5 && derece<=15) {
			System.out.println("Sinemaya gidebilirsiniz");
		}
		else if(derece>15 && derece<=25 ) {
			System.out.println("Piknik yapmaya gidebilirsiniz");
		}
		
		else {
			System.out.println("Y�zmeye gidebilirsiniz");
		}
		
		
	}

}
