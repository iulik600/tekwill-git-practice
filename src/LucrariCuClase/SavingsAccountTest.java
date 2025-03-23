package LucrariCuClase;

    // Clasa SavingsAccount
    class SavingsAccount {
        private double savingsBalance; // Soldul contului de economii
        private static double annualInterestRate; // Rata anuală a dobânzii

        // Constructor pentru inițializarea soldului
        public SavingsAccount(double balance) {
            this.savingsBalance = balance;
        }

        // Metodă finală pentru calcularea dobânzii lunare
        public final void calculateMonthlyInterest() {
            double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
            savingsBalance += monthlyInterest;
        }

        // Metodă statică pentru modificarea ratei dobânzii
        public static void modifyInterestRate(double newRate) {
            annualInterestRate = newRate;
        }

        // Metodă pentru afișarea soldului curent
        public void displayBalance() {
            System.out.printf("Sold curent: $%.2f\n", savingsBalance);
        }
    }

    // Clasa principală pentru testarea conturilor de economii
    public class SavingsAccountTest {
        public static void main(String[] args) {
            // Crearea a două conturi de economii
            SavingsAccount saver1 = new SavingsAccount(2000.00);
            SavingsAccount saver2 = new SavingsAccount(3000.00);

            // Setarea ratei anuale a dobânzii la 4%
            SavingsAccount.modifyInterestRate(0.04);

            // Calcularea și afișarea soldului după o lună de dobândă
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.println("După o lună cu 4% dobândă:");
            System.out.print("Saver 1: "); saver1.displayBalance();
            System.out.print("Saver 2: "); saver2.displayBalance();

            // Modificarea ratei dobânzii la 5%
            SavingsAccount.modifyInterestRate(0.05);

            // Calcularea și afișarea soldului după încă o lună de dobândă
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.println("\nDupă încă o lună cu 5% dobândă:");
            System.out.print("Saver 1: "); saver1.displayBalance();
            System.out.print("Saver 2: "); saver2.displayBalance();
        }
    }

