package JavaProjects.Projects_01;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {


    /*
    Given a positive integer num name is max ,

    create a random number between 0 to max

    output should be int

     */



 /*

    Veri tipi integer olan max sayısı verildiğinde

    0 ile max sayisi arasindan random bir sayi elde et(olustur)

    output tipi int olmalı


  */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int max=scanner.nextInt();

        //  code Start here don't change before this line
        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin

		
		for (int i=0 ; i<1 ; i++) { // 1 tane uretecek (ne kadar uretmesini istiyorsak)
			
			Random rnd = new Random();
			
			System.out.print(rnd.nextInt(max)+"\t"); // 0 ile max arasinda rastgele sayi uretecek
		}
    }
}