package _11_dateTime.HaftaninSorusu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirisPaneli {

    public static void panel() {


        Scanner scan = new Scanner(System.in);


        Kayıt yeniKayıt = new Kayıt();//obj ile method cal yapılacak

        List<Kullanıcı> kisi = new ArrayList<>();
        boolean cikilsinMİ = true;
        while (cikilsinMİ) {

            System.out.println("lutfen \n1:Kayıt al\n2:sanslı kiş bul\n3:kişileri listele\n4cıkıs");
            System.out.print("isleminizi seciniz : ");
            int islem = scan.nextInt();

            switch (islem) {

                case 1:
                    kisi = yeniKayıt.kayıtAl();//kisi list'i degerini yeniKayıt obj ile kayıtAl() method call dan lacak
                    break;
                case 2:
                    yeniKayıt.sanslıKullanıcı(kisi);
                    break;
                case 3:
                    yeniKayıt.listele(kisi);
                    break;
                case 4:
                    cikilsinMİ = false;
                    break;
                default:
                    System.out.println("hatalı veri girdiniz");
                    break;
            }

        }


    }
}
