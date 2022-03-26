package Projects.Projects_01;

import java.util.Scanner;

public class printEvenNumbers {

    /*

    Given int number

    print all the even numbers from 0 to int number


    Example 1:
    int input = 10;

    print should be 0 2 4 6 8 10


    Example 2:
    int input = 15;

    print should be 0 2 4 6 8 10 12 14


     */

    /*
    Veri tipi int olan bir sayı verildiğinde

    0 dan başlayarak verilen sayıya kadar olan tum cift sayıları print edin.

    Example 1:
    int input = 10;

    print  0 2 4 6 8 10  olmalı


    Example 2:
    int input = 15;

    print  0 2 4 6 8 10 12 14  olmalı





     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxNum = scanner.nextInt();

        //  code Start here don't change before this line
        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin

//        for (int i = 0; i <=maxNum ; i+=2) {
//            System.out.print(i);
//        }

        for (int i = 0; i <=maxNum ; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

}
