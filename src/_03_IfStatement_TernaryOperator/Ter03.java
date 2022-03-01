package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
        // Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”

        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        int num = scan.nextInt();

        System.out.println("*****  TERNARY çözümü  *****");

        String result = (num > 99 && num < 1000) ? ("3 basamakli") : (num % 2 == 0 ? "3 basamaklı olmayan çift sayı" : "3 basamaklı olmayan tek sayı");
        System.out.println(result);

        System.out.println("*****  if  çözümü  *****");
        if (num <1000 && num>99) {
            System.out.println("3 basamaklı");

        }else if (num % 2 == 0 ) {
            System.out.println("3 basamaklı olmayan çift sayı");

        }else System.out.println("3 basamaklı olmayan tek sayı");
//(şart) ? true:falese
    }
}