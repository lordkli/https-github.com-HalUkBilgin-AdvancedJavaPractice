import java.util.Scanner;

public class b { /*
 * Kullanicidan gelen datayi methodda parametre olarak alan
 * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("pozitif tam sayi giriniz");
        int num = scan.nextInt();

        PowersofTwo(num);
    }

    public static void PowersofTwo(int num) {

        for (int i = 1; i < num; i++) {
            if (num % 2 == 0) {
                if (num == Math.pow(2, i)) {
                    System.out.println("Girdiğiniz sayı 2'nin katıdır.");
                    break;
                } else
                    System.out.println("Girdiğiniz sayı 2'nin katı değildir.");
                break;
            } else {
                System.out.println("Girdiğiniz sayı 2'nin katı değildir");
                break;
            }
        }
    }
}

