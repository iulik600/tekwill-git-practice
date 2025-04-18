package GestionareContBacar;

public abstract class BankAccount {
    protected String accountNumber;
    protected String ownerName;
    protected double balance;

    //  - Constructor -
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // - Metoda publica -
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depunere reusita: " + amount + " Lei.");
        } else {
            System.out.println("Suma introdusa nu este valida.");
        }
    }

    public void withdraw(double amount) {

    }

    // - Afiseaza informatiile contului -
    public void showDetails() {
        System.out.println("Cont: " + accountNumber);
        System.out.println("Titular: " + ownerName);
        System.out.println("Sold: " + balance + " Lei.");
    }
}

