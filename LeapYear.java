package intro;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		int year,fourmod,hundredmod;
		
		Scanner inp= new Scanner(System.in);
		System.out.println("Y�l� girin:");
		year=inp.nextInt();
		
		fourmod=year%4;
		hundredmod=year%100;
		
		if(hundredmod==0) {
			if(year%400==0) {
				if(year%4000!=0) {
				System.out.println("Art�k y�ld�r");}
				else {System.out.println("Art�k y�l de�ildir");
				}
			}
			else {
				System.out.println("Art�k y�l de�ildir");
			}
		}
		else if(fourmod==0) {
			System.out.println("Art�k y�ld�r");
		}
		else {
			System.out.println("Art�k y�l de�ildir");
		}
	}

}
