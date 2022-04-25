package JavaProjects.P11_depoYonetimi.depoYonetimi03;

import JavaProjects.P11_depoYonetimi.depoYonetimi01.Urunler;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class methods {

    static Scanner scan = new Scanner(System.in);
    static HashMap<Integer, Urunler> urunlerJ = new HashMap<>();
    //urunlerin depolanacagı bos map

    public static void depoGiris() {
        System.out.println("\n" + "           ==JAVANAR DEPO YONETIM SISTEMI==            \r\n"
                + "     \n"
                + "    1-URUN TANIMLAMA               2-MİKTAR GUNCELLEME  \n"
                + "     \n"
                + "    \n"
                + "    3-RAF GUNCELLEME               4-URUN SILME         \n"
                + "    \n"
                + "\n"
                + "    5-URUN LİSTELE                 6-CIKIS               \n" +
                "\nLutfen Yapmak Istediginiz Islem Numarasini Giriniz"
        );

        int input;

        while (true) {
            try {
                input = Integer.parseInt(scan.next());  //integer giris yapilana kadar while
                break;
            } catch (Exception e) {
                System.out.println("Lutfen bir rakam tuslayin");
            }
        }

        switch (input) {
            case 1:
                scan.nextLine();
                urunTanila();
                depoGiris();
                break;

            case 2:
                scan.nextLine();
                miktariGuncelle();
                depoGiris();
                break;
            case 3:
                System.out.println("Lutfen Rafini Degistirmek Istediginiz Urunun Id'sini Giriniz");
                rafGuncelle();
                depoGiris();
                break;
            case 4:
                scan.nextLine();
                urunSilme();
                depoGiris();
                break;
            case 5:
                scan.nextLine();
                urunleriListele();
                depoGiris();
                break;
            case 6:
                cıkıss();
                break;
            default:
                System.out.println("adam gibi değer gir gelmiyim oraya");
                depoGiris();
                break;
        }
    }


    private static void urunTanila() {
        int IdJ = 1000;

        while (true) {
            if (urunlerJ.containsKey(IdJ)) {
                IdJ++;

            } else break;
        }

        System.out.print("Urun Ismini Giriniz : ");
        String urunIsim = scan.nextLine();

        //scan.nextLine();
        System.out.print("Uretici Bilgisi Giriniz : ");
        String uretici = scan.nextLine();
        //scan.nextLine();

        System.out.print("Urun Birimi Giriniz : ");
        String birim = scan.nextLine();

        int miktar;
        while (true) {
            try {
                System.out.print("Urun Miktar Giriniz : ");
                miktar = Integer.parseInt(scan.next());
                break;
            } catch (Exception e) {
                System.out.println("Lutfen miktari sayi olarak giriniz");
            }
        }
        scan.nextLine();

        System.out.print("Urun Icin Raf Bilgisi Giriniz : ");
        String raf = scan.nextLine();

        Urunler urun = new Urunler(urunIsim, uretici, miktar, birim, raf);
        urunlerJ.put(IdJ, urun);
        System.out.println(IdJ + " : " + urunlerJ.get(IdJ));
        depoGiris();

    }

    private static void miktariGuncelle() {
        int arananIdJ;
        while (true) {
            try {
                System.out.println("Miktarini Güncelleyeceginiz Urunun Idsini Giriniz : ");
                arananIdJ = Integer.parseInt(scan.next());
                break;
            } catch (Exception e) {
                System.out.println("Bu Bir Sayi Olmali");
            }
        }
        if (urunlerJ.keySet().contains(arananIdJ)) {
            System.out.println("\n" + "           ==JAVANAR DEPO YONETIM SISTEMI==            \r\n"
                    + "     \n"
                    + "    1-MIKTARI GUNCELLEME              2-MEVCUT MİKTAR UZERINDE ISLEM YAPMA  \n"

                    + "\nLutfen Yapmak Istediginiz Islem Numarasini Giriniz" +
                    "\nAna Menuye Donmek icin farkli bir rakam giriniz\"");

           /* System.out.println("Guncel Miktarınızı Girmek Icin 1\n" +
                    "Mevcut Miktar Uzerinde Islem Yapmak Icin 2.\n" +
                   );*/
            int secim;
            while (true) {
                try {
                    secim = Integer.parseInt(scan.next());
                    break;
                } catch (Exception e) {
                    System.out.println("Bir Sayi Girmelisiniz");
                }
            }
            switch (secim) {
                case 1:
                    scan.nextLine();                //Stratejik Dummy
                    miktariGuncelledr(arananIdJ);
                    depoGiris();
                    break;

                case 2:
                    scan.nextLine();
                    miktardaIslem(arananIdJ);
                    depoGiris();
                    break;

                default:
                    System.out.println("Donuyorsun Suan Bak");
                    depoGiris();
                    break;
            }


        } else System.out.println("Aradıgınız Urun Sistemde Yok");
        urunleriListele();
    }
    private static void miktariGuncelledr(int arananIdJ) {
        System.out.println("Lutfen Miktari Giriniz");
        int guncelMiktarJ;
        while (true) {
            try {
                guncelMiktarJ = Integer.parseInt(scan.next());
                break;
            } catch (Exception e) {
                System.out.println("Miktari Bir Sayi Olarak Girmelisiniz");
            }
        }

        urunlerJ.get(arananIdJ).setMiktar(guncelMiktarJ);

        System.out.println("Urun miktariniz Guncel Hale Getirildi " + urunlerJ.get(arananIdJ).getMiktar() + "x" +
                urunlerJ.get(arananIdJ).getBirim());
    }
    private static void miktardaIslem(int arananIdJ) {
        System.out.println("\n" + "==JAVANAR DEPO YONETIM SISTEMI==\r\n"
                + "     \n"
                + "1-EKLEME             2-CIKARMA  \n"

                + "\nLutfen Yapmak Istediginiz Islem Numarasini Giriniz");
        int islem;
        while (true) {
            try {
                islem = Integer.parseInt(scan.next());
                break;
            } catch (Exception e) {
                System.out.println("Islemin Bulundugu Rakami Secmelisiniz");
            }
        }
        switch (islem) {

            case 1:
                scan.nextLine();
                System.out.println("Lutfen Eklemek Istediginiz Miktari Giriniz." +
                        "\n(Hatirlatma: Girdiginiz Urun Birimi "
                        + urunlerJ.get(arananIdJ).getBirim() + " Cinsinden");
                int eklenecekMiktar;
                while (true) {
                    try {
                        eklenecekMiktar = Integer.parseInt(scan.next());
                        break;
                    } catch (Exception e) {
                        System.out.println("Eklenecek Miktar Bir Sayi Olmali");
                    }
                }
                urunlerJ.get(arananIdJ).setMiktar(eklenecekMiktar + urunlerJ.get(arananIdJ).getMiktar());

                System.out.println("Urun miktariniz Guncel Hale Getirildi:\n" + urunlerJ.get(arananIdJ).getMiktar() + " x " +
                        urunlerJ.get(arananIdJ).getBirim());
                depoGiris();
                break;

            case 2:
                scan.nextLine();
                System.out.println("Lutfen Cikarmak Istediginiz Miktari Giriniz. (Hatirlatma: Girdiginiz Urun Birimi "
                        + urunlerJ.get(arananIdJ).getBirim() + " Cinsinden");
                int cikarilacakMiktar;
                while (true) {
                    try {
                        cikarilacakMiktar = Integer.parseInt(scan.next());
                        break;
                    } catch (Exception e) {
                        System.out.println("Bu Bir Sayi Olmali");
                    }
                }
                urunlerJ.get(arananIdJ).setMiktar(urunlerJ.get(arananIdJ).getMiktar() - cikarilacakMiktar);

                System.out.println("Urun miktariniz Guncel Hale Getirildi" + urunlerJ.get(arananIdJ).getMiktar() + "x" +
                        urunlerJ.get(arananIdJ).getBirim());
                depoGiris();
                break;

            default:
                System.out.println("Yanlis Giris Yaptiniz Miktar Guncelleme Menusune Yonlendiriliyorsunuz");
                miktariGuncelle();
        }
    }

    private static void rafGuncelle() {

        int arananIdJ;
        while (true) {
            try {
                System.out.println("\nLutfen Rafini Guncellemek Istediginiz Urunun Id'sini Giriniz");
                arananIdJ = Integer.parseInt(scan.next());
                break;
            } catch (Exception e) {
                System.out.println("Bir Sayi Olmali");
            }
        }
        scan.nextLine();
        if (urunlerJ.keySet().contains(arananIdJ)) {
            System.out.print("Guncel Raf Degerini Giriniz : ");
            String guncelRaf = scan.nextLine();

            urunlerJ.get(arananIdJ).setRaf(guncelRaf);

            System.out.println("Urunun Rafi Guncellendi : " + urunlerJ.get(arananIdJ).getRaf());

        } else {
            System.out.println("Aradıgınız Urun Sistemde Yok. Sistemdeki Urunleriniz Asagidaki Gosterilmistir");
        }

        urunleriListele();
    }

    private static void urunleriListele() {
        System.out.println("****  Urun Listesi ****");
        System.out.println(urunlerJ);

    }

    private static void urunSilme() {
        System.out.println("Lutfen Silmek Istediginiz Urunun Idsini Giriniz");
        int silinecekId;
        while (true) {
            try {
                System.out.println("Lutfen Silmek Istediginiz Urun Id'sini Giriniz");
                silinecekId = Integer.parseInt(scan.next());
                break;
            } catch (Exception e) {
                System.out.println("Bir Sayi Olmali");
            }
        }

        System.out.println("Isleminizin sonucunda \"" + silinecekId + "" + urunlerJ.remove(silinecekId) +
                "\" Urun Bilgileri Listeden silindi");

    }


    private static void cıkıss() {
        System.out.println("CIKIYORSUN BAK SUAN");
        System.exit(0);
    }

    }