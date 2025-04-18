package GestionareContBacar;

public class Main {
    public static void main(String[] args) {
        BankAccount cont1 = new CurrentAccount("MD12BANK1111", "Iulia", 500);
        BankAccount cont2 = new SavingsAccouunt("MD12BANK2222", "Andrei", 1000);
        cont1.showDetails();
        cont1.deposit(200);
        cont1.withdraw(600); // va fi respinsa daca trece sub 50
        System.out.println();

        cont2.showDetails();
        cont2.withdraw(300); //prima retragere permisa
        cont2.withdraw(100); // a doua va fi respinsa

        // Cast pentru a aplica dobanda
        ((SavingsAccouunt) cont2).applyInterest();
        cont2.showDetails();
    }
}
