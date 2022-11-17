package intro;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		int year,fourmod,hundredmod;
		
		Scanner inp= new Scanner(System.in);
		System.out.println("Yýlý girin:");
		year=inp.nextInt();
		
		fourmod=year%4;
		hundredmod=year%100;
		
		if(hundredmod==0) {
			if(year%400==0) {
				if(year%4000!=0) {
				System.out.println("Artýk yýldýr");}
				else {System.out.println("Artýk yýl deðildir");
				}
			}
			else {
				System.out.println("Artýk yýl deðildir");
			}
		}
		else if(fourmod==0) {
			System.out.println("Artýk yýldýr");
		}
		else {
			System.out.println("Artýk yýl deðildir");
		}
	}

}
