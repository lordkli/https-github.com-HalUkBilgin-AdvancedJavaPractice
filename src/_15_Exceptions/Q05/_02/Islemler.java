package _15_Exceptions.Q05._02;

import static _15_Exceptions.Q05._02.Account.accountList;
import static _15_Exceptions.Q05._02.Account.scan;

public class Islemler {
    Islemler(){

        while (true)
        {
            for (int i = 0; i < accountList.size(); i++) {
                System.out.print(accountList.get(i).getAccountNumber());
                System.out.println();
            }

            System.out.println("İşlem yapmak istediğiniz account number seçiniz : ");
            int girilenAccountNumber = scan.nextInt();

            for (int i = 0; i < accountList.size(); i++) {
                if (girilenAccountNumber == accountList.get(i).getAccountNumber()) {
                    System.out.println("Bakiye goruntulemek için 1'e, \n " +
                            "Para çekmek için 2'ye, \n " +
                            "Para yatırmak için 3'e basınız. \n " +
                            "Çıkmak için X'e basınız...");
                    int secim = 0;
                    try {
                        secim = scan.nextInt();
                        switch (secim) {
                            case 1: {
                                System.out.println(accountList.get(i).getBakiye());
                                break;
                            }
                            case 2: {
                                System.out.println("Çekilecek miktar");
                                int cekilecekMiktar = scan.nextInt();
                                accountList.get(i).paraCikar(cekilecekMiktar);
                                break;
                            }
                            case 3: {
                                System.out.println("Yatırılacak miktar");
                                int yatirilacakMiktar = scan.nextInt();
                                accountList.get(i).paraEkle(yatirilacakMiktar);
                                break;
                            }
                            default: {
                                System.out.println("Hatalı seçim yaptınız. Tekrar deneyiniz...");
                                break;
                            }
                        }
                    } catch (Exception e) {
                        String str = scan.nextLine();
                        if (str.equalsIgnoreCase("X")) {
                            System.out.println("Çıkış yapılıyor...");
                            break;
                        }
                    }
                }
            }
        }
    }
}
