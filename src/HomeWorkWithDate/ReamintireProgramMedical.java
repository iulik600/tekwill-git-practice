package HomeWorkWithDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ReamintireProgramMedical {
    public static void main(String[] args) {
        LocalDateTime dataProgramare = LocalDateTime.of(2025, 5, 10, 14, 30);

        // Setam data si ora curenta
        LocalDateTime acum = LocalDateTime.now();

        // Verificam daca programarea este in trecut sau in viitor
        if(acum.isBefore(dataProgramare)) {
            System.out.println("Programarea este in Viitor. ");

            // Calculam cate zile mai sunt pana atunci
            LocalDate azi = LocalDate.now();
            LocalDate doarDataProgramare = dataProgramare.toLocalDate();
            Period diferenta = Period.between(azi, doarDataProgramare);

            System.out.println("Mai sunt " + diferenta.getDays() + " zile pana la programare.");

            // Formatam data programarii
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm");
            String formatat = dataProgramare.format(formatter);
            System.out.println("Data programarii: " + formatat);
        } else {
            System.out.println("Programarea este in trecut.");
        }
    }
}
