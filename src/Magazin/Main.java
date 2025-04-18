package Magazin;

public class Main {
    public static void main(String[] args) {
        Product produs1 = new Product("Laptop Lenovo", 20000, 5);
        Product produs2 = new Product("Placa video RTX GeForce", 15000,6);

        // Afisam detaliile
        produs1.afiseazaDetalii();
        produs2.afiseazaDetalii();

        // Adaugam in stooc
        produs1.adaugaInStoc(2);
        produs2.adaugaInStoc(1);

        // Vanzare produse
        produs1.vindeProdus(2);
        produs2.vindeProdus(20);

        produs1.afiseazaDetalii();
        produs2.afiseazaDetalii();
    }
}
