package projects.P06_KahveMakinesi.Kahve_mqkinesi01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangiKahve {
    static List<Kahve> kahve = new ArrayList<>();
    static List<Kahve> secilenKahve = new ArrayList<>();
    static String arrSut[] = {"Az Sütlü", "Orta Sütlü", "Bol Sütlü", "Sütsüz"};
    static String arrSeker[] = {"Az Şekerli", "Orta Şekerli", "Şekerli", "Şekersiz"};
    static String arrBardak[] = {"Küçük Boy", "Orta Boy", "Büyük Boy", "Duble Boy"};
    static Scanner scan = new Scanner(System.in);
    static String no;
    static String bardak;
    static String sut;
    static String seker;

    public void startKahve() {
        Kahve kahve1 = new Kahve("1", "Türk Kahvesi");
        Kahve kahve2 = new Kahve("2", "Filtre Kahve");
        Kahve kahve3 = new Kahve("3", "Espresso");
        Kahve kahve4 = new Kahve("4", "Americano");
        kahve.add(kahve1);
        kahve.add(kahve2);
        kahve.add(kahve3);
        kahve.add(kahve4);

        kahveSecim();
    }

    private void kahveSecim() {
        System.out.println("No\tKahve Adı");
        for (Kahve w : kahve) {
            System.out.println(w.getKahveNo() + "\t" + w.getKahveAdi());
        }
        System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz : ");

        no = scan.nextLine();
        switch (no) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            default:
                System.out.println("Hatalı giriş yaptınız, Tekrar deneyiniz");
                kahveSecim();
        }
        System.out.println("Seçiminiz : " + kahve.get(Integer.valueOf(no) - 1).getKahveAdi());

        bardakSecim();

    }

    private void bardakSecim() {
        System.out.println("Hangi boy bardak tercih edersiniz :\n 1-Küçük Boy 2-Orta Boy 3-Büyük Boy 4-Duble Boy");
        bardak = scan.next();
        switch (bardak) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            default:
                System.out.println("Hatalı giriş yaptınız tekrar deneyiniz : ");
                bardakSecim();
        }
        sekerSecim();
    }


    private void sekerSecim() {
        System.out.println("Şeker istermisiniz Evet için 'E' Hayır için 'H' giriniz : ");
        char secim = scan.next().toUpperCase().charAt(0);
        if (secim == 'E') {
            System.out.println("Şeker miktarını seçiniz :\n 1-Az Şekerli 2-Orta Şekerli 3-Şekerli");
            seker = scan.next();
            sutSecim();
        } else if (secim == 'H') {
            seker = "4";
            sutSecim();

        } else {
            System.out.println("Hatalı giriş yaptınız tekrar deneyiniz : ");
            sekerSecim();
        }
    }

    private void sutSecim() {
        System.out.println("Kahvenize süt istermisiniz Evet için 'E' Hayır için 'H' giriniz : ");
        char secim = scan.next().toUpperCase().charAt(0);
        if (secim == 'E') {
            System.out.println("Süt miktarını seçiniz :\n 1-Az Sütlü 2-Orta Sütlü 3-Bol Sütlü");
            sut = scan.next();
            kahveCikis();
        } else if (secim == 'H') {
            sut = "0";
            kahveCikis();
        } else {
            System.out.println("Hatalı giriş yaptınız tekrar deneyiniz : ");
            sutSecim();
        }
    }

    private void kahveCikis() {
        Kahve kh = new Kahve("1", kahve.get(Integer.valueOf(no) - 1).getKahveAdi(),
                arrBardak[Integer.valueOf(bardak) - 1],
                arrSut[Integer.valueOf(sut) - 1],
                arrSeker[Integer.valueOf(seker) - 1]);
        secilenKahve.add(kh);
        System.out.println("Seçiminiz : " + kh.getKahveAdi() + " - " + kh.getKahveBoy() + " - " + kh.getSeker() + " - " + kh.getSut());
        System.out.println("Onaylıyorsanız 'E' tekrar işlem yapmak için 'H' giriniz : ");
        char ch = scan.next().toUpperCase().charAt(0);
        if (ch == 'E') {
            System.out.print(kh.getKahveAdi() + " hazırlanıyor");

            for (int i = 0; i < 5; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
            if (seker != "4") {

                System.out.println();
                System.out.print("Şeker ekleniyor");
                for (int i = 0; i < 3; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                }
            }

            if (sut != "0") {

                System.out.println();
                System.out.print("Süt ekleniyor");
                for (int i = 0; i < 3; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                }
            }
            System.out.println("\nKahveniz Hazır. Afiyet Olsun.");
        }  else {
            System.out.println("Hatalı giriş yaptınız tekrar deneyiniz : ");
            kahveCikis();
        }

    }
}
