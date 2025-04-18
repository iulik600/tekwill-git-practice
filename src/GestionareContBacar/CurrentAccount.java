package GestionareContBacar;

// Extindem clasa BankAccount = mostenire
public class CurrentAccount extends BankAccount {
    // - Constructor - apeleaza constructorul clasei parinte cu super
    public CurrentAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    // Implementarea specifica pentru retragere cu mai putin de 50 mdl
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 50) {
            balance -= amount;
            System.out.println("Retragere reusita: " + amount + " Lei.");
        } else {
            System.out.println("Retragere respinsa! Soldul nu poate fi mai mic de 50 Lei.");
        }
    }
}
