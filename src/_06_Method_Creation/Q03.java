package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */

        Scanner scan = new Scanner(System.in);
        System.out.print("cevirim yapacagınız işlemi seciniz : ");
        String islem =scan.next();
        System.out.print("cevirim miktarını giriniz : ");
        double miktar = scan.nextDouble();
        donustur(islem,miktar);
    }

    private static void donustur(String islem, double miktar) {

        switch (islem){
            case "saat":
                System.out.println("merak ettiğin saat  "+miktar*60*60+" saniyedir");
                break;
            case "mil":
                System.out.println("merak ettiğin mil  "+miktar*1.61+" kiometredir");
                break;
            case"kg":
                System.out.println("merak ettiğin kilo  "+miktar*1000+" gramdır");
                break;
            default:
                System.out.println("agam bizimle egleniiirrr. adam akıllı veri gir gelmiim oraya :-( ");
        }
    }
}

