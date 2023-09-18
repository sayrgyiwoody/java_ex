package chapter_13;

class BankAccount {
    
    String accountNumber;
    String accountName;
    double balance;

    public BankAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    
    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount){
        if(balance > amount){
            balance -= amount;
        }else {
            System.out.println("Withdraw amount is not enough!");
        }
        return balance;
    }
}

class SavingAccount extends BankAccount {

    public SavingAccount(String accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
    }

    public double withdraw(double amount){
        if(amount < 100) {
            System.out.println("Invalid transaction!");
        }else if(super.balance < amount) {
            System.out.println("Withdraw amount is not enough!");
        }else {
            super.balance -= amount;
        }

        return super.balance;
    }

}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("A001","Daw Aye Aye",100000);
        System.out.println("Acc Number: " + account.accountNumber);
        System.out.println("Acc Name: " + account.accountName);
        System.out.println("Current Balance :" + account.deposit(50000));
        System.out.println("Current Balance :" + account.withdraw(2000));
        System.out.println("Current Balance :" + account.withdraw(50));
        System.out.println();
        account = new SavingAccount("A001", "Daw Aye Aye", 100000);
        System.out.println("Acc Number: " + account.accountNumber);
        System.out.println("Acc Name: " + account.accountName);
        System.out.println("Current Balance :" + account.deposit(50000));
        System.out.println("Current Balance :" + account.withdraw(2000));
        System.out.println("Current Balance :" + account.withdraw(50));
        }
}
