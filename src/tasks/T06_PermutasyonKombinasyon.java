package tasks;

import java.util.Scanner;

public class T06_PermutasyonKombinasyon {
    /*  Problem Tanımı
            Verilen iki sayının kombinasyonunu bulan kodu yazınız.
            Hatırlatma C(n,r) = n! / (r!(n-r)!)

            Verilen iki sayının permütasyonunu bulan kodu yazınız.
            Hatırlatma P(n,r) = n! / (n-r)!

            Ekran Çıktısı
            Birinci sayıyı giriniz: 15
            Ikinci sayıyı giriniz: 4
            Kombinasyon: 1365
            permütasyon: 32760

            Birinci sayıyı giriniz: 5
            Ikinci sayıyı giriniz: 3
            Kombinasyon: 10
            permütasyon: 60
          */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Permütasyon ve Kombinasyon hesabı için n değerini giriniz: ");
        long n = scan.nextInt();

        System.out.print("Permütasyon ve Kombinasyon hesabı için r değerini giriniz: ");
        long r = scan.nextInt();


        if (kombinasyon(n, r) == 0 && permutasyom(n, r) == 0) {
            System.out.println("Seçim sayısı(n) eleman sayısına(r) eşit veya eleman sayısından(r) büyük olmalidir. (n>=r)");
        } else {
            System.out.println("kombinayon : " + kombinasyon(n, r));
            System.out.println("Permütasyon : " + permutasyom(n, r));
        }
    }

  // public static long faktoriyel(long number) {
  //     long fakSonuc = 1;
  //     for (int i = 1; i <= number; i++) {
  //         fakSonuc *= i;
  //     }
  //     return fakSonuc;
  // }
  private static long faktoriyel(long sayi) {//Ahan da TRICK köşesinde böyün:  ozyinelemeli metodlar ===Recursive Mothods
      if (sayi <= 0)  return 1 ;
      return sayi * faktoriyel(sayi - 1);
  }

    public static long kombinasyon(long n, long r) {
        if (n > 0 && r > 0 && n >= r) {
            return (faktoriyel(n) / (faktoriyel(n - r) * faktoriyel(r)));
        } else if (n == 0 && r == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static long permutasyom(long n, long r) {
        if (n > 0 && r > 0 && n >= r) {
            return (faktoriyel(n) / faktoriyel(n - r));
        } else if (n == 0 && r == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

