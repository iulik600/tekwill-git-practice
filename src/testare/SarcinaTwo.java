package testare;
import java.util.Scanner;

public class SarcinaTwo {
    public static void main(String[] args) {

    }

    {
// Primul dreptunghi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti latimea primului dreptunghi: ");
        double latime1 = scanner.nextDouble();
        System.out.println("Introduceti latimea primului dreptunghi: ");
        double lungime1 = scanner.nextDouble();

        // Al doilea dreptunghi
        System.out.println("Introduceti latimea celui de-al doilea: ");
        double latime2 = scanner.nextDouble();
        System.out.println("Introduceti lungimea celui de-al doilea drept.: ");
        double lungime2 = scanner.nextDouble();

        // Calcularea suprafetelor
        double suprafata1 = latime1 * lungime1;
        double suprafata2 = latime2 * lungime2;

        // Compararea suprafetelor
        if (suprafata1 > suprafata2) {
            System.out.println("Primul dreptunghi are o suprafata mai mare");
        } else if (suprafata2 > suprafata1) {
            System.out.println("Al doilea dreptunghi are o suprafata mai mare");
        } else {
            System.out.println("Ambele dreptunghiuri au aceleasi suprafete");
        }
        // Inchidere scanner
        scanner.close();
    }
}
