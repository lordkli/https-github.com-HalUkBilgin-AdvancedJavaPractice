package JavaProjects.P11_depoYonetimi.depoYonetimi04;

import java.util.ArrayList;
import java.util.Scanner;

public  class Islemler {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);
    static Depo depo = new Depo();


    public static void secim() {

        System.out.println(R + "========================== İŞLEMLER =======================\r\n"
                + "   ____________________             ____________________    \n"
                + "   | 1-URUN LISTESI  |            | 2-URUN TANIMLA|  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 3-URUN RAFLAMA  |            | 4-URUN GIRIS     |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 5-URUN CIKIS    |            | 6-CIKIS           |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       " + B);

        System.out.print("ISLEM SECİNİZ : ");
        int sec = TryCatch.intGirisi();

        switch (sec) {
            case 1:
                urunListesi();
                break;
            case 2:
                urunTanimlama();
                break;
            case 3:
                urunRaflama();
                break;
            case 4:
                urunGiris();
                break;
            case 5:
                urunCikis();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Hatali deger girdiniz");
                secim();

        }


    }

    private static void cikis() {

        System.out.println("Depo yonetiminden cikis yaptiniz");
    }

    private static void urunCikis() {
        System.out.println("Urununuze atanan id degerini ve almak istediginiz urunun miktarini giriniz");

        try {
            depo.urunCikis(TryCatch.intGirisi(), TryCatch.intGirisi());
            banner();
            urunYazdirma(depo.urunListesi);
            secim();

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Istenen id'yi girmediniz.Meunye yonlendiriliyorsunuz ");
            yonlendirme();
        }
    }

    private static void urunGiris() {
        System.out.println("Urununuze atanan id degerini ve urunun miktarini giriniz");

        try {
            depo.urunGiris(TryCatch.intGirisi(), TryCatch.intGirisi());
            banner();
            urunYazdirma(depo.urunListesi);
            secim();

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Istenen id'yi girmediniz. Menuye yonlendiriliyorsunuz. ");
            yonlendirme();
        }
    }

    private static void urunRaflama() {

        System.out.println("Urununuze atanan id degerini ve istediginiz rafi giriniz");
        try {
            depo.urunRaf(TryCatch.intGirisi(), TryCatch.intGirisi());
            banner();
            urunYazdirma(depo.urunListesi);

            secim();
        } catch (IndexOutOfBoundsException e) {

            System.out.print("Aradiginiz urun bulunamamistir.Urun tanimlamasi icin dogru id bilgisi gereklidir" +
                    " \nMenuye yonlendiriliyorsunuz ");
            yonlendirme();

        }
    }

    private static void urunTanimlama() {
        System.out.println("Urunun adini,ureticiyi ve birimini giriniz");
        depo.urunTanimlama(TryCatch.stringGirisi(), TryCatch.stringGirisi(), TryCatch.stringGirisi());
        System.out.println("Yeni urununuz tanimlandi.ID num: " + depo.urunListesi.get(depo.urunListesi.size() - 1).getId() + ".");

        banner();
        urunYazdirma(depo.urunListesi);
        secim();

    }

    private static void urunListesi() {

        banner();
        urunYazdirma(depo.urunListesi);
        secim();

    }

    public static void urunYazdirma(ArrayList<Urun> urunListesi) {

        urunListesi.
                forEach(t -> System.out.printf("%-8d%-12S%-12S%-12d%-12S%-10d \n", t.getId(), t.getIsim(),
                        t.getUretici(), t.getMiktar(), t.getBirimi(), t.getRaf()));

        System.out.println();
    }

    public static void yonlendirme() {

        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException t) {
            }
        }
        System.out.println();
        secim();
    }

    public static void banner() {
        System.out.println("ID\t\tÜRÜN ADI\tÜRETİCİ\t\tMİKTARI\t\tBİRİMİ\t\tRAF" +
                "\n-------------------------------------------------------------");

    }
}
