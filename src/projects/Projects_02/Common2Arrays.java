package projects.Projects_02;

import java.util.Scanner;

public class Common2Arrays {

    /*
         Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
         Both arrays will be length 1 or more.

        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true

     */

    /*

        a ve b den oluşan 2 int array verildiğinde, aynı ilk öğeye sahiplerse veya aynı son öğeye sahiplerse true değerini döndürün.

        Her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.

       commonEnd([1, 2, 3], [7, 3]) → true
       commonEnd([1, 2, 3], [7, 3, 2]) → false
       commonEnd([1, 2, 3], [1, 3]) → true

    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");
        int[] myArr = new int[5];
        for(int i = 0 ; i< arr.length ; i++){
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }
        int[] array1 = new int[3];
        int[] array2 = new int[2];
        for(int i = 0 ; i <3 ; i++){
            array1[i] = myArr[i];
        }
        for(int i = 3 ; i <5 ; i++){
            array2[i-3] = myArr[i];
        }

/*
        your code start here .
        Use array 1 and array 2 .
        Don't change or delete anything before this line


        Bu satırdan önceki satırlarda hicbirşeyi silme ve degiştirme
        koda burdan basla
        array1 and array2  kullan

 */


    }

}
