package intro;
import java.util.*;
public class NumberSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,s3;
		
		Scanner inp= new Scanner(System.in);
		System.out.println("1.sayýyý girin:");
		s1=inp.nextInt();
		
		System.out.println("2.sayýyý girin:");
		s2=inp.nextInt();
		
		System.out.println("3.sayýyý girin:");
		s3=inp.nextInt();
		
		if (s1<s2 && s1<s3) {
			if(s2<s3) {
				System.out.println(s1+" "+s2+" "+s3);
			}else {System.out.println(s1+" "+s3+" "+s2);}
			
			}
		 else if  (s2<s1 && s2<s3) {
			 if(s1<s3) {
					System.out.println(s2+" "+s1+" "+s3);
				}else {System.out.println(s2+" "+s3+" "+s1);}
				
				}
		 else if(s3<s1 && s3<s2) {
			 if(s1<s2) {
					System.out.println(s3+" "+s1+" "+s2);
				}else {System.out.println(s3+" "+s2+" "+s1);}
		 }
		}
		
	}



