package JavaProjects.P04_okulYönetimi.ogrcOgrtYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrncListesi = new ArrayList<>();
    static ArrayList<Kisi> ogrtListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;

            case "Q":
                cıkıs();
                break;
            default:
                System.out.println("hatalı giriş yaptınız  :(");
                girisPaneli();//recursive method call
                break;


        }


    }

    private static void cıkıs() {
        System.out.println("agam eline sağlık yine bekleriz selametle   :)");
    }

    public static void islemMenusu() {
        System.out.println("Sectiginiz  Kişi turu: " + kisiTuru + " icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");

        System.out.print("islem tercihinizi giriniz : ");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listele();
                islemMenusu();
                break;
            case 4:
                sil();

                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("adam bir şey girrr :( ");
                islemMenusu();

                break;
        }

    }

    private static void sil() {

        System.out.println("   ***   " + kisiTuru + " silme sayfası   ***");

        boolean flag = true;//flag bayrak olsun true->bayrak havada false->bayrak yerde

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){//ogrenci arıyorsa if body çalışacak
            scan.nextLine();//dummy
            System.out.println();//bos satır print
            System.out.print("silinecek ogrenci kimlik no giriniz : ");

            String silinecekKimlikNo=scan.next();

            for (Kisi k:ogrncListesi) {
                if (k.getKimlikNo().equals(silinecekKimlikNo)){//flag havada
                    System.out.println("silinen ogrenci : "+k.getAdSoyad());
                    ogrncListesi.remove(k);//ogrsc silindi
                    flag=false;
                    break;
                }

            }if (flag){//flag inince calışacak block
                System.out.println("silinecek ogrenci mevcut değil ");
            }
        }else{//ogretmen aranıyorsa else body calışacak
            System.out.print("silinecek ogretmenin kimlik no giriniz : ");
            String silinecekOgrtKimlikNo=scan.next();
            for (Kisi k: ogrtListesi) {
                if (k.getKimlikNo().equalsIgnoreCase(silinecekOgrtKimlikNo)){//flag havada
                    System.out.println("silinen ogretmen : "+k.getAdSoyad());
                    ogrtListesi.remove(k);
                    flag=false;
                    break;
                }

            }if (flag){//flag inince
                System.out.println("silnecek ogretmen mevcut değil ");
            }
        }

    }

    private static void listele() {

        System.out.println("   ***   " + kisiTuru + " listeleme sayfası   ***");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")){//ogrenci listeleme if
            System.out.println(ogrncListesi);
        }else {//ogretmen listeleniyor
            for (Kisi k: ogrtListesi) {
                System.out.println(k.toString()+" adı soyadı : "+k.getAdSoyad()+k.getYas());

            }
        }
    }

    private static void arama() {
        System.out.println("   ***   " + kisiTuru + " arama sayfası   ***");

        boolean flag = true;//flag bayrak olsun true->bayrak havada false->bayrak yerde
        //AHAN Da  TRICK : flag iki farlı method'da da kullanıldıgı icin static yapmak daha clean code olur....

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){//ogrenci arıyorsa if body çalışacak
            scan.nextLine();//dummy
            System.out.println();//bos satır print
            System.out.print("aradıgınız ogrenci kimlik no giriniz : ");

            String arananKimlikNo=scan.next();

            for (Kisi k:ogrncListesi) {
                if (k.getKimlikNo().equals(arananKimlikNo)){//flag havada
                    System.out.println("aradıgınız ogrenci : "+k.getAdSoyad());
                    flag=false;
                }

            }if (flag){//flag inince
                System.out.println("aradıgınız ogrenci mevcut değil ");
            }
        }else{//ogretmen aranıyorsa else body calışacak
            System.out.print("aradıgınız ogretmenin kimlik no giriniz : ");
            String arananKimlikNo=scan.next();
            for (Kisi k: ogrtListesi) {
                if (k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)){//flag havada
                    System.out.println("aradıgınız ogretmen : "+k.getAdSoyad());
                    flag=false;
                }

            }if (flag){//flag inince
                System.out.println("aradıgınız ogretmen mevcut değil ");
            }
        }


    }

    private static void ekle() {
        System.out.println("   ***   " + kisiTuru + " ekleme sayfası   ***");
        System.out.print("ad soyad giriniz : ");
        scan.nextLine();//dummy hayalet komut
        String adSoyad = scan.nextLine();
        System.out.print("kimlik No giriniz : ");
        String kimlikNo = scan.next();
        System.out.print("yas giriniz : ");
        int yas = scan.nextInt();
        if (kisiTuru.equals("OGRENCI")) {

            System.out.print("ogrenci No giriniz : ");
            String ogrcNo = scan.next();
            scan.nextLine();//dummy --> hayalet komut--> iki tane eşit scan.next(); komutu ayırmak için araya girmeli
            System.out.print("sınıf giriniz : ");
            String sınıf = scan.next();
            Ogrenci sefilOgrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrcNo, sınıf);//p'li cons ogrc obj create edildi
            ogrncListesi.add(sefilOgrenci);
        } else {//kisiTuru öğrenci ise if çalısir değilse kisiTuru öğretmen demektir ki else body çalışır
            System.out.print("sicil No giriniz : ");
            String sicilNo = scan.nextLine();
            scan.nextLine();//dummy
            System.out.print("bolum giriniz : ");
            String bolum = scan.nextLine();
            Ogretmen muhtesemOgretmen = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, bolum);//p'li cons ogrtm obj create edildi
            ogrtListesi.add(muhtesemOgretmen);
        }
    }
}
