package AplicareaInPractica;

public class Masina {
    private String marca;
    private String model;
    private int vitezaMaxima;

    public Masina(String marca, String model, int vitezaMaxima) {
        this.marca = marca;
        this.model = model;
        this.vitezaMaxima = vitezaMaxima;
    }
    // Getter pentru marca
    public String getMarca() {
        return marca;
    }
    //Setter pentru marca

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    // Afisam metoda
    public void afiseazaDetalii() {
        System.out.println("Marca: " + marca);
        System.out.println("Model: " + model);
        System.out.println("Viteza maxima: " + vitezaMaxima + " km/h");
    }
}

