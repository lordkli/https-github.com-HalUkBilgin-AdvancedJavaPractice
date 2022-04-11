package JavaProjects.P03_UcusProjesi.Ucus_projesi02;

import java.util.Scanner;

public class JavaAirlines {
    public static void main(String[] args) {

        Yolcu ayhan=new Yolcu("B","tek",33);
        Scanner scan = new Scanner(System.in);
        System.out.print("javaAirlines'a hos geldin AGAM..\n B C D rotasından birini seciniz : ");
        String city = scan.next().toUpperCase();
        System.out.print("ucusunuz için \n tek yon-->1 \n cift yon-->2 \n giriniz : ");
        int flytype = scan.nextInt();
        System.out.print("agam yasını da gir : ");
        int age = scan.nextInt();
        double priceC = 0.10 * 700;
        double priceB = 0.10 * 500;
        double priceD = 0.10 * 900;

        if (city.equals("B") || city.equals("C") || city.equals("D")) {

            if (age > 65) {//65 yas ustu kontrolu yas için %30 indirim
                if (city.equals("B")) {//ucus rotası kontrolu
                    if (flytype == 1) {// ucus tek-cift yon kontrolu %20 indirim
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceB * 0.7 + " $");


                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceB * 0.7 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceC * 0.7 + " $");


                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceC * 0.7 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceD * 0.7 + " $");


                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceD * 0.7 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                }


            } else if (age >= 12 && age < 24) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceB * 0.9 + " $");


                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceB * 0.9 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceC * 0.9 + " $");


                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceC * 0.9 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceD * 0.9 + " $");


                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceD * 0.9 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                }


            } else if (age < 12) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceB * 0.5 + " $");


                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceB * 0.5 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceC * 0.5 + " $");


                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceC * 0.5 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceD * 0.5 + " $");


                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceD * 0.5 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else System.out.println("agam adam gibi yas gir :(");


            } else if (age >= 24 && age <= 65) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceB + " $");


                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceB * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceC + " $");


                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceC * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceD + " $");


                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceD * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                }


            } else System.out.println("agam henüz o gezegene ucus yok :)");


        }
    }
}
