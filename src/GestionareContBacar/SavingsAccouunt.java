package GestionareContBacar;

public class SavingsAccouunt extends BankAccount {
    private static final double INTEREST_RATE = 0.03;
    private int monthlywithdrawals = 0;

    //  - Constructor -
    public SavingsAccouunt(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (monthlywithdrawals >=1) {
            System.out.println("Retragere respinsa! Ai atins limita de o retragere pe luna.");
        } else if (amount <= balance) {
            balance -= amount;
            monthlywithdrawals++;
            System.out.println("Retragere reusita: " + amount + " Lei");
        } else {
            System.out.println("Fonduri insuficiente.");
        }
    }

    // Aplicarea dobandei anuala
    public void applyInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Dobanda adaugata: " + interest + " Lei.");
    }
    // Resetarea numarului de retrageri
    public void resetMonthlyWithdrawals() {
        monthlywithdrawals = 0;
    }
}
