package Projects.Projects_01;

import java.util.Scanner;

public class days {

      /*
        Given an int  ,
            if the int is 1 print monday
            if the int is 2 print tuesday
            if the int is 3 print wednesday
            if the int is 4 print thursday
            if the int is 5 print friday
            if the int is 6 print saturday
            if the int is 7 print sunday
            if the number more then 8 print "this is not a valid day"

            NOTE : USE A SWITCH STATEMENT WHILE DOING THIS EXERCISE

     */

    /*
            Veri tipi int olan variable(değişken) verildiğinde

                Eger int 1 ise print monday
                Eger int 2 ise print tuesday
                Eger int 3 ise print wednesday
                Eger int 4 ise print thursday
                Eger int 5 ise print friday
                Eger int 6 ise print saturday
                Eger int 7 ise print sunday
                Eger int 8 den buyuk ise  print "this is not a valid day"

                NOT : BU PROBLEMI ÇÖZERKEN SWITCH STATEMENT KULLANIN

         */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();

        //  code Start here don't change before this line
        //  kodu burdan başlatın ve bu satırdan önceki kodlari degiştirmeyin

        switch(day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;


            default:
                System.out.println("this is not a valid day");
        }
    }
}



