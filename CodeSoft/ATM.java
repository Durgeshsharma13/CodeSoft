package CodeSoft;

import java.util.Scanner;

public class ATM {
    private double balance;

    public ATM(double initialamount) {
        balance = initialamount;
    }

    public double checkamount() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();
        sc.nextLine(); 

        ATM atm = new ATM(initialBalance);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option (1/2/3/4): ");
            
            int choice = sc.nextInt();
            sc.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + atm.checkamount());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositamount = sc.nextDouble();
                    atm.deposit(depositamount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    atm.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Its working");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
}
}
}
}

