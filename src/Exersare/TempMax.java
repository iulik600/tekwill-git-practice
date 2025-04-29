package Exersare;

public class TempMax {
    public static void main(String[] args) {
        Double temp1 = 22.5;
        Double temp2 = 25.5;

        // Folosim metoda statica Double.max pentru a afla temperatura mai mare
        Double tempereraturaMax = Double.max(temp1, temp2);

        System.out.println("Temperatura mai mare este " + tempereraturaMax + " C");
    }
}
