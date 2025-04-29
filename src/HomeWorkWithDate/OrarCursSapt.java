package HomeWorkWithDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class OrarCursSapt {
    public static void main(String[] args) {
        // Data primei lectii
        LocalDate dataInceput = LocalDate.of(2025, 4, 24);

        // Ora la care are loc cursul
        LocalTime oraCurs = LocalTime.of(17, 00);

        // Formatul de afisare
        DateTimeFormatter formatare = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy, HH:mm");

        System.out.println("Urmatoarele 5 lectii");

        // Generam urmatoarele 5 lectii prin for
        for (int i = 0; i < 5; i++) {
            // Adaugam cate o saptamana la data initiala
            LocalDate dataLectie = dataInceput.plusWeeks(i);

            // Combinam data cu ora pentru a crea un Date + Time
            LocalDateTime dataOraLectie = LocalDateTime.of(dataLectie, oraCurs);

            // Afisam data lectiei in format
            System.out.println(dataOraLectie.format(formatare));
        }
    }
}
