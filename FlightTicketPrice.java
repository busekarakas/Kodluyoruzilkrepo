package intro;
import java.util.*;
public class FlightTicketPrice {

	public static void main(String[] args) {
		/*Java ile mesafeye ve �artlara g�re u�ak bileti fiyat� hesaplayan program� yap�n. Kullan�c�dan Mesafe (KM), ya�� ve yolculuk tipi (Tek Y�n, Gidi�-D�n��) bilgilerini al�n.
		 *  Mesafe ba��na �cret 0,10 TL / km olarak al�n. �lk olarak u�u�un toplam fiyat�n� hesaplay�n ve sonras�nda ki ko�ullara g�re m��teriye a�a��daki indirimleri uygulay�n ;

	Kullan�c�dan al�nan de�erler ge�erli (mesafe ve ya� de�erleri pozitif say�, yolculuk tipi ise 1 veya 2) olmal�d�r. 
	Aksi takdirde kullan�c�ya "Hatal� Veri Girdiniz !" �eklinde bir uyar� verilmelidir.
	Ki�i 12 ya��ndan k���kse bilet fiyat� �zerinden %50 indirim uygulan�r.
	Ki�i 12-24 ya�lar� aras�nda ise bilet fiyat� �zerinden %10 indirim uygulan�r.
	Ki�i 65 ya��ndan b�y�k ise bilet fiyat� �zerinden %30 indirim uygulan�r.
	Ki�i "Yolculuk Tipini" gidi� d�n�� se�mi� ise bilet fiyat� �zerinden %20 indirim uygulan�r.*/
		
		double km,normalAmount,discountAmount,discountedAmount ;
		int age,type;
		
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Fiyat hesaplamaya ho�geldiniz. L�tfen ka� km gidece�inizi girin:");
		km=inp.nextDouble();
		
		System.out.println("Ya��n�z� girin:");
		age= inp.nextInt();
		
		System.out.println("Yolculuk tipiniz TEK Y�N ise 1'e G�D��-D�N�� ise 2'ye bas�n ");
		type = inp.nextInt();
		
		if (age<0 || km<0) {
			System.out.println("Hatal� veri girdiniz");
		}
		
		else if (type==1 || type==2) {
			normalAmount=km*0.1;
			System.out.println("Normal tutar="+normalAmount);
			
			if(age<12) {
					discountAmount=normalAmount*0.5;
					discountedAmount=normalAmount- discountAmount;
				}
			else if (age>=12 && age<=24) {
				discountAmount=normalAmount*0.1;
				discountedAmount=normalAmount- discountAmount;
			}
			else if (age>65) {
				discountAmount=normalAmount*0.3;
				discountedAmount=normalAmount- discountAmount;
			}
			else {
				discountedAmount=normalAmount;
			}
			
			if (type ==2) {
			discountAmount=discountedAmount*0.2;
			discountedAmount=(discountedAmount-discountAmount)*2;
			
				}
			System.out.println("�ndirimli toplam tutar�n�z:"+discountedAmount);
		}
		else {
		System.out.println("Hatal� veri girdiniz");
		}
	}

}
