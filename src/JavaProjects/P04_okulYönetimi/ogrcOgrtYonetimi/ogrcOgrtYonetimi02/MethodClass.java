package JavaProjects.P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimi02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodClass extends Kisi{
    static Scanner scan = new Scanner(System.in);
    String branslar[] = {"Kimya", "Fizik", "Biyoloji", "Matematik", "Geometri"};
    //String siniflar[] = {"11A", "11B", "12A", "12B", "10A", "10B", "9A", "9B", "8A", "8B", "7A", "7B", "6A", "5A", "4A", "3A", "2A", "1A"};
    List<Kisi> ogretmen = new ArrayList<>();
    List<Kisi> ogrenci = new ArrayList<>();
    static String kisi;
    public  void ekleme() {//try catch calis{
        System.out.println("****** " + kisi + " ekleme sayfasina hosgelmissen" + "*********");
        scan.nextLine();//dummy
        System.out.println("isim gir");
        String adSoyad = scan.nextLine();
        System.out.println("kimlik no giriniz ");
        // String kimlikNo = "";
        try {//1
            String kimlikNo = scan.nextLine();
            kimlikNo = kimlikNo.replace(" ", "");//bosluklu girerse diye
            if (kimlikNo.length() != 5) {//2
                throw new StringIndexOutOfBoundsException("Hatali veya eksik tuslama yaptiniz");
            } else {//2
                if (kisi.equalsIgnoreCase("Ogrenci")) {//3
                    System.out.println("yas gir");
                    // int yas = 0; // 30. satira int tanimladigimizda bu satira gerek kalamdi
                    try {//4
                        int yas = scan.nextInt();
                        scan.nextLine();//dummy
                        if (yas < 8 || yas > 19) {//5
                            throw new ArithmeticException("Bu yaslarda ogrenci olmaz");
                        } else {//5
                            System.out.println("ogrenci no gir");
                            int ogrenciNo = scan.nextInt();
                            scan.nextLine();//dummy
                            System.out.println("ogrenci sinif girin");
                            String sinif = scan.nextLine();
                            Ogrenci obj = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);
                            ogrenci.add(obj);
                            System.out.println("eklenen ogrenci : "+ obj.getAdSoyad());
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {//3
                    System.out.println("yas giriniz");
                    //int yas = 0;
                    try {//4
                        int yas = scan.nextInt();
                        scan.nextLine();//dummy
                        if (yas < 23 ) {
                            throw new ArithmeticException("ne ara universite bitirdin ");
                        }else if(yas > 65) {
                            throw new ArithmeticException("sen emekli olmadin mi ");
                        }
                        else {//5
                            System.out.println("brans gir");
                            boolean flag = true;
                            // String brans = "";
                            try {//6
                                String brans = scan.nextLine();
                                for (int i = 0; i < branslar.length; i++) {
                                    if (brans.equalsIgnoreCase(branslar[i])) {//7 calistiginda bayrak iner calisir
                                        // calismazsa bayrak hala havada
                                        flag = false;
                                    }
                                }
                                if (flag) {//true olmasi durumu basvuran ogretmen istenen brans da degilse
                                    throw new ArrayStoreException("Boyle bir brans a ihtiyacimz yoktur");
                                }else{
                                    System.out.println("sicil no gir (ornek : \"a12345\"  seklindeolmali ");
                                    // String sicilNo = "";
                                    try {
                                        String sicilNo = scan.nextLine();
                                        sicilNo=sicilNo.replace(" ","");//bosluk girme durumu
                                        String sicilKontrol=sicilNo;//
                                        sicilKontrol=sicilKontrol.replaceAll("\\d","");//rakamlar silindi
                                        if(sicilKontrol.length()==1 && sicilNo.length()==6){// tek harf varsa ve harften sonra 5 rakam varsa
                                            Ogretmen obj2 = new Ogretmen(adSoyad, kimlikNo, yas, brans, sicilNo);
                                            ogretmen.add(obj2);
                                            System.out.println("eklenen ogretmen : "+obj2.getAdSoyad());
                                        }else{
                                            throw new Exception("Dikkat sicil no harf ile baslamali ve rakamla devam etmeli ve harften sonra sadece 5 rakam olmali");
                                        }
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public  void arama() {
        System.out.println("****** " + kisi + " arama sayfasina hosgelmissen" + "*******");
        System.out.println("aramak istediginiz " + kisi + " nin kimlik no giriniz");
        String tc = scan.next();
        tc = tc.replaceAll(" ", "");
        if (kisi.equalsIgnoreCase("ogrenci")) {
            boolean flag = true;//true aldik 110 115 arasi calisir ve flag false olur eger ogrenci yoksa 117 calisir
            for (Kisi tc1 : ogrenci) {
                if (tc.equals(tc1.getKimlikNo())) {
                    System.out.println(tc1.toString());//alinan tc li ogrenciyi geitirir
                    flag = false;
                }
            }
            if (flag) {//true buddy si
                System.out.println("aradiginiz " + kisi + " listesinde yoktur");
            }
        } else {

            boolean flag = true;//true aldik arasi calisir ve flag false olur eger ogrenci yoksa  calisir
            for (Kisi tc1 : ogretmen) {
                if (tc.equals(tc1.getKimlikNo())) {
                    System.out.println(tc1.toString());//alinan tc li ogretmeni geitirir
                    flag = false;
                }
            }
            if (flag) {//true buddy si
                System.out.println("aradiginiz " + kisi + " listesinde yoktur");
            }
        }
    }
    public  void silme() {
        System.out.println("****** " + kisi + " silme  sayfasina hosgelmissen" + "*******");
        System.out.println("silmek istediginiz " + kisi + " nin kimlik no giriniz");
        String tc = scan.next();// bosluk durumuna gore try catch e bagla
        tc = tc.replaceAll(" ", "");
        boolean flag = true;
        if (kisi.equalsIgnoreCase("ogrenci")) {
            for (Kisi sil : ogrenci) {
                if (sil.getKimlikNo().equalsIgnoreCase(tc)) {
                    System.out.println("silinen ogrenci " + sil.getAdSoyad());
                    ogrenci.remove(sil);
                    System.out.println("silindi niye sildin ki ");
                    flag = false;
                    break;// bu break olmazsa .ConcurrentModificationException hatasi veriyuor foreach calismaya  devam ediyr
                }
            }
            if (flag) {
                System.out.println("yanlis kimlik no girdiniz");
            }
        } else {
            for (Kisi sil : ogretmen) {
                if (sil.getKimlikNo().equalsIgnoreCase(tc)) {
                    System.out.println("silinen ogretmen " + sil.getAdSoyad());
                    ogretmen.remove(sil);
                    System.out.println("silindi niye sildin ki ");

                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yanlis kimlik no girdiniz");
            }
        }
    }
    public  void listeleme() {
        if (kisi.equalsIgnoreCase("ogrenci")) {
            for (Kisi herOgrenci : ogrenci) {
                System.out.println(herOgrenci);
            }
        } else {
            for (Kisi herOgretmen : ogretmen) {
                System.out.println(herOgretmen);
            }
        }

    }
}
