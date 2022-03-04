package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */


        Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.

        System.out.println("boyunuzu cm giriniz : ");
        double boy=scan.nextDouble();

        System.out.println("kilonuzu  kg giriniz : ");
        double kilo=scan.nextDouble()/100;

        double bmi=kilo/((boy)*(boy));
        if (bmi<=20){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Oldukca Zayifsiniz");
        } else if (bmi>20 & bmi<=25){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Normalsınız");
        } else if (bmi>25 & bmi<=30){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Sismansınız");
        } else if (bmi>30){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Obezsiniz");
        }
    }

}
