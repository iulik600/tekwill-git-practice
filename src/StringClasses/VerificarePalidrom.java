package StringClasses;

import java.util.Scanner;

public class VerificarePalidrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu un cuvant: ");
        String cuvant = scanner.nextLine();

        //Cream un StringBuilder cu cuvantul si il inversam
        StringBuilder sb = new StringBuilder(cuvant);
        String cuvantInversat = sb.reverse().toString(); // transformam inapoi in String

        // Comparam ignorand majusculele
        boolean estePalidrom = cuvant.equalsIgnoreCase(cuvantInversat);

        System.out.println("Cuvantul este palidrom: " + estePalidrom);
        scanner.close();
    }
}
