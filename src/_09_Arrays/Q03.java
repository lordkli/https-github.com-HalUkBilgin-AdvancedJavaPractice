package _09_Arrays;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        int[] arr = {1, 2, -3, 4, -5, -6};
        System.out.println("for each cozomu");


        for (int w : arr) {
            w *= -1;
            System.out.print(w + ", ");

        }

        System.out.println("method for cozumu : "+Arrays.toString(sayininTersi(arr)));

    }

    public static int[] sayininTersi(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;

        }
        return arr;

    }


}
