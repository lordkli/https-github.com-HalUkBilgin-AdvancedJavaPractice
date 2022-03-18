package _06_Method_Creation;

import java.util.Scanner;

public class Q08 {
    /*
      TASK :
      Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
      String parametreli return type li reverseWord isminde bir method create ediniz

       Test Data :
      İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
      Output : versin açıklığı zihin arkadaşlara Javacı Allah
       */
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
        System.out.print("Cumle giriniz: ");
    String str = scanner.nextLine();

        System.out.println(

    reverseWord(str));

}

    public static String reverseWord(String str) {

        String[] arr = str.trim().split(" ");//split: her " " space den sonra her elemanı virgülle ayırır.

        String strTers = "";

        for (int i = arr.length - 1; i >= 0; i--) {

            strTers += arr[i] + " ";
        }

        return strTers.trim();

    }
}
