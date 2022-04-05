package tasks;

import java.util.Random;
import java.util.Scanner;

public class T04_SayiTahminKredili {
    static Scanner scan = new Scanner(System.in);

        /*
         * Sayı tahmin etme oyunu.... Bilgisayardan rastle(random class kullanılarak)
         * 0-100 arasında bir sayı alıp kullanıcının tahminini her defasından
         * büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
         *
         * TRICK : Random rnd = new Random();
                   int sayi = rnd.nextInt(101); ===> random
           class'indan random objesini kullanilıyor. Daha sonra 'rnd' obj  ile parametresi sinirini belirleyip
           int sayi variable'a assign edilmeli.
           *  Eger kullanici ilk
         * tahmininde bilirse x4 Kredi kazansin, ikici tahmininde bilirse x3, ucuncu
         * tahmininde bilirse x2 4 ve sonrasinda herhangi bir bonus kazanmasin kazanirsa
         * yeni bir oyuna baslamak istiyor mu diye sor. Baslarsa oyunu zorlastir. Kredi
         * seviyesi kritik duzeye indiginde yeni bir oyun hakki tani (30)
         */


    public static void main(String[] args) {

        int kredi = 100;
        byte yeniOyun = 0;
        byte oyunSayisi = 1;
        int ekstraOyunHakki = 1;

        do {

            Random rnd = new Random();
            int sayi = rnd.nextInt(101);
            boolean kazandiMi = false;
            int tahminSayisi = 1;

            if (oyunSayisi > 1) {

                System.out.println("Yeni oyuna hos geldiniz. Umariz sansiniz ebediyen devam eder :)");
                sayi = rnd.nextInt(300);
            }

            do {
                System.out.println("Lutfen " + tahminSayisi + ". tahmininizi giriniz: ");
                System.out.println(sayi);
                int tahmin = scan.nextInt();
                if (sayi == tahmin) {
                    if (tahminSayisi < 4) {
                        switch (tahminSayisi) {
                            case 1:
                                kredi += kredi * 4;
                                break;
                            case 2:
                                kredi += kredi * 3;
                                break;
                            case 3:
                                kredi += kredi * 2;
                                break;
                        }
                    }
                    System.out.println("Tebrikler oyunu kazandiniz! \nMevcut krediniz " + kredi);
                    System.out.println(
                            "Mevcut krediniz ile yeni bir oyuna baslamak ister misiniz? \nEvet icin 1'i Hayir icin 2'yi tuslayiniz");
                    yeniOyun = scan.nextByte();
                    oyunSayisi++;

                    kazandiMi = true;

                } else {

                    kredi -= 10;

                    if (sayi < tahmin) {
                        System.out.println("Birazdaha kucuk bir tahminde bulunmaya ne dersin?");
                    } else {
                        System.out.println("Biraz daha buyuk bir tahminde bulunmaya ne dersin?");
                    }
                    System.out.println("Kalan kredi miktariniz: " + kredi);
                    if (kredi <= 30 && ekstraOyunHakki == 1) {
                        ekstraOyunHakki++;
                        System.out.println(
                                "Kredi miktariniz kritik seviyeye indi. Mevcut krediniz ile yeni bir oyunabaslamak ister misiniz? Boylelikle bonuslardan tekrardan yararlanma hakkina sahip olabilirsiniz. Evet icin 1'i Hayir icin 2'yi tuslayin.");
                        byte ekstraOyunHakkiTercih = scan.nextByte();

                        if (ekstraOyunHakkiTercih == 1) {

                            kredi = ekstraOyun(kredi);

                            if (kredi > 0) {

                                System.out.println("Tebrikler oyunu kazandiniz! \nMevcut krediniz " + kredi);
                                System.out.println(
                                        "Mevcut krediniz ile yeni bir oyuna baslamak ister misiniz? \nEvet icin 1'i Hayir icin 2'yi tuslayiniz");
                                yeniOyun = scan.nextByte();
                                oyunSayisi++;

                                kazandiMi = true;
                            }
                        }
                    }
                }
                tahminSayisi++;
            }
            while (!kazandiMi && kredi > 0);
            if (yeniOyun == 2 || kredi <= 0) {
                System.out.println("THE END");
                break;
            }
        } while (yeniOyun == 1);
    }

    private static int ekstraOyun(int kredi) {

        Random rnd = new Random();
        int sayi = rnd.nextInt(101);
        boolean kazandiMi = false;
        int tahminSayisi = 1;

        do {

            System.out.println("Lutfen " + tahminSayisi + ". tahmininizi giriniz: ");
            System.out.println(sayi);
            int tahmin = scan.nextInt();

            if (sayi == tahmin) {

                if (tahminSayisi < 4) {

                    switch (tahminSayisi) {
                        case 1:
                            kredi += kredi * 4;
                            break;
                        case 2:
                            kredi += kredi * 3;
                            break;
                        case 3:
                            kredi += kredi * 2;
                            break;
                    }
                }
                kazandiMi = true;

            } else {

                kredi -= 10;

                if (sayi < tahmin) {
                    System.out.println("Birazdaha kucuk bir tahminde bulunmaya ne dersin?");
                } else {

                    System.out.println("Biraz daha buyuk bir tahminde bulunmaya ne dersin?");
                }

                System.out.println("Kalan kredi miktariniz: " + kredi);

            }

            tahminSayisi++;

        } while (!kazandiMi && kredi > 0);

        return kredi;

    }
}

