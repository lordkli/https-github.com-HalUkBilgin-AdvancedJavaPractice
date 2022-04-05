package projects.P02_javaBankATM.JavaBankATM02;

import java.util.*;

import static projects.P02_javaBankATM.JavaBankATM02.A02_InfoControl.*;
import static projects.P02_javaBankATM.JavaBankATM02.A04_ChoiceMenu.*;


public class A03_Transactions<pin1> {

    static int pin1;
    static int userPin;
    public static Scanner scan = new Scanner(System.in);

    public static void sendMoney(double sendingAmount) {
        System.out.println("Your current balance = " + accountBalace + " $");
        if (sendingAmount <= accountBalace) {
            String iban1 = getIban();
            if (iban1.startsWith("TR") && iban1.length() == 26) {
                accountBalace -= sendingAmount;
                System.out.println(sendingAmount + " $ has been sent to " + iban1 + " succesfully.");
                System.out.println("New balance of your acoount : " + accountBalace);
            } else {
                System.out.println("Wrong IBAN number");
                menuChoice();
            }
        } else {
            System.out.println("You can't send bigger amount than your current amount");
            sendMoney(sendingAmount);
        }

        System.out.println("Would you like to proceed any other transcation?\nType \"Y or N\" ");
        Scanner scan1 = new Scanner(System.in);
        char choice = scan1.next().toUpperCase(Locale.ROOT).charAt(0);
        if (choice == 'Y') {
            menuChoice();
        } else if (choice == 'N') {
            System.out.println("Have good a day...");
        }else{
            menuChoice();
        }

    }

    public static void withdrawMoney(double withdrawAmount) {
        System.out.println("Your current balance = " + accountBalace + " $");
        if (withdrawAmount <= accountBalace) {
            accountBalace -= withdrawAmount;
            System.out.println(withdrawAmount + " $ has been withdrawed succesfully.");
            System.out.println("New balance of your acoount : " + accountBalace);
        } else if (withdrawAmount > accountBalace) {
            System.out.println("You can't withdraw bigger amount than your current account balance");
            withdrawMoney(withdrawAmount);
        }

        System.out.println("Would you like to proceed any other transcation?\nType \"Y or N\" ");
        Scanner scan1 = new Scanner(System.in);
        char choice = scan1.next().toUpperCase(Locale.ROOT).charAt(0);
        if (choice == 'Y') {
            menuChoice();
        } else if (choice == 'N') {
            System.out.println("Have good a day...");
        }else{
            menuChoice();
        }

    }

    public static void depositMoney(double depositAmount) {
        accountBalace += depositAmount;
        System.out.println("Your current balance after deposit = " + accountBalace + " $");
        System.out.println("Would you like to proceed any other transcation?\nType \" Y or N\" ");
        Scanner scan1 = new Scanner(System.in);
        char choice = scan1.next().toUpperCase(Locale.ROOT).charAt(0);
        if (choice == 'Y') {
            menuChoice();
        } else if (choice == 'N') {
            System.out.println("Have good a day...");
        }else{
            menuChoice();
        }

    }

    public static void checkAccountBalance() {
        System.out.println("Your current balance = " + accountBalace + " $");
        System.out.println("Would you like to proceed any other transcation?\nType \" Y or N\" ");
        Scanner scan1 = new Scanner(System.in);
        char choice = scan1.next().toUpperCase(Locale.ROOT).charAt(0);
        if (choice == 'Y') {
           menuChoice();
        } else if (choice == 'N') {
            System.out.println("Have good a day...");
        }else{
            menuChoice();
        }
    }

    public static int createPin() {
        Random pin = new Random();
        pin1 = pin.nextInt(1000);
        System.out.println("A new pin code created from JavaBank to verify your account " + pin1 + " B0123");
        System.out.println("Please type the pin code above to verify");
        userPin = scan.nextInt();
        return userPin + pin1;
    }

    public static boolean checkPin() {
        boolean isCorrect = false;
        if (createPin() == 2 * pin1) {

            isCorrect = true;
        } else {
            for (int i = 0; i < 2; i++) {
                if (createPin() != 2 * pin1) {
                    System.out.println("We couldn't verify your account... ");
                } else {
                    isCorrect = true;
                    break;
                }
            }
        }
        return isCorrect;
    }

    public static String getIban() {
        System.out.println("Please enter the IBAN that you will transfer money");
        System.out.println("It must start with TR... ");
        Scanner scan1 = new Scanner(System.in);
        String iban = scan1.nextLine();
        return iban;
    }

    public static boolean checkIbanAndPassword() {
        boolean isCorrect = false;
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter your card number");
        String cardNumber = scan2.nextLine();

        System.out.println("Please enter your card password");
        String cardPassword = scan2.nextLine();
        if ((cardNumber+cardPassword).equals(correctCardNumber +  correctPassword)) {
            isCorrect = true;
        } else {
            for (int i = 0; i < 3; i++) {
                if (!(cardNumber+cardPassword).equals(correctCardNumber +  correctPassword)) {
                    System.out.println("We couldn't verify your account... ");
                } else {
                    isCorrect = true;
                    break;
                }
            }
        }
        return isCorrect;
    }
}