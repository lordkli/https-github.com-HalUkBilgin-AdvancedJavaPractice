package JavaProjects.P10_aracKiralama;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusteriVeArabaBilgisiGirisi extends AracTalebi {

    static List<AracTalebi> aracTalebiList = new ArrayList<>();

    static Scanner scan = new Scanner(System.in);

    static int toplamGun;

    public static void aracTalep() {
        System.out.println("Lutfen araci alacaginiz sehri giriniz:");
        String sehir = scan.nextLine();
        System.out.println("Lutfen teslim alacaginiz gunu giriniz: (Ornek: 12.04)");// ay ve gunu ayirmak mi yoksa string almak mi?
        String alisGunu = scan.next();
        System.out.println("Lutfen teslim alacaginiz saati giriniz: (Ornek: 15.00)");
        double alisSaati = scan.nextDouble();
        System.out.println("Lutfen teslim edeceginiz gunu giriniz: (Ornek: 12.04)");
        String teslimGunu = scan.next();
        System.out.println("Lutfen teslim edeceginiz saati giriniz: (Ornek: 15.00)");
        double teslimSaati = scan.nextDouble();

        System.out.println("************************************");
        String aGun=alisGunu.substring(0,2); //12.04
        int intAGunu= Integer.parseInt(aGun);
        String aAy= alisGunu.substring(3);
        int intAAy = Integer.parseInt(aAy);
        System.out.println("Integer alis tarihi: "+intAGunu+"."+intAAy);

        String tGun=teslimGunu.substring(0,2); //12.04
        int intTGunu= Integer.parseInt(tGun);
        String tAy= teslimGunu.substring(3);
        int intTAy = Integer.parseInt(tAy);
        System.out.println("Integer teslim tarihi: "+intTGunu+"."+intTAy);

        System.out.println("************************************");
        if (intAAy>intTAy) {
            System.out.println("Alis gunu Teslim gununden sonra olamaz");
            aracTalep();
        }else if(intAGunu>intTGunu){
            System.out.println("Alis gunu Teslim gununden sonra olamaz");
            aracTalep();
        }else{

        }
        toplamGun= (intTAy-intAAy)*30 + (intTGunu-intAGunu);
        System.out.println("Odenecek toplam gun ayisi: "+toplamGun);
        System.out.println("************************************");
    }

    public static void getAraba(String marka, String model, String yakitTipi,String vites, Integer gunlukUcret){
    aracTalebiList.stream().
            filter(t-> t.getMarka().equalsIgnoreCase(marka) && t.getModel().equalsIgnoreCase(model)&&
            t.getYakitTipi().equalsIgnoreCase(yakitTipi)&& t.getVites().equalsIgnoreCase(vites)).
            forEach(System.out::println);
    }
    public static void islemeDevamDongusu(){
        System.out.println("Devam etmek istiyorsaniz 'e' ye, istemiyorsaniz 'h' ye basin");
        String devam = scan.next();
        if (devam=="e"){
            musteriBilgisi();
        }else if(devam=="h"){
            arabalar();
        }
    }


    public static void arabalar() {

        AracTalebi opelDizelOtomatik = new AracTalebi("Opel", "Astra", "dizel", "otomatik", 150);
        AracTalebi opelDizelManuel = new AracTalebi("Opel", "Astra", "dizel", "manuel", 130);
        AracTalebi opelBenzinliOtomatik = new AracTalebi("Opel", "Astra", "benzin", "otomatik", 150);
        AracTalebi opelBenzinliManuel = new AracTalebi("Opel", "Astra", "benzin", "manuel", 130);
        AracTalebi toyotaDizelOtomatik = new AracTalebi("Toyota", "Astra", "dizel", "otomatik", 180);
        AracTalebi toyotaDizelManuel = new AracTalebi("Toyota", "Astra", "dizel", "manuel", 160);
        AracTalebi toyotaBenzinliOtomatik = new AracTalebi("Toyota", "Astra", "benzin", "otomatik", 200);
        AracTalebi toyotaBenzinliManuel = new AracTalebi("Toyota", "Astra", "benzin", "manuel", 190);
        AracTalebi vwDizelOtomatik = new AracTalebi("VW", "Astra", "dizel", "otomatik", 180);
        AracTalebi vwDizelManuel = new AracTalebi("VW", "Astra", "dizel", "manuel", 160);
        AracTalebi vwBenzinliOtomatik = new AracTalebi("VW", "Astra", "benzin", "otomatik", 200);
        AracTalebi vwBenzinliManuel = new AracTalebi("VW", "Astra", "benzin", "manuel", 190);

        aracTalebiList.add(opelDizelOtomatik);
        aracTalebiList.add(opelDizelManuel);
        aracTalebiList.add(opelBenzinliOtomatik);
        aracTalebiList.add(opelBenzinliManuel);
        aracTalebiList.add(toyotaDizelOtomatik);
        aracTalebiList.add(toyotaDizelManuel);
        aracTalebiList.add(toyotaBenzinliOtomatik);
        aracTalebiList.add(toyotaBenzinliManuel);
        aracTalebiList.add(vwDizelOtomatik);
        aracTalebiList.add(vwDizelManuel);
        aracTalebiList.add(vwBenzinliOtomatik);
        aracTalebiList.add(vwBenzinliManuel);

        System.out.println("\n Lutfen talep ettiginiz aracin numarasini giriniz : \n1 : Opel Dizel Otomatik " +
                "\n2 : Opel Dizel Manuel \n3 : Opel Benzinli Otomatik \n4 : Opel Benzinli Manuel" +
                "\n5 : Toyota Dizel Otomatik" + "\n6 : Toyota Dizel Manuel\n7 : Toyota Benzinli Otomatik" +
                "\n8 : Toyota Benzinli Manuel\n9 : vwDizelOtomatik\n10: vwDizelManuel\n11 : vwBenzinliOtomatik" +
                "\n12 : vwBenzinliManuel" + "\n13: Yeni arac talebi");
        int tercih = scan.nextInt();
        switch (tercih){
            case 1:
                getAraba("Opel", "Astra", "dizel", "otomatik", 150);
                int odenecek_Ucret1= toplamGun*150;
                System.out.println("Odeyeceginiz toplam ucret: "+ odenecek_Ucret1);
                islemeDevamDongusu();
                break;
            case 2:
                getAraba("Opel", "Astra", "dizel", "manuel", 130);
                int odenecek_Ucret2= toplamGun*130;
                System.out.println("Odeyeceginiz toplam ucret: "+ odenecek_Ucret2);
                islemeDevamDongusu();
                break;
            case 3:
                getAraba("Opel", "Astra", "benzin", "otomatik", 150);
                int odenecek_Ucret3= toplamGun*150;
                System.out.println("Odeyeceginiz toplam ucret: "+ odenecek_Ucret3);
                islemeDevamDongusu();
                break;
            case 4:
                getAraba("Opel", "Astra", "benzin", "manuel", 130);
                int odenecek_Ucret4= toplamGun*130;
                System.out.println("Odeyeceginiz toplam ucret: "+ odenecek_Ucret4);
                islemeDevamDongusu();
                break;
            case 5:
                getAraba("Toyota", "Astra", "dizel", "otomatik", 180);
                int odenecek_Ucret5= toplamGun*180;
                System.out.println("Odeyeceginiz toplam ucret: "+ odenecek_Ucret5);
                islemeDevamDongusu();
                break;
            case 6:
                getAraba("Toyota", "Astra", "dizel", "manuel", 160);
                int odenecek_Ucret6= toplamGun*160;
                System.out.println("Odeyeceginiz toplam ucret: "+ odenecek_Ucret6);
                islemeDevamDongusu();
                break;
            case 7:
                getAraba("Toyota", "Astra", "benzin", "otomatik", 200);
                int odenecek_Ucret7= toplamGun*200;
                System.out.println("Odeyeceginiz toplam ucret: "+ odenecek_Ucret7);
                islemeDevamDongusu();
                break;
            case 8:
                getAraba("Toyota", "Astra", "benzin", "manuel", 190);
                int odenecek_Ucret8= toplamGun*190;
                System.out.println("Odeyeceginiz toplam ucret: "+ odenecek_Ucret8);
                islemeDevamDongusu();
                break;
            case 9:
                getAraba("VW", "Astra", "dizel", "otomatik", 180);
                int odenecek_Ucret9= toplamGun*180;
                System.out.println("Odeyeceginiz toplam ucret: "+ odenecek_Ucret9);
                islemeDevamDongusu();
                break;
            case 10:
                getAraba("VW", "Astra", "dizel", "manuel", 160);
                int odenecek_Ucret10= toplamGun*160;
                System.out.println("Odeyeceginiz toplam ucret: "+ odenecek_Ucret10);
                islemeDevamDongusu();
                break;
            case 11:
                getAraba("VW", "Astra", "benzin", "otomatik", 200);
                int odenecek_Ucret11= toplamGun*200;
                System.out.println("Odeyeceginiz toplam ucret: "+ odenecek_Ucret11);
                islemeDevamDongusu();
                break;
            case 12:
                getAraba("VW", "Astra", "benzin", "manuel", 190);
                int odenecek_Ucret12= toplamGun*190;
                System.out.println("Odeyeceginiz toplam ucret: "+ odenecek_Ucret12);
                islemeDevamDongusu();
                break;
            case 13:
                System.out.println("Lutfen talep ettiginiz yeni arac markasini giriniz");
                String yeniMarka = scan.nextLine();
                scan.nextLine();
                System.out.println("Lutfen talep ettiginiz yeni model  giriniz");
                String yeniModel = scan.nextLine();
                System.out.println("Lutfen talep ettiginiz yakit tipi giriniz");
                String yeniYakitTipi = scan.nextLine();
                System.out.println("Lutfen talep ettiginiz  vites tipi giriniz");
                String yeniVitesTipi = scan.nextLine();


                getAraba(yeniMarka," "+yeniModel," "+yeniYakitTipi," "+yeniVitesTipi,250);
                int odenecek_Ucret13= toplamGun*250;
                System.out.println("************************************");
                System.out.println("Odeyeceginiz toplam ucret: "+ odenecek_Ucret13);
                System.out.println("************************************");
                islemeDevamDongusu();
                break;
            default:
                System.out.println("Lutfen gecerli bir arac talep numarasi giriniz");
        }


    }
    public static void musteriBilgisi(){
        System.out.println("************************************");
        System.out.println("Lutfen adinizi ve soyadinizi giriniz: ");
        String adSoyad= scan.nextLine();
        scan.next();
        System.out.println("Lutfen id'nizi giriniz: ");
        String id = scan.next();
        scan.next();
        System.out.println("Lutfen telefon numaranizi giriniz: ");
        String tlf = scan.nextLine();
        scan.next();
        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scan.nextInt();

        System.out.println("************************************");

        System.out.println("Ad Soyad: "+adSoyad+"\nid: "+id+"\n Telefon: "+tlf+"\nYas: "+yas);
        odemeBilgileri();

        System.out.println("************************************");
    }
    public static void odemeBilgileri(){
        System.out.println("Lutfen kredi karti numaranizi giriniz: ");
        String kKarti= scan.nextLine();
        int uzunluk=12;

       if (uzunluk==kKarti.length()){
           System.out.println("Gecerli kart numarasi");
       }else{
           System.out.println("Gecersiz kart numarasi..Tekrar dneyiniz");
           odemeBilgileri();
           scan.next();
       }
        System.out.println("Odemeniz Basari ile Gerceklesmistir. Iyi gunler dileriz...");
    }


}

