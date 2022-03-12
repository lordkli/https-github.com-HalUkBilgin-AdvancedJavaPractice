package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' veya ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz : ");
        String kelime = scan.next();//kalem

        System.out.println(ilkIkisiz(kelime));
    }
    private static String ilkIkisiz(String kelime) {
        String kalanHarfler = "";
        if (kelime.startsWith("gh")) {//ghost
            kalanHarfler = kelime;

        } else if (kelime.startsWith("g")) {//goat
            kalanHarfler = kelime.charAt(0) + kelime.substring(2);//gat

        } else if (kelime.charAt(1) == 'h') {//photo
            kalanHarfler = kelime.substring(1);//hoto
        } else//kalem
        {
            kalanHarfler = kelime.substring(2);//lem
        }
        return kalanHarfler;

    }
}

