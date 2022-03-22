package _09_Arrays;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {


        /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

         */
        int arr1[][] = {{10, 20, 30}, {4}, {6, 7, 20}};
        int arrYeni[] = new int[arr1.length];

        for (int kat = 0; kat < arr1.length; kat++) {

            for (int dire = 0; dire < arr1[kat].length; dire++) {
                arrYeni[kat] += arr1[kat][dire];
            }
        }
        System.out.println(Arrays.toString(arrYeni));
    }
}
