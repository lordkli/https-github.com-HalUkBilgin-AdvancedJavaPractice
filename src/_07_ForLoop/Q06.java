package _07_ForLoop;

import java.util.Scanner;

public class Q06 {

    /*  TASK :
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tam sayı giriniz : ");
        int sayi = scan.nextInt();

        for (int baba = 1; baba <=sayi; baba++) {//satır kontrolu
            for (int ogul = 1; ogul <=sayi; ogul++) {//sutun kontrolu
                System.out.print(" "+(baba*ogul));
            }
            System.out.println();//2 boyutlu for da iç ve dış döngü arasına satır atlaması için boş println koyulur
        }
    }
}
