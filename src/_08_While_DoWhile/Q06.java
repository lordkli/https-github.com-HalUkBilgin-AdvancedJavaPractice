package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {
	static int bolum=0; //class level de bir veriable ilk degeri 0 atandi.

	public static void main(String[] args) {
		/*TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("bolunen sayiyi giriniz  : ");
		int bolunen = scan.nextInt();
		System.out.print("bolen sayiyi giriniz  : ");
		int bolen = scan.nextInt();

		System.out.println("sonuc: "+bol(bolunen, bolen));
	}
	public static int bol(int bolunen, int bolen){
		while(bolunen>=bolen){
			bolunen-=bolen;
			bolum++;
		}

		return bolum;
	}

}


