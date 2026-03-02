package ilk;

import java.util.Scanner;

public class UcakBiletiHesaplama {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int km,yas,tip,toplamFiyat;
		System.out.print("Mesafeyi Giriniz: ");
		km=scan.nextInt();
		System.out.print("Yaşnızı Giriniz: ");
		yas=scan.nextInt();
		System.out.print("Yolculuk Tipini Seçiniz (1=Tek Gidiş , 2=Gidiş/Dönüş): ");
		tip=scan.nextInt();
		
		double normalFiyat,yasİndirimi,tipİndirimi;
		if (km>0 && yas>0 && (tip==1) || tip==2) {
			normalFiyat = km*0.10;
			if (yas<12) {
				yasİndirimi=normalFiyat*0.5;
				normalFiyat-=yasİndirimi;
			}
			else if (yas>=12 && yas<=24) {
				yasİndirimi=normalFiyat*0.1;
				normalFiyat-=yasİndirimi;
			}
			else if (yas>65) {
				yasİndirimi=normalFiyat*0.3;
				normalFiyat-=yasİndirimi;
			}
			if (tip==2) {
				tipİndirimi=normalFiyat*0.2;
				normalFiyat=(normalFiyat-tipİndirimi)*2;
			}
			System.out.println("Uçak Biletinizin Tutarı Hesaplanmıştır: "+normalFiyat+"$");
		}
		else {
			System.out.println("Girdiğiniz Değerler Eksik Ve Hatalıdır Lütfen Tekrar Deneyiniz.");
		}
		
		
	}

}
