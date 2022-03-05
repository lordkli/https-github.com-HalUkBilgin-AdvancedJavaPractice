package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */
        Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.

        System.out.print("ehliyetiniz var ise -> 1 yok ise -> 0 yazınız : ");
        int ehliyetiniz = scan.nextInt();
        if (ehliyetiniz == 0 || ehliyetiniz == 1) {//ehlivetin varlık yokluk sartına göre diger kosullar çalışacak
            if (ehliyetiniz == 0) {
                System.out.println("hızınızı sormadan kafadan bir 200$ kitledim size");
            }
            System.out.print("hızınızı giriniz : ");
            int hızınız = scan.nextInt();

            if (ehliyetiniz == 1) {
                if (hızınız < 0) {
                    System.out.println(" negatif hız olmaz hatalı veri girdiniz");
                } else if (hızınız >= 55 && hızınız < 75) {
                    System.out.println(" Ceza 100 $'dır.");
                } else if (hızınız >= 75 && hızınız < 84) {
                    System.out.println("  Ceza 150 $'dır.");
                } else if (hızınız >= 84 && hızınız <= 94) {
                    System.out.println(" Ceza 320 $'dır.");
                } else if (hızınız > 94) {
                    System.out.println(" Ceza 500 $'dır.");
                } else System.out.println("hız sınırnda seyahat ediyorsunuz hayırlı yolculuklar");

            } else if (ehliyetiniz == 0) {
                if (hızınız < 0) {
                    System.out.println(" negatif hız olmaz hatalı veri girdiniz");
                } else if (hızınız >= 55 && hızınız < 75) {
                    System.out.println(" Ceza 300 $'dır.");
                } else if (hızınız >= 75 && hızınız < 84) {
                    System.out.println("  Ceza 350 $'dır.");
                } else if (hızınız >= 84 && hızınız <= 94) {
                    System.out.println(" Ceza 520 $'dır.");
                } else if (hızınız > 94) {
                    System.out.println(" Ceza 700 $'dır.");
                } else System.out.println("hız sınırında seyahat ediyorsunuz ancak ehliyetsiz olg için cezanız 200$");

            } else System.out.println("agam nişedin ehliyet vaa mı yoooh mu?");
        } else
            System.out.println("agam bizimle eglenir ehliyet vva mı yooh mu :)");//ehliyet verisinin hatalı olmasi kontrolu
    }

}
