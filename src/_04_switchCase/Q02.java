package _04_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız


        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scan.nextInt();
        int onlarBasamagi = (sayi / 10) % 10, birlerBasamagi = (sayi % 10), yuzlerBasamagi = sayi / 100;
        if (sayi > 99 && sayi < 1000) {
            switch (yuzlerBasamagi) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("yuz");
                    break;
                case 2:
                    System.out.println("ikiyuz");
                    break;
                case 3:
                    System.out.println("ucyuz");
                    break;
                case 4:
                    System.out.println("dortyuz");
                    break;
                case 5:
                    System.out.println("besyuz");
                    break;
                case 6:
                    System.out.println("altiyuz");
                    break;
                case 7:
                    System.out.println("yediyuz");
                    break;
                case 8:
                    System.out.println("sekizyuz");
                    break;
                case 9:
                    System.out.println("dokuzyuz");
                    break;
            }
            switch (onlarBasamagi) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("on");
                    break;
                case 2:
                    System.out.println("yirmi");
                    break;
                case 3:
                    System.out.println("otuz");
                    break;
                case 4:
                    System.out.println("kirk");
                    break;
                case 5:
                    System.out.println("elli");
                    break;
                case 6:
                    System.out.println("altmis");
                    break;
                case 7:
                    System.out.println("yetmis");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;
                case 9:
                    System.out.println("doksan");
                    break;
            }
            switch (birlerBasamagi) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
            }

        }
    }
}
