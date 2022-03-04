package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

    /* TASK :
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.



        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

        Scanner scanner = new Scanner(System.in);

        int gun;
        int ay;
        int yil;

        System.out.println("Tarihi gün,ay,yıl olarak istenen şekliyle giriniz... ");

        System.out.print("Gün: ");
        gun = scanner.nextInt();

        if (gun > 0 && gun <= 31) {
            System.out.println(gun);

        } else {
            System.out.println("Yanlış giriş yaptınız.Program sonlanıyor...");
            // return;
        }


        System.out.print("Ay: ");
        ay = scanner.nextInt();

        if (ay > 0 && ay <= 12) {
            System.out.println(ay);

        } else {
            System.out.println("Yanlış giriş yaptınız.Program sonlanıyor...");
            // return;
        }

        System.out.print("Yıl: ");
        yil = scanner.nextInt();

        if (yil > 0) {
            System.out.println(yil);

        } else {
            System.out.println("Yanlış giriş yaptınız.Program sonlanıyor...");
            // return;
        }

        System.out.println("Ay/Gün/Yıl : " + ay + "/" + gun + "/" + yil);
        System.out.println("Yıl/Ay/Gün : " + yil + "/" + ay + "/" + gun);

    }
}
