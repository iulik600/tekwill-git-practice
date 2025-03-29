package AplicareaInPractica;

public class ContBancar {
    private String titular;
    private double sold;

    public ContBancar(String numeTitular, double soldInitial) {
        this.titular = numeTitular;
        this.sold = soldInitial;
    }

    // Meetode
    public void depunere(double suma) {
        if (suma > 0) {
            sold += suma;
            System.out.println("Ai depus" + suma + " MDL in contul tau bancar");
            System.out.println("Sold actual: " + sold);
        } else {
            System.out.println("Aceasta suma este invalida");
        }
    }
    public void retragere(double suma) {
        if(suma > 0 && suma <= sold) {
            sold -= suma;
            System.out.println("Dvs. ati retras" + suma + " MDL din cont");
            System.out.println("Sold curent: " + sold);
        } else {
            System.out.println("Nu ai aceasta suma in cont!");
        }

    }
        public void afiseazaSold() {
            System.out.println("Soldul actual pentru" + titular + " este: " + sold + " MDL  ." );
        }
    }


