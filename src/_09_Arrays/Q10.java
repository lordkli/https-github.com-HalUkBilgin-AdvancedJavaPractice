package _09_Arrays;

import java.util.Arrays;

public class Q10 {

    public static void main(String[] args) {
        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

         */

        String str = "GayetBasarılı";
        str = str.replace("Gayet", "Coook ");
        String[] arr = new String[1];
        arr[0] = str;
        System.out.println(Arrays.toString(arr)); //[Coook Basarılı]

    }

}
