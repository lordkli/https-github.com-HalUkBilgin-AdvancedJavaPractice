package Projects.Projects_01;

import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
            Given two string by using scanner class and add each other
            if first word last letter is same with second word first letter then remove one of them.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */


        /*
        Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle .

        Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın

       Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"


         */
        Scanner dp = new Scanner(System.in);

        String allElements = dp.nextLine();

        String[] elements = allElements.split(" ");

        String s1 = elements[0];

        String s2 = elements[1];

        // code start here use s1 and s2 as words
        // kodu burdan başlatın ve s1 ve s2 kelime olarak kullanın


    }
}
