package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

    /*  TASK :
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tam sayı giriniz : ");
        int sayi = scan.nextInt();

        for (int satir = 1; satir <= sayi; satir++) {//satır kontrolu
            for (int bosluk = sayi - satir; bosluk >= 0; bosluk--) {//bosluk kontrolu
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= satir; yildiz++) {//yıldız kontrolu
                System.out.print("*");

            }
            System.out.println();
        }
         /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

        for (int satir = 1; satir <= sayi; satir++) {//satır kontrolu

            for (int yildiz = 1; yildiz <= satir; yildiz++) {//yıldız kontrolu
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
