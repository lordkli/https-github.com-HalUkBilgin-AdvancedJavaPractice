package _15_Exceptions.Q05._02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    private long accountNumber;
    private String adSoyad;
    private long bakiye;
    private long gunlukLimit;
    public static List<Account> accountList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public Account() {
    }

    public Account(long accountNumber, String adSoyad, long bakiye, long gunlukLimit) {
        this.accountNumber = accountNumber;
        this.adSoyad = adSoyad;
        this.bakiye = bakiye;
        this.gunlukLimit = gunlukLimit;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getGunlukLimit() {
        return gunlukLimit;
    }

    public void setGunlukLimit(long gunlukLimit) {
        this.gunlukLimit = gunlukLimit;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public long getBakiye() {
        return bakiye;
    }

    public void setBakiye(long bakiye) {
        this.bakiye = bakiye;
    }

    public void paraEkle(long eklenecekMiktar) {
        this.bakiye += eklenecekMiktar;
        System.out.println(this.getBakiye());
    }

    public void paraCikar(long cekilecekMiktar) {
        if (cekilecekMiktar > this.getBakiye()) {
            System.out.println("Bakiye yetersiz.");
        } else {
            try {
                gunlukLimit += cekilecekMiktar;
                if (gunlukLimit > 5000) {
                    throw new Exception();
                } else {
                    System.out.println("Cekme islemi basari ile tamamnandi.");
                    this.bakiye -= cekilecekMiktar;
                    System.out.println(this.getBakiye());
                }
            } catch (Exception e) {
                System.out.println("Limit Asim Uyarisi : Gunluk limit 5000TL'dir.");
            }
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountList=" + accountList.toString() +
                '}';
    }
}
