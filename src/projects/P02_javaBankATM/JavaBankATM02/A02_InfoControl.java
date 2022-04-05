package projects.P02_javaBankATM.JavaBankATM02;
import java.util.Scanner;

import static projects.P02_javaBankATM.JavaBankATM02.A03_Transactions.checkIbanAndPassword;
import static projects.P02_javaBankATM.JavaBankATM02.A03_Transactions.checkPin;
import static projects.P02_javaBankATM.JavaBankATM02.A04_ChoiceMenu.menuChoice;


public class A02_InfoControl {


    public static void atmStart() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 0 for transaction without ATM card\nPress 1 for transaction with ATM card");
        int cardChoice = scan.nextInt();
        if (cardChoice == 0) {
          transactionWithoutCard();
        } else if (cardChoice == 1) {
          transactionWithCard();
        } else {
            System.out.println("Please enter 1 or 0...");
            atmStart();
        }
    }
    public static void transactionWithoutCard() {
        System.out.println("---- Cardless Transcation Section ----");
        if (checkPin()) {
            menuChoice();
        }else{
            System.out.println("Due to wrong trials, your account has been blocked !");
        }
    }

    public static void transactionWithCard() {
        if (checkIbanAndPassword()) {
            menuChoice();
        }else{
            System.out.println("Due to wrong trials, your account has been blocked !");
        }
    }
}
