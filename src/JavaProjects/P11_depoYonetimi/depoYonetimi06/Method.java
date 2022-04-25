package JavaProjects.P11_depoYonetimi.depoYonetimi06;

import java.util.*;

public class Method implements GirisCikisInterface {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);
    static int id=1000;
    static HashMap<Integer,UrunTanimlama> urunler=new HashMap<>();
    static int count=0;
    public void girisPaneli(){

        System.out.println(Y+ "========================== İŞLEMLER =======================\r\n"
                + "   ____________________              ____________________   \n"
                + "   | 1-URUN TANIMLAMA |              |  2-URUN LİSTELE  |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 3-URUN GIRISI    |              |  4-URUN RAFA KOY |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 5-URUN CIKISI    |              |  6-BITIRME       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  "+R);

        System.out.print("Yapmak istediginiz islem : ");

        try {
            int secim= scan.nextInt();

            switch (secim){
                case 1:
                    urunTanimlama();
                    girisPaneli();
                    break;
                case 2:
                    urunListele();
                    girisPaneli();
                    break;
                case 3:
                    miktarGuncelle();
                    urunListele();
                    girisPaneli();
                    break;
                case 4:
                    rafaKoy();
                    urunListele();
                    girisPaneli();
                    break;
                case 5:
                    urunCikis();
                    urunListele();
                    girisPaneli();
                    break;
                case 6:
                    cikisYap();
                    break;
                default:
                    System.out.println("Hatali secim yaptınız");
                    girisPaneli();
                    break;
            }
        }catch (InputMismatchException e) {
            System.out.println("Sayi disinda karakter girilemez");
            scan.nextLine();
            girisPaneli();
        }}

    public void cikisYap() {
        System.out.println("Cikis yapildi");
    }

    private static void urunTanimlama() {

        System.out.println("lutfen urun bilgilerini giriniz");
        System.out.println("Urun ismi");
        scan.nextLine();
        String urunIsmi=scan.nextLine();
        System.out.println("Uretici firma");
        String uretici=scan.nextLine();
        System.out.println("Birim");
        String birim=scan.nextLine();
        UrunTanimlama urun=new UrunTanimlama(id,urunIsmi,uretici,birim);
        urunler.put(id,urun);
        id++;

    }

    public static void urunListele() {
        Set<Map.Entry<Integer,UrunTanimlama>> urunlerSeti = urunler.entrySet();

        System.out.println("id       ismi         ureticisi       miktari       birimi         raf" +
                "\n----------------------------------------------------------------------");
        for (Map.Entry<Integer, UrunTanimlama> each: urunlerSeti) {
            Integer urunlerKey= each.getKey();
            System.out.printf( "%d    %-8s       %-14s %3d          %-14s %s"
                    ,urunlerKey,each.getValue().getUrunIsmi(), each.getValue().getUretici(),each.getValue().getMiktar(),each.getValue().getBirim(), each.getValue().getRaf());
            System.out.println("");
        }

    }
    public static void miktarGuncelle() {
        System.out.println("Urun girisi icin Id bilgisi giriniz");

        int arananId=scan.nextInt();

        if(Character.isDigit(arananId)){
            if(urunler.keySet().contains(arananId)) {

                System.out.println("Guncel miktarinizi giriniz");
                int guncelMik = scan.nextInt();
                urunler.get(arananId).setMiktar(guncelMik + urunler.get(arananId).getMiktar());

            }else{
                System.out.println("aradiniz urun yok");
            }
        }}


    private static void rafaKoy() {
        System.out.println("Raf girisi icin Id bilgisi giriniz");
        int arananId= scan.nextInt();

        if(urunler.keySet().contains(arananId)) {

            System.out.println("Guncel raf giriniz");
            scan.nextLine();
            String guncelRaf = scan.nextLine();
            urunler.get(arananId).setRaf(guncelRaf);

        }else{
            System.out.println("aradiniz urun yok");
        }

    }
    private static void urunCikis() {
        System.out.println("Urun cikisi icin Id bilgisi giriniz");
        int arananId= scan.nextInt();

        if(urunler.keySet().contains(arananId)) {

            System.out.println("Guncel miktarinizi giriniz");
            int guncelMik = scan.nextInt();
            urunler.get(arananId).setMiktar(urunler.get(arananId).getMiktar()-guncelMik);

        }else{
            System.out.println("aradiniz urun yok");
        }

    }
}
