package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        Scanner scan=new Scanner(System.in);

        int toplam=0;
        for(int i=1;i<=5;i++) // 5 kez sayı isteme  kontrolu
        {
            System.out.print("Bir sayı giriniz : ");
            int sayi=scan.nextInt();

            if (sayi>5 && sayi<10) // 5 ile 10 arası-> 6,7,8,9
            {
                System.out.println("girdiğiniz sayı 5 ile 10 arası olduğundan isleme girmeyecek");
                continue;
            }

            toplam+=sayi;
        }

        System.out.println("girdiginiz sayilarin toplamı :" + toplam);
    }

}
