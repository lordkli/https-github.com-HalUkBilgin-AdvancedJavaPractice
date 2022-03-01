package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
        Kulanıcıdan aracının hızını alınız
        Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
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

        Scanner scan = new Scanner(System.in);
        System.out.print("Ehliyetiniz var ise 1 , yoksa 0 yazınız : ");

        int ehliyet = scan.nextInt();

        System.out.print("Hızınızı giriniz : ");

        int hız = scan.nextInt();

        if (ehliyet == 1) {
            if (hız < 0) {
                System.out.println("hatalı veri girdiniz");
            } else if (hız > 54 && hız < 75) {
                System.out.println("Ceza 100 $'dır.");
            } else if (hız >= 75 && hız < 85) {
                System.out.println("Ceza 150 $'dır.");
            } else if (hız >= 85 && hız < 95) {
                System.out.println("Ceza 320 $'dır.");
            } else if (hız >= 95) {
                System.out.println("Ceza 500 $'dır.");
            } else {
                System.out.println("Hız Sınırında seyahat ediyorsunuz hayırlı yolculuklar.. ");
            }
        } else if (ehliyet == 0) {
            if (hız > 54 && hız < 75) {
                System.out.println("Ceza 300 $'dır.");
            } else if (hız >= 75 && hız < 85) {
                System.out.println("Ceza 350 $'dır.");
            } else if (hız >= 85 && hız < 95) {
                System.out.println("Ceza 520 $'dır.");
            } else if (hız >= 95) {
                System.out.println("Ceza 700 $'dır.");
            } else {
                System.out.println("Sadece Ehliyetsiz kullanımdan dolayı cezanız  200 $'dır. ");
            }
        } else {
            System.out.println("Lütfen Geçerli Bir değer Giriniz!");
        }

    }
}
