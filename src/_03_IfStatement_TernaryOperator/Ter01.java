package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter01 {

    public static void main(String[] args) {

        /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        int num = scan.nextInt();
        System.out.println("*****  TERNARY çözümü  *****");

        String result = (num >= 0) ? (num < 10 ? "rakam" : "pozitif sayı") : ("negatif sayı");
        System.out.println(result);

        System.out.println("*****  if  çözümü  *****");

        if (num >= 0) {
            if (num < 10) {
                System.out.println("rakam");

            } else System.out.println("pozitif sayı");

        } else System.out.println("negatif sayı");

    }
}
