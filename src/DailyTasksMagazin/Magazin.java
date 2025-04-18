package DailyTasksMagazin;

import java.util.Scanner;

public class Magazin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citim ziua de la tastura
        System.out.println("Introdu o zi din saptmana(scrie cu majuscula): ");
        String dayofweek = scanner.nextLine();

        DayOfWeek day;

        // Afisam mesaje diferite pentru weekend sau zi lucratoare.
        day = DayOfWeek.valueOf(dayofweek);
        switch(day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("Este WeekEnd! Program scurt sau inchis.");
                break;
            default:
                System.out.println("Este zi lucratoare.");
        }

        // if pentru program
        if(!day.isWeekend()) {
            System.out.println("Program 9:00 - 17:00");
        } else {
            System.out.println("Program: 10:00 - 14:00");
        }
scanner.close();
    }
}
