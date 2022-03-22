package _09_Arrays;

import java.util.Arrays;

public class Q18 {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */


        String str = "Javacilar cook afilli";

        int count[] = new int[256];

        for (int i = 0; i < str.length(); i++) {

            count[str.charAt(i)]++;
        }
        char ch[] = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);

            int find = 0;

            for (int j = 0; j <= i; j++) {
                // If any matches found:Herhangi bir eşleşme bulunursa

                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.print(str.charAt(i) + " = " + count[str.charAt(i)] + ",  ");
        }


        System.out.println("\n   *** 2. yol ***   ");

        String[] arr = str.split("");
        Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));
        int say = 0;
        for (int i = 0; i < arr.length; i++) {
            say = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].charAt(0) == arr[j].charAt(0)) {
                    say++;
                } else {
                    i = j - 1;
                    break;
                }
            }
            System.out.println(arr[i].charAt(0) + " = " + say);
        }
    }

}
    

