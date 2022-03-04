package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize Notunuz: ");
        int vize = scanner.nextInt();

        System.out.print("Final Notunuz: ");
        int fin = scanner.nextInt();

        System.out.print("Vize yüzdesi kaçtır? ");
        double vize_yuzde = scanner.nextDouble();

        System.out.print("Final yüzdesi kaçtır? ");
        double fin_yuzde = scanner.nextDouble();

        double not_ort = (double) (vize * vize_yuzde / 100) + (double) (fin * fin_yuzde / 100);

        System.out.println("Ortalamanız hesaplanıyor..................");
        System.out.println("Not ortalamanız: " + not_ort);

        if (not_ort >= 50) {
            System.out.println("Tebrikler dersi başarı ile geçtiniz...");
        } else {
            System.out.println("Malesef dersten kaldınız...");
        }


    }
}
