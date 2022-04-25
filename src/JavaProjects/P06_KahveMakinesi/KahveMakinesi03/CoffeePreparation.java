package JavaProjects.P06_KahveMakinesi.KahveMakinesi03;

import java.util.Arrays;
import java.util.Scanner;
public class CoffeePreparation extends CoffeeDataBase {
    static Scanner scan = new Scanner(System.in);
    int kahveSecici;
    int sekerSecici;
    int sutSecici;
    int boyutSecici;
    double toplamTutar;
    int onaylama;

    public CoffeePreparation() {
        /*
    bu constructor Runner ile baglanti noktamiz.
    methodlar buradan adim adim calisacak
         */
        kahvemiziSecelim();
        sekerimiziSecelim();
        sutMiktariniSecelim();
        kahveBoyutunuSecelim();
        toplamTutarHesapla();
        kahveSonuc();
    }
    public void kahvemiziSecelim() {
        /*
        try catch ile expection verip kodu durdurmasini sagladik.
        !!! ama calismadi!!!
         */
        try {
            System.out.println("lutfen kahvenizi Kahve No'ya gore seciniz: " + "\n" + Arrays.toString(kahveTurleri));
            kahveSecici = scan.nextInt();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lutfen 1'i, 2'yi ya da 3'u giriniz");
        } catch (Exception e) {
            System.out.println("Lutfen 1'i, 2'yi ya da 3'u giriniz");
        }
    }
    public void sekerimiziSecelim() {
        System.out.println("lutfen sekerinizi seker No'ya gore seciniz: " + "\n" + Arrays.toString(sekerMiktari));
        sekerSecici = scan.nextInt();
    }
    public void sutMiktariniSecelim() {
        System.out.println("lutfen sut miktarini No'ya gore seciniz: " + "\n" + Arrays.toString(sutMiktari));
        sutSecici = scan.nextInt();
    }
    public void kahveBoyutunuSecelim() {
        System.out.println("lutfen kahve boyutunu No'ya gore seciniz: " + "\n" + Arrays.toString(kahveBoyutu));
        boyutSecici = scan.nextInt();
    }
    public void toplamTutarHesapla() {
        toplamTutar += kahveFiyatlari[kahveSecici - 1];
        toplamTutar += sekerFiyatlari[sekerSecici - 1];
        toplamTutar += sutFiyatlari[sutSecici - 1];
        toplamTutar += boyutFiyatlari[boyutSecici - 1];
    }
    public void kahveSonuc() {
        System.out.println("****************************");
        System.out.println("Kahve seciminiz: " + "\n" + kahveBoyutu[boyutSecici - 1].substring(5) + "-->" +
                kahveTurleri[kahveSecici - 1].substring(5) + "-->" +
                sekerMiktari[sekerSecici - 1].substring(5) +
                "-->" + sutMiktari[sutSecici - 1].substring(5) +
                "\nToplam odemeniz gereken tutar:" + toplamTutar + " Euro'dur.");
        System.out.println("****************************");

        System.out.println("Secimlerinizi onayliyorsaniz 1'i \nisleminizi sonlandirmak icin 2'yi tiklayiniz\nyeniden secim menusu icin 3'u seciniz...");
        onaylama = scan.nextInt();
        switch (onaylama) {
            case 1:
                System.out.println(kahveBoyutu[boyutSecici - 1].substring(5) + " " + kahveTurleri[kahveSecici - 1].substring(5) + " seciminiz hazirlaniyor");
                for (int i = 0; i < 5; i++) {
                    System.out.print("*");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                }
                if (!sekerMiktari[sekerSecici - 1].contains("No:1")) {
                    System.out.println();
                    System.out.println("seciminize uygun olarak " + "\"" + sekerMiktari[sekerSecici - 1].substring(5) + "\" sekeriniz ilave ediliyor");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("*");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                        }
                    }
                } else {
                    System.out.println();
                    System.out.println("isteginiz nedeniyle seker ilave edilmedi");
                }
                if (!sutMiktari[sutSecici - 1].contains("No:1")) {
                    System.out.println();
                    System.out.println("seciminize uygun olarak " + "\"" + sutMiktari[sutSecici - 1].substring(5) + "\" sut ilave ediliyor");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("*");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                        }
                    }
                } else {
                    System.out.println();
                    System.out.println("isteginiz nedeniyle sut ilave edilmedi");
                }
                System.out.println();
                System.out.println("Kahveniz hazirlanmistir. Iyi gunler...");
                break;

            case 2:
                System.out.println("isleminiz sonlandirilmistir. Iyi gunler...");
                break;

            case 3:
                CoffeePreparation yeniSecim = new CoffeePreparation();
                break;
            default:
                System.out.println("Lutfen 1, 2 ya da 3 ile sacim yapiniz");
                kahveSonuc();
                break;

        }
    }
}







