package AplicareaInPractica;

public class Model {
    public static void main(String[] args) {
        Masina masina = new Masina("Toyota", "Land Cruiser", 250);
        System.out.println("Detalii initiale:");
        masina.afiseazaDetalii();

        //Modificam detaliile initiale ale masinii
        masina.setVitezaMaxima(220);

        // Afisam detaliile actualizate ale masinii
        System.out.println("Dupa modificare:");
        masina.afiseazaDetalii();
    }
}
