package _08_While_DoWhile;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
         /* TASK :
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10

      */
        Scanner klavye = new Scanner(System.in);
        System.out.print("N Değerini Giriniz : ");
        long n = klavye.nextInt();
        System.out.print("R Değerini Giriniz : ");
        long r = klavye.nextInt();
        long sayac1 = 1;
        long faktor1 = 1;
        while (sayac1 <= n) {
            faktor1 *= sayac1;
            sayac1++;
        }
        long sayac2 = 1;
        long faktor2 = 1;
        while (sayac2 <= r) {
            faktor2 *= sayac2;
            sayac2++;
        }
        long sayac3 = 1;
        long faktor3 = 1;
        while (sayac3 <= n - r) {
            faktor3 *= sayac3;
            sayac3++;
        }
        System.out.println("kombinasyon = " + faktor1 / (faktor2 * faktor3));

    }
}

