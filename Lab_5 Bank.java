import java.util.Scanner;

abstract class Account {
    String customerName, accountNumber;
    double balance;

    Account(String customerName, String accountNumber, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    abstract void deposit(double amount);
    abstract void displayBalance();
    abstract void withdraw(double amount);
}

class SavAcct extends Account {
    double interestRate;

    SavAcct(String customerName, String accountNumber, double initialBalance, double interestRate) {
        super(customerName, accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void displayBalance() {
        System.out.println("Savings Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }

    void computeAndDepositInterest() {
        balance += balance * interestRate / 100;
    }
}

class CurAcct extends Account {
    static final double MIN_BALANCE = 1000, SERVICE_CHARGE = 50;

    CurAcct(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, initialBalance);
    }

    void deposit(double amount) {
        balance += amount;
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            if (balance < MIN_BALANCE) balance -= SERVICE_CHARGE;
        }
    }
}

 class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account type (savings/current): ");
        String type = scanner.nextLine();
       
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();
       
        System.out.println("Enter account number: ");
        String number = scanner.nextLine();
       
        Account account;
        if (type.equals("savings")) {
            System.out.println("Initial balance and interest rate: ");
            account = new SavAcct(name, number, scanner.nextDouble(), scanner.nextDouble());
        } else {
            System.out.println("Initial balance: ");
            account = new CurAcct(name, number, scanner.nextDouble());
        }

        while (true) {
            System.out.println("\n1. Deposit 2. Display Balance 3. Withdraw 4. Interest 5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: account.deposit(scanner.nextDouble());
                break;
                case 2: account.displayBalance();
                break;
                case 3: account.withdraw(scanner.nextDouble());
                break;
                case 4: if (account instanceof SavAcct) ((SavAcct) account).computeAndDepositInterest();
                break;
                case 5:
                return;
            }
        }
    }
}
OUTPUT
    Enter account type (savings/current):
savings
Enter customer name:
anu
Enter account number:
1234567890
Initial balance and interest rate:
3400
600

1. Deposit 2. Display Balance 3. Withdraw 4. Interest 5. Exit
1
500

1. Deposit 2. Display Balance 3. Withdraw 4. Interest 5. Exit
2
Savings Balance: 3900.0

1. Deposit 2. Display Balance 3. Withdraw 4. Interest 5. Exit
3
100

1. Deposit 2. Display Balance 3. Withdraw 4. Interest 5. Exit
2
Savings Balance: 3800.0

1. Deposit 2. Display Balance 3. Withdraw 4. Interest 5. Exit
4

1. Deposit 2. Display Balance 3. Withdraw 4. Interest 5. Exit
2
Savings Balance: 26600.0

1. Deposit 2. Display Balance 3. Withdraw 4. Interest 5. Exit
5
