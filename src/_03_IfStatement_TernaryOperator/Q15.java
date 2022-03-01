package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz = ");
		int sayi = scan.nextInt();
		
		// System.out.println("say�n�n mutlak de�eri=" + Math.abs(sayi));
		
		 if (sayi < 0) {
          sayi*=(-1);
        }
            System.out.println("girdiginiz sayinin mutlak degeri = " +sayi);

 
		scan.close();
		
		
		
		
		
		
	}

}
