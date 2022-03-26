package _08_While_DoWhile;

import java.util.Scanner;

public class Q11 {

    /*   TASK :
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.

            Not: sqrt gibi fonksiyonları  kullanmayın.

            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16

            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25


            Example 3:
            Input: 14
            Output: false

         */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = scanner.nextInt();

        int count = 0;
        boolean a = false;

        while (count * count <= sayi) {
            if (count * count == sayi) {
                System.out.println("true");
                a = true;
            }
            count++;
        }
        if (a == false) System.out.println("false");

    }
}
