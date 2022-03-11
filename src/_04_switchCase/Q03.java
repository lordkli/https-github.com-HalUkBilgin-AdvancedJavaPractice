package _04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız
        Scanner scan = new Scanner(System.in);
        System.out.print("yılın kacıncı ayını öğrenmek istiyorsunuz : ");
        int ay = scan.nextInt();

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girdiğiniz ayda 31 gün vardır");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girdiğiniz ayda 30 gün vardır");
                break;
            case 2:
                System.out.print("lütfen bulundugunuz yılı giriniz : ");
                int yıl = scan.nextInt();

                if (yıl % 4 == 0) {
                    System.out.println("girdiğiniz ayda 29 gün vardır");

                } else {
                    System.out.println("girdiğiniz ayda 28 gün vardır");
                }
                break;
            default:
                System.out.println("agam sen niddin hani yıl 12 aydı :-)");
        }
    }
}


