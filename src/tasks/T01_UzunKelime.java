package tasks;

import java.util.Scanner;

public class T01_UzunKelime {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("cumle giriniz");

        String sentence = scan.nextLine();

        System.out.println(longestWord(sentence));

    }

    public static String longestWord(String sentence) {

        String arr[] = sentence.split(" ");
        int max = 0;
        String longestWord = "";


        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > max) {
                max = arr[i].length();
                longestWord = arr[i];

            }


        }

        return longestWord;

    }
}
