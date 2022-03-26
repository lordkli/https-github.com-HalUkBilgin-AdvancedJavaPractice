package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tamsayı giriniz : ");
        int sayi = scan.nextInt();

        List<Integer> fibo = new ArrayList<>();
        fibo.add(1);
        fibo.add(1);
        System.out.println(fibo);

        for (int i = 2; fibo.get(i - 2) + fibo.get(i - 1) < sayi; i++) {
            fibo.add(fibo.get(i - 2) + fibo.get(i - 1));
        }
        System.out.println(fibo);

    }
}
