package exercises;

public class Bank {
    String name;
    long accNumber;
    double currBalance;

    public Bank() {

    }

    public Bank(String name, long accNumber, double currBalance) {
        this.name = name;
        this.accNumber = accNumber;
        this.currBalance = currBalance;
    }

    public void displayAccount() {
        System.out.println("Account Name : "  + name);
        System.out.println("Account number : "  + accNumber);
        System.out.println("Current Balance : "  + currBalance);

    }

}
