package testare;

import java.util.Scanner;

public class SarcinaFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu temperatura curenta: ");
        double temperature = scanner.nextDouble();


        if(temperature <= 10) {
            System.out.println("Poarta o jacheta!");
        } else if (temperature >= 10 && temperature <= 25) {
            System.out.println("Este o zi frumoasa!");
        } else {
            System.out.println("E foarte cald, Hidrateaza-te");

        }
        scanner.close();
    }
}
