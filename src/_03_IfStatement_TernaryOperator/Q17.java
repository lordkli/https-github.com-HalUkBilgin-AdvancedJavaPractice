package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {
        // TASK:
        // Kullanıcının girdiği yılın artık yıl olup olmadığını kontrol eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz : ");
        int year = scan.nextInt();
        System.out.println("   ***   if cözumu   ***   ");
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Girdiğiniz" + year + " yılı ARTIK YIL");
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println("Girdiğiniz" + year + " yılı ARTIK YIL");
        } else {
            System.out.println("Girdiğiniz" + year + " yılı ARTIK YIL değildir.");
        }

        //  ternary cozumu ...
        System.out.println("   ***   ternary cözumu   ***   ");

        String result = year % 100 == 0 ? year % 400 == 0 ? "Artik Yil" : "Artik Yil Degil"
                : year % 4 == 0 ? "Artik Yil" : "Artik Yil Degil";
        System.out.println(result);
    }

}
