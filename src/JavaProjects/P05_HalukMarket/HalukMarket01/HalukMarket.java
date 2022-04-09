package JavaProjects.P05_HalukMarket.HalukMarket01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HalukMarket {


    public static List<String> urunler = new ArrayList<>(Arrays.asList("Domates", "Patates", "Biber", "Soğan", "Havuç",
            "Elma", "Kiraz", "Çilek", "Kavun", "Üzüm", "Limon"));  // Global
    public static List<Double> fiyatlar = new ArrayList<>(Arrays.asList(2.1, 3.2, 1.5, 2.3, 3.1, 1.2, 1.9, 6.1, 4.3, 2.7, 0.5));

    public static List<String> sepetUrunler = new ArrayList<>();
    public static List<Double> sepetKg = new ArrayList<>();
    public static List<Double> sepetFiyatlar = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

		/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve ödeme sonrasında programı bitirinzi.
		 */


        String devam;
        double toplamFiyat = 0.0;

        do {
            urunListele();
            System.out.println("Ürününüzü numaraya göre seçiniz:");
            int urunNo = scan.nextInt();
            System.out.println("Ağırlık giriniz:");
            double kg = scan.nextDouble();
            sepeteEkle(urunNo, kg);
            toplamFiyat = Math.round(sepeteYazdir());
            System.out.println("Alış verişe devam etmek istermisiniz:");
            devam = scan.next();
        } while (devam.equalsIgnoreCase("e"));
        odeme(toplamFiyat);
    }

    public static void urunListele() {
        System.out.println("No\t Ürünler \tFiyatlar");
        System.out.println("===\t ======== \t========");

        for (int i = 0; i < urunler.size(); i++) {
            System.out.println(" " + i + "\t" + urunler.get(i) + "\t\t" + fiyatlar.get(i));
        }
    }

    public static void sepeteEkle(int urunNo, double kg) {
        sepetUrunler.add(urunler.get(urunNo));
        sepetKg.add(kg);
        sepetFiyatlar.add(fiyatlar.get(urunNo) * kg);
    }

    public static double sepeteYazdir() {

        double fiyatToplami = 0.0;
        double kgToplami = 0.0;

        System.out.println("Ürün Adı \tKG \t\tFiyatı");
        System.out.println("=================================");
        for (int i = 0; i < sepetUrunler.size(); i++) {
            System.out.println(sepetUrunler.get(i) + "\t \t" + sepetKg.get(i) + "\t\t" + sepetFiyatlar.get(i));
            fiyatToplami += sepetFiyatlar.get(i);
            kgToplami += sepetKg.get(i);
        }
        System.out.println("=================================");
        System.out.println("\tTOPLAM:" + kgToplami + "\t\t" + fiyatToplami);
        return fiyatToplami;
    }

    public static void odeme(double toplamFiyat) {
        Scanner scan = new Scanner(System.in);

        System.out.println("***********************************");
        System.out.println("************* ÖDEME ***************");
        System.out.println("ÖDENECEK TOPLAM FİYAT:" + toplamFiyat);
//		System.out.printf("ÖDENECEK TOPLAM FİYAT: %.2f", toplamFiyat);
        double nakit = 0.0;
        do {
            System.out.print("Lütfen Nakit Giriniz:");
            nakit += scan.nextDouble();
            if (nakit < toplamFiyat) {
                System.out.println("Girilen Rakam yetersiz.");
                System.out.println((toplamFiyat - nakit) + " TL daha yatırmanız gerekmektedir.");
            }
        } while (nakit < toplamFiyat);

        double paraUstu = nakit - toplamFiyat;
        if (paraUstu > 0) {
            System.out.println("PARA ÜSTÜ :" + paraUstu);
        }
        System.out.println("YİNE BEKLERİZ");
    }
}
