package JavaProjects.P11_depoYonetimi.depoYonetimi03;

import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {
    static Scanner scan = new Scanner(System.in);
    static int id=1000;
    static ArrayList<Urunler> urun=new ArrayList<>();


    public static void menu(){

        System.out.println( "========================== İŞLEMLER =======================\r\n"
                + "   ____________________              ____________________   \n"
                + "   | 1-URUN TANIMLAMA |              |  2-URUN LİSTELE  |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 3-URUN GIRISI    |              |  4-URUN RAFA KOY |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 5-URUN CIKISI    |              |  6-BITIRME       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  ");

        System.out.print("islem tercihinizi giriniz : ");
        int Islem = scan.nextInt();

        switch (Islem){
            case 1:
                tanimlama();
                menu();
                break;
            case 2:
                listele();
                menu();
                break;
            case 3:
                giris();
                menu();
                break;
            case 4:
                rafaKoy();
                menu();
                break;
            case 5:
                urunCikis();
                menu();
                break;
            case 6:
                bitir();
                break;
            default:
                System.out.println("YANLIS SECİM......");
                menu();
                break;

        }

    }

    private static void urunCikis() {
        System.out.println("   ***      urun icin cıkarma sayfası     ***");

        System.out.print("Cıkısını yapmak  istediginiz urunun ID sini giriniz : ");
        int arananId=scan.nextInt();

        boolean flag=true;
        for (Urunler u:urun) {
            if (u.id==arananId){
                System.out.print("Cıkarmak istediginiz degeri giriniz : ");
                int cıkıs=scan.nextInt();
                u.miktar-=cıkıs;
                System.out.println("Urun cıkarıldı....");
                if (u.miktar<0){
                    System.out.println((u.miktar+cıkıs)+" "+u.birim+" "+u.urunIsmi+" var, cıkarıldı. " +
                            "\n"+Math.abs(u.miktar)+" "+u.birim+" daha veremem.");
                    u.miktar=0;

                }
                flag=false;
                break;

            }

        }if (flag){
            System.out.println("Yerlestirmek istediginiz urun bulunamadı....");
        }

    }

    private static void rafaKoy() {
        System.out.println("   ***      urun icin raf sayfası     ***");

        System.out.print("Rafa yerlestirmek istediginiz urunun ID sini giriniz : ");
        int arananId=scan.nextInt();

        boolean flag=true;
        for (Urunler u:urun) {
            if (u.id==arananId){
                System.out.print("Hangi rafa yerlestirmek istersiniz  : ");
                u.raf="raf"+scan.next();
                System.out.println("Urun rafa yerlestirildi....");
                flag=false;
                break;

            }

        }if (flag){
            System.out.println("Yerlestirmek istediginiz urun bulunamadı....");
        }

    }

    private static void giris() {
        System.out.println("   ***      urun icin giris sayfası     ***");

        System.out.print("Giris yapmak istediginiz urunun ID sini giriniz : ");
        int arananId=scan.nextInt();

        boolean flag=true;
        for (Urunler u:urun) {
            if (u.id==arananId){
                System.out.print("girmek istediginiz değeri yazınız : ");
                int  giris=scan.nextInt();
                if (giris>0) {
                    u.miktar += giris;
                    System.out.println("miktar eklendi....");
                }else{
                    System.out.println("giris yaparken eksi deger girmeyiniz");
                }
                flag=false;
                break;

            }

        }
        if (flag){
            System.out.println("Giris yapmak istediginiz urun bulunamadı....");
        }

    }

    private static void listele() {
        System.out.println("id       ismi         ureticisi       miktari       birimi         raf" +
                "\n----------------------------------------------------------------------");
        for (int i = 0; i <urun.size() ; i++) {

            System.out.printf( "%d    %-8s       %-14s %3d          %-14s %s"
                    ,urun.get(i).id,urun.get(i).urunIsmi,urun.get(i).uretici,urun.get(i).miktar,urun.get(i).birim,urun.get(i).raf);
            System.out.println("");
        }
        scan.nextLine();//dummy
    }

    private static void tanimlama() {
        System.out.println("   ***      urun icin tanımlama sayfası     ***");

        do {
            System.out.print("Urun ismi giriniz : ");
            scan.nextLine();//dummy hayalet
            String urunIsmi=scan.nextLine().toUpperCase();

            System.out.print("Urunun uretici ismini giriniz : ");
            String urunUretici=scan.nextLine().toUpperCase();

            System.out.print("Urunun birimini giriniz :");
            String birim=scan.nextLine().toLowerCase();
            Urunler urunler=new Urunler(id,urunIsmi,urunUretici,birim);
            urun.add(urunler);
            id++;
            System.out.println("Eklemeyi bitirmek icin 0 a basınız \ndevam etmek icin 1 e basınız .....");

            int devam=scan.nextInt();
            if (devam ==0){
                System.out.println("Urun tanımlama bitti.....");
                break;
            }

        }while (true);

    }

    private static void bitir() {
        System.out.println("ISLEM TAMAM....\nYİNE BEKLERİZ");
    }
}
