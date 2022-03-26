package _08_While_DoWhile;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.


        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = sc.nextInt();
        int toplam = 0;

        do {

            toplam += sayi % 10;
            sayi = sayi / 10;

            System.out.println("Basamağın Toplamı = " + toplam + "kalan sayı " + sayi);

        }
        while (sayi > 0);
        System.out.println("Toplam = " + toplam);

    }

}
