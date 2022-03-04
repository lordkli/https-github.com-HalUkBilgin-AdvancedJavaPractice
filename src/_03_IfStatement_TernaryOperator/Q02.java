package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
	/*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 3 tam sayi giriniz");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {
            if (a == b && a == c) {
                System.out.println("ucgen ve eskenar ucgendir");
            } else {
                System.out.println("ucgen fakat eskenar degil");
            }
        } else {
            System.out.println("ucgen degildir.");
        }


    }

}
