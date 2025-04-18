package Magazin;

public class Product {
    private String nume;
    private double pret;
    private int cantitateStock;

    public Product(String nume, double pret, int canatitateStock) {
        this.nume = nume;
        this.pret = pret;
        this.cantitateStock = canatitateStock;
    }

    public void afiseazaDetalii() {
        System.out.println("Produsul " + nume);
        System.out.println("Pretul acestuia este de " + pret);
        System.out.println("In stoc au mai ramas " + cantitateStock + " Bucati");
    }

    public void adaugaInStoc(int cantitate) {
        if (cantitate == 0) {
            cantitateStock += cantitate;
            System.out.println("S-au adaugat " + cantitate + " bucati in stocul " + nume);

        }
    }

    public void vindeProdus(int cantitate) {
        if (cantitate <= cantitateStock) {
            cantitateStock -= cantitate;
            System.out.println("S-au vandut " + cantitate + " bucati din " + nume);
        } else {
            System.out.println("Stoc insuficient pentru " + nume + " !");
        }
    }
}
