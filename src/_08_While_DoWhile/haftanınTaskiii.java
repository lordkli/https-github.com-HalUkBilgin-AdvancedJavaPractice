package _08_While_DoWhile;

import java.util.Scanner;

public class haftanınTaskiii {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("topun birakildigi ilk yuksekligi  giriniz : ");
        double yukseklik = scan.nextDouble();
        double topunToplamYolu=0;
        int yerevurmaSayisi=0;
        do {
            yerevurmaSayisi++;
            topunToplamYolu+=yukseklik;
            yukseklik*=(0.75);
            topunToplamYolu+=yukseklik;
        }
        while (yukseklik>=1);

        System.out.println("topun vurma sayisi:"+yerevurmaSayisi);
        System.out.println("topun aldigi toplam yol : "+topunToplamYolu);

    }
}
