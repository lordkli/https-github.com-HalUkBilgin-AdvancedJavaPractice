package _15_Exceptions.Q05._02;

import java.util.Random;
import java.util.Scanner;

import static _15_Exceptions.Q05._02.Account.accountList;

public class MusteriEkle {
    MusteriEkle() {

        Scanner scan = new Scanner(System.in);
        int musteriSayac = 1;

        while (true) {
            Account account = new Account();
            Random rnd = new Random();

            account.setAccountNumber(rnd.nextInt(1000));

            try {
                System.out.println("Bitirmek için X'e basınız.");
                System.out.println(musteriSayac + ".Musteri icin bilgileri giriniz.");
                System.out.print("İsim Soyisim : ");
                String str = scan.nextLine();
                if (str.equalsIgnoreCase("X")) {
                    throw new Exception();
                } else {
                    account.setAdSoyad(str);
                    musteriSayac++;
                    System.out.println("Ekleme başarılı.");
                }
            } catch (Exception e) {
                break;
            }

            while (true) {
                try {
                    System.out.print("Hesap bakiyesi : ");
                    account.setBakiye(scan.nextInt());
                    scan.nextLine(); //dummy scan
                    break;
                } catch (Exception e) {
                    System.out.println("Gecersiz giris yapildi.");
                }
            }

            Account yeniAccount = new Account(account.getAccountNumber(), account.getAdSoyad(), account.getBakiye(), account.getGunlukLimit());
            accountList.add(yeniAccount);
        }
    }
}
