package _15_Exceptions.Q05._01;

public class Account {
    int accountNumber=1; // müşteri hesap no
    private double balance; // bakiye

    //private static int Number = 1; // otomatik verilecek sayac

    public Account() {
        this.accountNumber++;
    }

    public void deposit(double incomeMoney) // gelen para
    {
        this.balance += incomeMoney;
    }

    public void withdraw (double outcomeMoney) // giden para
    {
        if (outcomeMoney > 5000)
            throw new RuntimeException("Günlük Limiti aştınız");

        if (outcomeMoney > this.balance)
            throw new RuntimeException("Yetersiz Bakiye..");

        this.balance -= outcomeMoney;

    }


    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
