package JavaProjects.P09_kitapYonetimi.kitapYonetimi01;

import java.util.Scanner;

public class Kitapcı_Main {

	public static void main(String[] args) {

		/*
		 * ==================== PROJE==============================
		 * bir kitapci icin program yazalim kitap no 1000'den baslayacak sirali no olsun program
		 * baslayinca menu isminde bir method calissin
		 * 1-kitap ekle
		 * 2-numara ile kitap goruntule
		 * 3-bilgi ile kitap goruntule
		 * 4-numara ile kitap sil
		 * 5-tum kitaplari listele
		 * 6-cikis
		 ************************************
		 * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
		 * yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer
		 * olmali yani bir list'te tutmamiz gerek
		 * 2-kitap numarasi 1000'den
		 * baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
		 * count=1000; menu isminde bir method olusturmaliyim,
		 * 3-kitap ekle diye bir
		 * method olusturmliyim,bu method farkli bir classda
		 * 4-kullanicidn kitap adi
		 * yazar adi ve fiyat bilgileri istenmeli
		 */
		// Kitapcı_KitapEkle kitap = new Kitapcı_KitapEkle();

		menu();
		boolean flag = true;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Lütfen İşlem Seçiniz: çıkmak için '0' basın:");
			int islem = Integer.parseInt(scan.nextLine()); // DUMMY YERİNE BUNU KULLANDIM NEXTINT TEN KAÇMAK İÇİN.
			switch (islem) {
			case 1:
				Kitapcı_KitapEkle.kitapEkle();
				break;
			case 2:
				Kitapcı_KitapEkle.kitapNoIleKitap();
				break;
			case 3:
				Kitapcı_KitapEkle.bilgiIleKitap();
				break;
			case 4:
				Kitapcı_KitapEkle.numaraIleKitapSil();
				break;
			case 5:
				Kitapcı_KitapEkle.tumKitaplariListele();
				break;
			case 6:
				System.out.println("Yine Bekleriz GÜLE GÜLE....");
				flag = false;
				break;
			default:
				System.out.println("Lütfen geçerli bir işlem numarası girin.");
				break;
			}

		} while (flag == true);

	}

	private static void menu() {

		System.out.println("//////////////// KİTAPCI PRIGRAMI //////////////////");
		System.out.println(
				" 	1-kitap ekle\n" + 
				"	2-numara ile kitap goruntule\n" + 
				"	3-bilgi ile kitap goruntule\n"+ 
				"	4-numara ile kitap sil\n" + 
				"	5-tum kitaplari listele\n" + 
				"	6-cikis ");

	}

}
