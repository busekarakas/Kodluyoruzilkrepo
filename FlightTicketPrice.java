package intro;
import java.util.*;
public class FlightTicketPrice {

	public static void main(String[] args) {
		/*Java ile mesafeye ve þartlara göre uçak bileti fiyatý hesaplayan programý yapýn. Kullanýcýdan Mesafe (KM), yaþý ve yolculuk tipi (Tek Yön, Gidiþ-Dönüþ) bilgilerini alýn.
		 *  Mesafe baþýna ücret 0,10 TL / km olarak alýn. Ýlk olarak uçuþun toplam fiyatýný hesaplayýn ve sonrasýnda ki koþullara göre müþteriye aþaðýdaki indirimleri uygulayýn ;

	Kullanýcýdan alýnan deðerler geçerli (mesafe ve yaþ deðerleri pozitif sayý, yolculuk tipi ise 1 veya 2) olmalýdýr. 
	Aksi takdirde kullanýcýya "Hatalý Veri Girdiniz !" þeklinde bir uyarý verilmelidir.
	Kiþi 12 yaþýndan küçükse bilet fiyatý üzerinden %50 indirim uygulanýr.
	Kiþi 12-24 yaþlarý arasýnda ise bilet fiyatý üzerinden %10 indirim uygulanýr.
	Kiþi 65 yaþýndan büyük ise bilet fiyatý üzerinden %30 indirim uygulanýr.
	Kiþi "Yolculuk Tipini" gidiþ dönüþ seçmiþ ise bilet fiyatý üzerinden %20 indirim uygulanýr.*/
		
		double km,normalAmount,discountAmount,discountedAmount ;
		int age,type;
		
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Fiyat hesaplamaya hoþgeldiniz. Lütfen kaç km gideceðinizi girin:");
		km=inp.nextDouble();
		
		System.out.println("Yaþýnýzý girin:");
		age= inp.nextInt();
		
		System.out.println("Yolculuk tipiniz TEK YÖN ise 1'e GÝDÝÞ-DÖNÜÞ ise 2'ye basýn ");
		type = inp.nextInt();
		
		if (age<0 || km<0) {
			System.out.println("Hatalý veri girdiniz");
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
			System.out.println("Ýndirimli toplam tutarýnýz:"+discountedAmount);
		}
		else {
		System.out.println("Hatalý veri girdiniz");
		}
	}

}
