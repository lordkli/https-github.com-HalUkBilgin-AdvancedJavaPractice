package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {




        /*
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.

        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.

        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.

                                        todo    Koşul kısmı

                                        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF            gelmeli.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("********NOT HESAPLAMA SİSTEMİ********\n");

        System.out.print("Vize sınav sonucunuzu giriniz : ");
        double vize = sc.nextDouble();

        System.out.print("Vize sınavı yüzdesini giriniz: ");
        double vize_yuzde = sc.nextDouble();

        System.out.print("Final sınav sonucunuzu giriniz : ");
        double fin = sc.nextDouble();

        System.out.print("Final sınavı yüzdesini giriniz: ");
        double fin_yuzde = sc.nextDouble();

        System.out.println("*************************************");

        double ort = vize * (vize_yuzde / 100) + fin * (fin_yuzde / 100);

        System.out.println("Ortalamanız Sayı ile : " + ort);
        System.out.print("Ortalamanız Harf ile : ");

        if (ort >= 90) {
            System.out.println("AA aldınız...");
        } else if (ort >= 80) {
            System.out.println("BA aldınız...");
        } else if (ort >= 70) {
            System.out.println("BB aldınız...");
        } else if (ort >= 60) {
            System.out.println("CB aldınız...");
        } else if (ort >= 50) {
            System.out.println("CC aldınız...");

        } else if (ort >= 40) {
            System.out.println("DC aldınız...");
        } else if (ort >= 30) {
            System.out.println("DD aldınız...");

        } else {
            System.out.println("FD aldınız ve Kaldınız...");
        }

    }
}
