package _08_While_DoWhile;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        /* TASK :
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Faktöriyeli: 720

        Bir sayı giriniz: 3*2*1
        Faktöriyeli 6
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int sayi =scan.nextInt();

        int faktoriyel=1;

        while(sayi>0){
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("faktoriyel :"+faktoriyel);
    }
}


