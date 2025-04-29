package HomeWorkWithDate;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class VerificareAbonament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citim data activarii
        System.out.println("Introdu data activarii abonamentului (format: YYYY-MM-DD): ");
        String dataActivare = scanner.nextLine();

        // Convertim textul in LocalDate
        LocalDate dataActivareConvert = LocalDate.parse(dataActivare);

        // Calculam data expirarii
        LocalDate dataExpirare = dataActivareConvert.plusMonths(3);

        System.out.println("Data expirarii abonamentului: " + dataExpirare);

        // Verificam daca abonamentul este inca activ
        LocalDate dataDeAzi = LocalDate.now();
        if(dataDeAzi.isBefore(dataExpirare)) {
            System.out.println("Abonamentul este Activ.");
        } else {
            System.out.println("Abonamentul a Expirat, reinoieste in curand !");
        }

        // Calculam perioada ramasa
        if(dataDeAzi.isBefore(dataExpirare)) {
            Period perioadaRamasa = Period.between(dataDeAzi, dataExpirare);
            System.out.println("Mai sunt " + perioadaRamasa.getMonths() + " luni si " +
                    perioadaRamasa.getDays() + " zile pana la expirare.");
        }
    }
}
