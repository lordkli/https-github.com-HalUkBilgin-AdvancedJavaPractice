package JavaProjects.P02_javaBankATM.JavaBankATM02;

import java.util.Locale;
import java.util.Scanner;

import static JavaProjects.P02_javaBankATM.JavaBankATM02.A03_Transactions.*;

public class A04_ChoiceMenu {
    static String correctPassword = "0000";
    static String correctCardNumber = "TR1122334455667788";
    static double accountBalace= 10000;
    static double amount;
    static int cardChoice;

    public static void menuChoice(){
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Please select what you would like to do from list");
            System.out.println("1-Send Money\n2-Withdraw Money\n3-Deposit Money" +
                    "\n4-Check your account balance\n5-Exit");
            int cardChoice = scan1.nextInt();

            if (cardChoice == 1) {
                System.out.println("Please enter the amount which you want to transfer");
                Scanner scan = new Scanner(System.in);
                double sendingAmount = scan.nextDouble();
                sendMoney(sendingAmount);

            }else if (cardChoice == 2) {
                System.out.println("Please enter the amount which you want to withdraw");
                Scanner scan = new Scanner(System.in);
                double withdrawAmount = scan.nextDouble();
                withdrawMoney(withdrawAmount);

            }else if (cardChoice == 3) {
                System.out.println("Please enter the amount which you want to deposit");
                Scanner scan = new Scanner(System.in);
                double depositAmount = scan.nextDouble();
                depositMoney(depositAmount);

            }else if (cardChoice == 4) {
                checkAccountBalance();

            }else if (cardChoice == 5) {
                System.out.println("Have good a day...");
            }else {
                System.out.println("Wrong choice..");
                System.out.println("Would you like to try again? \nY/N?");
                Scanner scan3 = new Scanner(System.in);
                String wrongChoice = scan3.next().toUpperCase(Locale.ROOT);
                if (wrongChoice.equals("Y")){
                    menuChoice();
                }else if (wrongChoice.equals("N")){
                    System.out.println("Have good a day...");
                }else {
                    System.out.println("Wrong choice...");
                    System.out.println("Have good a day...");
                }
            }

    }


}
