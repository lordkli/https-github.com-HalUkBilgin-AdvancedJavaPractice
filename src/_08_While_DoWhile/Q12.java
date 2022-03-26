package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sayi = oku.nextInt(); //5

        //sayi--; bu şekilde sayının kendisi işleme girmez

        int toplam = 0;
        while (sayi > 0) {
            if (sayi % 2 == 1)
                System.out.println(sayi);

            sayi--; // 5 4 3 2 1
        }

    }
}
