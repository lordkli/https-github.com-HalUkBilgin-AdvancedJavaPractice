package projects.P03_UcusProjesi.Ucus_projesi01;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Scanner;

public class UcusMethods {
    static Scanner scanner = new Scanner(System.in);
//--------------------------------------BİLET YAZDIRMA METHODU -----------------------------------------------------------------------------



    private static void fisIsteme(String isim, String sehir, String yon, int yas, double tutar) {


        DateFormat DFormat = DateFormat.getDateInstance();
        Calendar cal = Calendar.getInstance();
        String curr_date = DFormat.format(cal.getTime());
        int curr_hour = LocalDateTime.now().getHour();
        int min = LocalDateTime.now().getMinute();

        System.out.println("===================================");

        System.out.println("Java Beans Airlines ");
        System.out.println("İstanbul Sabiha Gökçen ISG");
        System.out.println("Flight No: " + LocalDateTime.now().getYear() + LocalDateTime.now().getHour() + "  Gate Number:" + sehir.toUpperCase() + Math.round(Math.random() * 10));
        System.out.print("İşlem Tarihi: ");
        System.out.print(curr_date);
        System.out.println("");
        System.out.print("İşlem Saati:");
        System.out.println("  " + curr_hour + ":" + min);

        System.out.println("===================================");

        System.out.println("FROM: A      Destination: " + sehir.toUpperCase());
        System.out.println("Müşteri Adı: " + isim.toUpperCase());
        System.out.println("Tek yön / Gidiş Dönüş: " + yon);
        System.out.println("Yolcu yaşı: " + yas);
        System.out.println("Toplam Ödeme: " + tutar + "$");

        System.out.println("===================================");

        System.out.println("İyi yolculuklar dileriz");
        System.out.println("Boolean Aviation Corp.Ⓒ 2022");

    }//fiş isteme


    //--------------------------------------ANA KONTROL METHODU -----------------------------------------------------------------------------
    public static void ucus(String isim, String destination, String yon, int yas) {

        double priceB = 50;
        double priceC = 70;
        double priceD = 90;

        switch (destination) {

            case "B":
                priceB = yasKontrol(destination, yon, yas, priceB);
                fisIsteme(isim, destination, yon, yas, priceB);
                break;
            case "C":
                priceC = yasKontrol(destination, yon, yas, priceC);
                fisIsteme(isim, destination, yon, yas, priceC);
                break;
            case "D":
                priceD = yasKontrol(destination, yon, yas, priceD);
                fisIsteme(isim, destination, yon, yas, priceD);
                break;

        }//switch(destination)

        System.out.println("Biletiniz hazırlanmıştır.");

    }//tekCıftYon()

        //------------------------------------------------------- YAŞ KONTROL METHODU ----------------------------------------------------------------------------------------------


    private static double yasKontrol(String destination, String yon, int yas, double price) {
        if (yon.equalsIgnoreCase("gd")) {

            if (yas > 0 && yas < 12) {

                price = indirim12YasAlti(price);
                price = ciftYonIndirim(price);
                System.out.println(destination + " şehrine GİDİŞ DÖNÜŞ fiyatınız: " + price + "$");

            } else if (yas >= 12 && yas < 24) {

                price = indirim12ve24Yas(price);
                price = ciftYonIndirim(price);
                System.out.println(destination + " şehrineGİDİŞ DÖNÜŞ fiyatınız: " + price + "$");

            } else if (yas > 65 && yas <= 100) {

                price = indirim65yas(price);
                price = ciftYonIndirim(price);
                System.out.println(destination + " şehrine GİDİŞ DÖNÜŞ fiyatınız: " + price + "$");

            } else {
                price = ciftYonIndirim(price);
                System.out.println(destination + "  şehri için GİDİŞ-DÖNÜŞ bilet fiyatınız: " + price + "$");
            }

        } else if (yon.equalsIgnoreCase("t")) {
            if (yas > 0 && yas < 12) {

                price = indirim12YasAlti(price);
                System.out.println(destination + "şehrine gidiş fiyatınız: " + price + "$");

            } else if (yas >= 12 && yas < 24) {

                price = indirim12ve24Yas(price);
                System.out.println(destination + " şehrine gidiş fiyatınız: " + price + "$");

            } else if (yas > 65 && yas <= 100) {

                price = indirim65yas(price);
                System.out.println(destination + " şehrine gidiş fiyatınız: " + price + "$");
            } else {
                System.out.println("İndirimsiz yolcu. " + destination + " şehri için bilet fiyatınız: " + price + "$");
            }

        } else {
            System.out.println("Lütfen geçerli bir yön girişi yapınız");
        }

        return price;
    }


        //--------------------------------------YAŞ GRUPLARIN İNDİRİMİ VE ÇİFT YÖN İNDİRİMİ METHODU -----------------------------------------------------------------------------



    public static double indirim12YasAlti(double price) {
        System.out.println("12 yaş altı olduğunuz için %50 indirim uygulanacaktır");
        return price * 0.5;
    }

    public static double indirim12ve24Yas(double price) {
        System.out.println("12-24 yaş aralığında olduğunuz için %10 indirim uygulanacaktır");
        return price * 0.9;
    }


    public static double indirim65yas(double price) {
        System.out.println("65 üstü yaş aralığında olduğunuz için %30 indirim uygulanacaktır");
        return price * 0.7;
    }


    public static double ciftYonIndirim(double price) {

        System.out.println("Gidiş-Dönüş aldığınız için %20 indirim uygulanacaktır.");
        return price * 0.8 * 2;
    }

}
