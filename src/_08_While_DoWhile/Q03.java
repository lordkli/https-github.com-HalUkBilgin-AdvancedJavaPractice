package _08_While_DoWhile;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
      /*   Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27

        2  3 = 2*2*2=8

       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen taban ve uss giriniz");

        int taban = scan.nextInt();
        int uss = scan.nextInt();
        long sonuc = 1;

        while (uss != 0) {
            sonuc *= taban;


            uss--;
        }

        System.out.println("Cevap: " + sonuc);

        scan.close();
    }


}
