package _09_Arrays;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */


        int[] arr = new int[8];
        Scanner scan = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ".indexi sayiyi giriniz :");
            arr[i] = scan.nextInt();
            if (arr[i] % 3 == 0) {
                count++;
            }
        }

        System.out.println("Girdiginiz array'deki 3 ile bolunebilen eleman  sayisi :" + count);

    }

}
