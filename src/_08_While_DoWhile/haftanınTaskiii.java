package _08_While_DoWhile;

import java.util.Scanner;

public class haftanınTaskiii {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan  code blogu create ediniz.

    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("topun ilk bırakıldıgı yuksekligi giriniz : ");
        double yukseklik = scan.nextDouble();
        double toplamYol = 0;
        int zıplamaSayısı = 0;


        do {
            toplamYol += yukseklik;//ilk bırakıldıgı mesafe toplam yola eklendi
            zıplamaSayısı++;
            yukseklik*=0.75;
            toplamYol+=yukseklik;

        } while (yukseklik >= 1);
        System.out.println("topunuz zıplama  sayısı: "+zıplamaSayısı);
        System.out.println("topunuzun toplam aldıgı yol : "+toplamYol);
    }
}
