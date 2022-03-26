package _02_Scanner;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
    	/*
    	 * kullanicinin ad soyad yas boy kilosunu  yazdiriniz
    	 */

        Scanner scan = new Scanner(System.in);

        String name, surname;

        
        int age, kilo;
        double boy;

        System.out.print("Adınızı girin: ");
        name = scan.nextLine();

        System.out.print("Soyadınızı girin: ");
        surname = scan.nextLine();

        System.out.print("Yaşınızı girin: ");
        age = scan.nextInt();

        System.out.print("Boyunuzu girin: ");
        boy = scan.nextDouble();
        

        System.out.print("Kilonuzu giriniz: ");
        kilo = scan.nextInt();

        System.out.println("Benim adım : " + name  +"\n"+ "Soyadım : " +surname +"\n"+ "Yaşım : " + age +
                "\n"+"boyum : " + boy +"\n"+"kilom : " + kilo );
scan.close();
    }
}
