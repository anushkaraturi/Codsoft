import java.util.Scanner;

class Bankacc {
    private double Balance;

    public double getBalance() {
        return Balance;
    }

    public Bankacc(double initialBalance) {
        this.Balance = initialBalance;
    }

    public void Deposite(double amount) {
        if (amount > 0) {
            Balance = Balance + amount;
            System.out.println("Deposite Successful.");
            System.out.println("Balance : " + Balance);
        } else {
            System.out.println("Invalid deposite amount.");
        }
    }

    public void Withdraw(double amount) {
        if (amount > 0 && amount <= Balance) {
            Balance = Balance - amount;
            System.out.println("Withdrawl Successful.");
            System.out.println("Balance : " + Balance);
        } else if (amount > Balance) {
            System.out.println("Insufficient balance \n Withdrawl Failed");
        } else {
            System.out.println("Invalid withdrawl amount");
        }
    }

    public void CheckBalance() {
        System.out.println("Current Balance : " + Balance);
    }

}

class AAtm {
    private Bankacc account;
    Scanner sc = new Scanner(System.in);

    public AAtm(Bankacc b) {
        account = b;
    }

    public void UserInterface() {
        while (true) {
            System.out.println("-----AAtm MACHINE-----");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    account.CheckBalance();
                    break;
                case 2:
                    System.out.print("Enter the Withdrawl amount :");
                    double amount_w = sc.nextDouble();
                    account.Withdraw(amount_w);
                    break;
                case 3:
                    System.out.println("Enter the Depositing amount :");
                    double amount_d = sc.nextDouble();
                    account.Deposite(amount_d);
                    break;
                case 4:
                    System.out.println("Thank you ");
                    return;
                default:
                    System.out.println("Invalid Option. Try Again!");
            }
        }
    }
}

public class Atmm {
    public static void main(String[] args) {
        Bankacc b = new Bankacc(5000);
        AAtm a = new AAtm(b);
        a.UserInterface();
    }
}
