package LucrariCuClase;

 class SavingsAccounts {
     private double savingsBalance;
     private static double anualInterestRate;

     // Constructor pentru initializarea soldului
     public SavingsAccounts(double balance) {
         this.savingsBalance = balance;
     }

     // Metoda finala pentru calcularea dobanzii lunare
     public final void calculateMonthlyInterest() {
         double monthlyInterest = (savingsBalance * anualInterestRate) / 12;
         savingsBalance += monthlyInterest;
     }

     //Metoda statica pentru modificarea ratei dobanzii
     public static void modifyInterestRate(double newRate) {
         anualInterestRate = newRate;
     }

     //Metoda pentru afisarea soldului curent
     public void displayBalance() {
         System.out.println("Sold curent: " + savingsBalance);
     }
}

// Clasa principala pentru testarea conturilor de economii
public class SavingsAccountTest {
    public static void main(String[] args) {
     SavingsAccounts saver1 = new SavingsAccounts(2000);
     SavingsAccounts saver2 = new SavingsAccounts(3000);

        //Setarea ratei anuale a dobanzii la 4%w
        SavingsAccounts.modifyInterestRate(0.04);

        //Calcularea si afisarea soldului dupa o luna de dobanda
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Dupa o luna cu 4% dobanda:");
        System.out.println("Saver 1: "); saver1.displayBalance();
        System.out.println("Saver 2: "); saver2.displayBalance();

    }
}
