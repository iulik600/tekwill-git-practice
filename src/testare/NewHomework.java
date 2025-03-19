package testare;

import java.util.Scanner;

public class NewHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar pozitiv: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("Numarul tau pozitiv este: " + number);
        } else {
            System.out.println("Acest numar este negativ, eroare! ");
        }

                scanner.close();
    }
}
