package _06_Method_Creation;

import java.util.Scanner;

public class Q07 {
    /*      TASK:
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.


        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cumle giriniz: ");
        String str = scanner.nextLine();

        System.out.println(reverseString(str));


    }

    public static String reverseString(String str) {

        String str2 = str.trim();

        String strTers = "";

        for (int i = str2.length() - 1; i >= 0; i--) {

            strTers += str2.charAt(i);
        }

        return strTers;
    }
}

/*
String[] arr =  str.trim().replaceAll("\\s+"," ").split("");

        String strTers = "";

        for (int i = arr.length-1; i >= 0; i--) {

            strTers += arr[i];
        }

        return strTers;
    }
}

 */

