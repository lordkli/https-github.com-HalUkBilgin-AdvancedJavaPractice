package _06_Method_Creation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz :");
        String str = scan.nextLine().toLowerCase();

        System.out.println(xyzVarmi(str));

    }

    public static boolean xyzVarmi(String str) {

        if (str.contains("xyz")) {
            return true;
        } else {
            return false;

        }
    /*public static boolean xyzVarmi(String str) {
        boolean flag=false;
        if (str.contains("xyz")) {
            flag=true;
        }

        return flag;
    }*/
    }
}


