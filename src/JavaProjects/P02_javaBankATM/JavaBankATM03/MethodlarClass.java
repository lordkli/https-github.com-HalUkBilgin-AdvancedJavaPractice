package JavaProjects.P02_javaBankATM.JavaBankATM03;
import java.util.Scanner;


public class MethodlarClass {
   static Scanner scan = new Scanner(System.in);
    public static void secimYap() {
        System.out.println("Bakiye Sorgulama icin 1\nPara Yatirma icin 2\nPara Cekme icin 3\nPara Gonderme icin 4\n" +
                "Sifrenizi degistirmek icin 5\nCikis icin 6 tuslayiniz.");
        int secim=scan.nextInt();

        switch (secim) {
            case 1:
                bakiyeSorgula();
                break;
            case 2:
                paraYatir();
                break;
            case 3:
                ParaCek();
                break;
            case 4:
                paraGonder();
                break;
            case 5:
                sifreDegistir();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Gecersiz bir secim yaptiniz. Lutfen tekrar deneyiniz.");
                secimYap();

        }
    }

    public static void bakiyeSorgula() {
        System.out.println("Bakiyeniz : " + MusteriBilgileri.bakiye + " TL.\nDevam etmek icin 1, cikis icin 2");
        int secim = scan.nextInt();
        if (secim == 1) {
            secimYap();
        }else if (secim == 2){
            cikis();
        }
    }

    public static void paraYatir() {
        System.out.println("Yatirmak istediginiz tutari giriniz:");
        double yatirilanTutar=scan.nextDouble();
        MusteriBilgileri.bakiye+=yatirilanTutar;
        bakiyeSorgula();


    }

    public static void ParaCek() {
        System.out.println("Cekmek istediginiz tutari giriniz: ");
        double cekilecekTutar=scan.nextDouble();
        if (cekilecekTutar>MusteriBilgileri.bakiye){
            System.out.println("Bakiyeniz yetersiz...!");
            bakiyeSorgula();
        }else{
            MusteriBilgileri.bakiye-=cekilecekTutar;
            bakiyeSorgula();
        }

    }

    public static void paraGonder() {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen gondermek istediginiz IBAN numarasini giriniz:");
        String ibanNo=scan.nextLine();
        if (!ibanNo.startsWith("TR") && (ibanNo.length()!=26)){
            secimYap();
        }else {
            System.out.println("Gondermek istediniz tutari giriniz:");
            double gonderilecekTutar = scan.nextDouble();
            if (gonderilecekTutar > MusteriBilgileri.bakiye) {
                System.out.println("Bakiyeniz yetersiz...!");
                bakiyeSorgula();
            } else {
                MusteriBilgileri.bakiye -= gonderilecekTutar;
                System.out.println("Belirttiginiz IBAN numarasina "+ gonderilecekTutar+" TL transfer edildi.");
                bakiyeSorgula();
            }
        }


    }

    public static void sifreDegistir() {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen mevcut sifrenizi giriniz: ");
        String sifreTeyit=scan.nextLine();
        if (sifreTeyit.equals(MusteriBilgileri.getSifre())){
            System.out.println("Lutfen yeni sifrenizi giriniz:");
            String yeniSifre =scan.nextLine();
            MusteriBilgileri.setSifre(yeniSifre);
            System.out.println("Sifreniz basarili bir sekilde degistirildi");
            secimYap();
        }else{
            System.out.println("Sifreniz hatali.");
            girisEkraninaGit();
        }

    }

    public static void cikis() {
        System.out.println("Bankamizi tercih ettiginiz icin tesekkurler. Yine bekleriz...");
    }
    public static void girisEkraninaGit(){
        System.out.println("*******   JAVABANK'E HOS GELDINIZ   *******");
        System.out.println("Lutfen kart numaranizi giriniz: ");
        String girilenKartNo= scan.nextLine().replaceAll(" ","");
        System.out.println("Lutfen sifrenizi giriniz: ");
        String girilenSifre= scan.nextLine();

        if (girilenKartNo.equals(MusteriBilgileri.getKartNo())&&
                girilenSifre.equals(MusteriBilgileri.getSifre())){
            MethodlarClass.secimYap();

        }else{
            System.out.println("Kart numaraniz veya sifreniz hatali. Lutfen tekrar deneyiniz...");
            girisEkraninaGit();
        }
    }

}
