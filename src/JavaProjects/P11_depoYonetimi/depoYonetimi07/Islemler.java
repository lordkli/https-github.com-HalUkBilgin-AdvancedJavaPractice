package JavaProjects.P11_depoYonetimi.depoYonetimi07;

import java.util.Collection;
import java.util.Scanner;
import java.util.Set;

public class Islemler {


    static Scanner scan = new Scanner(System.in);
    static int urunID = 0;



    public static void sahteUrunGiris() {      //her seferinde urun girmektense bir kaç tane tanımladım

        urunID++;
        Urunler urun1 = new Urunler(urunID, "Elma", "Sarı", "Kg");
        urunID++;
        Urunler urun2 = new Urunler(urunID, "Armut", "Kum", "Kg");
        urunID++;
        Urunler urun3 = new Urunler(urunID, "Ananas", "Uzun", "Tane");
        urunID++;
        Urunler urun4 = new Urunler(urunID, "Patates", "Saruhan", "Çuval");

    }

    public static void islemlerAnaMenu() {

        System.out.println("lütfen bir seçim yapınız\n1- Urun tanımlama\n2-Urunleri Listele\n3- Urun Girişi\n4- Urunu Rafa Koy\n5- Urun Çıkısı\n6- Program Çıkışı");
                                                //------------------------------------
        int secim = TryCatches.intGirisi();     //Try Catchleri method ile yapıyorum.
                                                //-------------------------------------

        switch (secim) {

            case 1:
                urunTanimla();
                islemlerAnaMenu();
            case 2:
                urunleriListele();
                islemlerAnaMenu();
            case 3:
                urunGirisi();
                islemlerAnaMenu();
            case 4:
                urunRafaKoy();
                islemlerAnaMenu();
            case 5:
                urunCikis();
                islemlerAnaMenu();
            case 6:
                urunTanimla();
                islemlerAnaMenu();
            default:
                System.out.println("lütfen gererli bir seçenek giriniz");
                islemlerAnaMenu();

        }

    }

    private static void urunCikis() {
        System.out.println("Lütfen Ürün ID giriniz");
        int urunID = TryCatches.intGirisi();

        if (Urunler.urunListesi.containsKey(urunID)) {
            urunCikisID(urunID);
        } else System.out.println("bu ID tanımlı değildir.");


    }

    private static void urunCikisID(int urunID) {


        String arr1[] = Urunler.urunListesi.get(urunID).split(", ");
        System.out.println("lütfen çıkış yapmak istediğiniz" + arr1[2] + "miktarını giriniz");
        int miktar = TryCatches.intGirisi();

        if (arr1[3].equals("Default")) {
            System.out.println("ürün girisi yapılmamış");
        } else {

            if (miktar > Integer.valueOf(arr1[3])) {
                System.out.println("Urun miktarı yetersiz");
                islemlerAnaMenu();

            } else {

                miktar = Integer.valueOf(arr1[3]) - miktar;

                String newValue = arr1[0] + ", " + arr1[1] + ", " + arr1[2] + ", " + miktar + ", " + arr1[4];
                Urunler.urunListesi.replace(urunID, newValue);

            }

        }


    }

    private static void urunRafaKoy() {
        System.out.println("Lütfen Ürün ID giriniz");
        int urunID = TryCatches.intGirisi();

        if (Urunler.urunListesi.containsKey(urunID)) {
            urunRafaKoyID(urunID);
        } else System.out.println("bu ID tanımlı değildir.");


    }

    private static void urunRafaKoyID(int urunID) {


        String arr1[] = Urunler.urunListesi.get(urunID).split(", ");
        System.out.println("lütfen hangi rafa koymak istediğinizi giriniz");
        String raf = scan.nextLine();

        String newValue = arr1[0] + ", " + arr1[1] + ", " + arr1[2] + ", " + arr1[3] + ", " + raf;
        Urunler.urunListesi.replace(urunID, newValue);


    }

    private static void urunGirisi() {

        System.out.println("Lütfen Ürün ID giriniz");
        int urunID = TryCatches.intGirisi();

        if (Urunler.urunListesi.containsKey(urunID)) {
            urunGirisiID(urunID);
        } else System.out.println("bu ID tanımlı değildir.");

    }

    private static void urunGirisiID(int urunID) {
        Set<Integer> urunKeyler = Urunler.urunListesi.keySet();
        String arr1[] = Urunler.urunListesi.get(urunID).split(", ");
        System.out.println("lütfen" + arr1[2] + "adetini giriniz");
        int miktar = TryCatches.intGirisi();

        String newValue = arr1[0] + ", " + arr1[1] + ", " + arr1[2] + ", " + miktar + ", " + arr1[4];
        Urunler.urunListesi.replace(urunID, newValue);


    }

    private static void urunleriListele() {


        Set<Integer> urunKeyler = Urunler.urunListesi.keySet();
        Collection<String> urunValues = Urunler.urunListesi.values();
        String arr[] = Urunler.urunListesi.get(1).split(", ");

        int urunValueSayisi = urunKeyler.size();
        int urunValueBilgiSayisi = arr.length;

        String arrUrunValues[][] = new String[urunValueSayisi][urunValueBilgiSayisi];

        String arrCaps[] = {"ID", "Isim", "Uretici", "Birim", "Miktar", "Raf"};
        for (int i = 0; i < arrCaps.length; i++) {
            System.out.printf("%-10s", arrCaps[i]);
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------");

        for (Integer w : urunKeyler) {
            System.out.println();
            System.out.printf("%-10s", w);
            String arr1[] = Urunler.urunListesi.get(w).split(", ");
            for (int i = 0; i < arr1.length; i++) {
                //System.out.print(arr1[i] + " ");
                System.out.printf("%-10s", arr1[i]);
            }

        }
        System.out.println();
        System.out.println();

    }


    public static void urunTanimla() {

        System.out.println("lütfen ürün ismi giriniz");
        String urunIsmi = scan.next();
        System.out.println("lütfen üretici ismi giriniz");
        String urunUretici = scan.next();
        System.out.println("lütfen birimi  giriniz");
        String urunBirimi = scan.next();
        urunID++;

        Urunler urun = new Urunler(urunID, urunIsmi, urunUretici, urunBirimi);


    }


}
