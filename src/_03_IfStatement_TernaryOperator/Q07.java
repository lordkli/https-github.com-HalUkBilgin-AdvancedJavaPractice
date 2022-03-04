package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		   hatali giris seklinde code create ediniz
		 */

        Scanner sc = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {

            System.out.println("Kucuk harf");

        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk harf");
        } else {
            System.out.println("Hatali giris yaptiniz.");
        }


    }

}
