package _07_ForLoop;

import java.util.Scanner;

public class Q20 {
    /*
     * SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
     * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
     * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen OBEB ve OKEK hesabı için ilk sayıyı giriniz \nikinci sayıyı icin enter e basiniz");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int obeb = 0;
        int okek;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                obeb = i;
            }
        }
        okek = (a * b) / obeb;
        System.out.println(a + " ve " + b + " sayıları için OBEB=" + obeb);
        System.out.println(a + " ve " + b + " sayıları için OKEK=" + okek);
    }
}
