package intro;
import java.util.Scanner;
public class Daire {

	public static void main(String[] args) {
		//Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
		
		int r;
		double pi=3.14;

		Scanner inp= new Scanner(System.in);
		System.out.println("Yarıçapı girin:");
		r=inp.nextInt();
		
		double alan= pi*r*r;
		double cevre=2*pi*r;
		
		System.out.println("Dairenin alanı:"+alan+"\nDairenin çevresi: "+cevre);
		
		//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
		int alfa;
		System.out.println("Yarıçapı girin:");
		r=inp.nextInt();
		System.out.println("Açıyı  girin:");
		alfa=inp.nextInt();
		
		alan=(pi*(r*r)*alfa)/360;
		
		System.out.println("Dairenin alanı:"+alan);
	}

}
