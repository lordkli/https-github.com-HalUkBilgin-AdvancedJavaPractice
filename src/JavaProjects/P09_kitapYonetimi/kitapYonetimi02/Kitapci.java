package JavaProjects.P09_kitapYonetimi.kitapYonetimi02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapci extends Kitap{
    Scanner scan = new Scanner(System.in);
    List<Kitap> kitaplar = new ArrayList<Kitap>();
    boolean flag = false;
    int secilenIslem;
    public void menu() {
        System.out.println("*** ISLEMLER MENUSU ***" +
                "\n1-KITAP EKLE\n2-NUMARA ILE KITAP GORUNTULE\n3-BILGI ILE KITAP GORUNTULE\n4-NUMARA ILE KITAP SIL" +
                "\n5-TUM KITAPLARI LISTELE\n6-CIKIS");
        System.out.print("Lutfen yapmak istediginiz islemi tuslayiniz : ");
        secilenIslem = scan.nextInt();
        scan.nextLine(); // dummy
        switch (secilenIslem) {
            case 1:
                kitapEkle();
                scan.nextLine(); // dummy
                break;
            case 2:
                numIleKitapGoruntule();
                scan.nextLine(); // dummy
                break;
            case 3:
                bilgiIleKitapGoruntule();
                scan.nextLine(); // dummy
                break;
            case 4:
                numIleKitapSil();
                scan.nextLine(); // dummy
                break;
            case 5:
                kitaplariListele();
                break;
            case 6:
                cikis();
        }
    }
    private void kitapEkle() {
        System.out.print("Eklemek istediginiz kitabin ismi : ");
        kitapAdi = scan.nextLine();
        System.out.print(""); // dummy
        System.out.print("Eklemek istediginiz kitabin yazar ismini giriniz : ");
        yazarAdi = scan.nextLine();
        while (true) {
            System.out.print("Kitap Fiyatini giriniz : ");
            try {
                kitapFiyat = (int) Double.parseDouble(scan.next());
                break;
            } catch (Exception e) {
                System.out.println("Kitap fiyati sayi olmalidir.");
            }
        }
        kitapNo++;
        System.out.println("Kitap basariyla eklendi!");
        islemeDevamMi();
    }
    private void numIleKitapGoruntule() {
        System.out.println("Lutfen aradiginiz kitabin numarasini giriniz(1000-) : ");
        int arananNo = scan.nextInt();
        for (Kitap kitap : kitaplar
        ) {
            if (kitap.kitapNo == arananNo) {
                flag=true;
                System.out.println(kitap);
            }
        }if (!flag){
            System.out.println("Aradiginiz numarada kitap mevcut degildir");
        }
        flag = false;
        islemeDevamMi();
    }
    private void bilgiIleKitapGoruntule() {
        System.out.println("Lutfen aradiginiz kitabin ismini ya da yazar ismini giriniz : ");
        String bilgi = scan.nextLine();
        for (Kitap kitap : kitaplar
        ) {
            if (kitap.kitapAdi.equals(bilgi) || kitap.yazarAdi.equals(bilgi)) {
                flag = true;
                System.out.println(kitap);
            }
        }
        if (!flag){
            System.out.println("Aradiginiz kitap bizde yok :(");
        }
        flag = false; // Bayragi tekrardan indiriyoruz(Tekrar islem yapilmak istenirse code break olmasin diye)
        islemeDevamMi();
    }
    private void numIleKitapSil() {
        System.out.println("Lutfen silmek istediginiz kitabin numarasini giriniz (1000-) : ");
        int silinecekKitapNo = scan.nextInt();
        for (Kitap kitap : kitaplar
        ) {
            if (kitap.kitapNo == silinecekKitapNo) {
                flag = true;
                kitaplar.remove(kitap);
                System.out.println("Kitap basariyla silindi!");
            }
        }
        if (!flag){
            System.out.println("Girdiginiz numaradaki kitap mevcut olmadigindan islem basarisiz oldu");
        }
        flag=false;
        islemeDevamMi();
    }
    private void kitaplariListele() {
        for (Kitap kitap : kitaplar
        ) {
            System.out.println("Kitap No : " + kitap.kitapNo + "\nKitap Ismi : " + kitap.kitapAdi + "\nKitap Yazari : " +
                    kitap.yazarAdi + "\nKitap Fiyati : " + kitap.kitapFiyat);
            System.out.println("++++++++++++++++++++++");
        }
        islemeDevamMi();
    }
    private void islemeDevamMi(){
        System.out.print("Baska bir islem yapmak istiyor musunuz?(E/H) : ");
        // scan.nextLine();
        String islemeDevamMi = scan.next();
        // TODO : DUMMY le alaklai bi problem var COZ
        if (islemeDevamMi.equalsIgnoreCase("E")){
            menu();
        }else{
            cikis();
        }
    }
    private void cikis() {
        System.out.println("Ugradigin icin tesekkurler, yine bekleriz okursever!");
    }

}
