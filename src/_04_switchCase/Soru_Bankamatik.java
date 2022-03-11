package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("    ****    ");
        System.out.println("    ATM'ye hos geldiniz  :-)    ");
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatırma : 3\ncıkıs : 4\nyapacagınız işlemi seciniz : ");
        int islem = scan.nextInt();
        int bakıye=1000;
        switch (islem) {
            case 1:
                System.out.println("mevcut bakıyeniz : "+bakıye);
                break;
            case 2:
                System.out.print("cekecegınız miktarı giriniz : ");
                int cekilenMiktar = scan.nextInt();
                if(cekilenMiktar>bakıye){
                    System.out.println("agam niddin olmayan parayı mi cekicen  :-) ");
                }else {
                    bakıye-=cekilenMiktar;
                    System.out.println("bakıyenizin güncel hali : "+bakıye);
                }
                break;
            case 3:
                System.out.print("yatıracagınız miktarı giriniz : ");
                int yatırılanMiktar = scan.nextInt();
                bakıye+=yatırılanMiktar;
                System.out.println("bakıyenizin güncel hali : "+bakıye);
                break;
            case 4:
                System.out.println("cıkısınız yapılmıstır yine bekleriz :-)");
                break;

        }

    }
}

