package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("tolpama icin 1\ncikarma icin 2\ncarpma  icin 3\nbolme   icin 4 \nLutfen isleminizi seciniz: ");
		int islem = scan.nextInt();
		System.out.println("Lutfen iki sayi giriniz : ");
		
		double num1 =scan.nextDouble();
		double num2 = scan.nextDouble();
		
		if(islem==1) {
			System.out.println("Toplama isleminin sonucu: " + num1+" + "+num2+" = "+(num1+num2));
		}else if (islem==2) {
			System.out.println("Cikartma isleminin sonucu: " + num1+" - "+num2+" = "+(num1-num2));
			
		}else if (islem==3) {
			System.out.println("Carpma isleminin sonucu: " + num1+" x "+num2+" = "+(num1*num2));
		}else if (islem==4) {
			System.out.println("Bolme isleminin sonucu: " + num1+" / "+num2+" = "+(num1/num2));
		}else {
			System.out.println("Hatali secim");
		}
		

		
		
		
		
		
	}

}
