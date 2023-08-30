import java.util.*;
public class atm2 {
    
    
    public static void main(String[] args) {
        Bankacc bankacc = new Bankacc(1000);
        ATM atm = new ATM(bankacc);

        System.out.println("Welcome to the ATM!");
        atm.perform();

        atm.close();
    }
}
    class Bankacc{


    private double balance;

    public Bankacc(double intbalance) {
        this.balance = intbalance;
    }

    public double getbalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited: " + amt);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
}

class ATM {
    private Bankacc acc;
    private Scanner scanner;

    public ATM(Bankacc acc) {
        this.acc = acc;
        this.scanner = new Scanner(System.in);
    }

    public void display() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void perform() {
        int choice;
        do {
            display();
            System.out.print("Select an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + acc.getbalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    acc.deposit(deposit);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = scanner.nextDouble();
                    acc.withdraw(withdrawal);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
            }
        } while (choice != 4);
    }

    public void close() {
        scanner.close();
    }
}
