package Exersare;

import java.util.Scanner;

public class NoteStudentiComparare {
    public static void main(String[] args) {

        Integer nota1 = 5;
        Integer nota2 = 5;

        // Comparam notele folosind Integer.compare
        int rezultat = Integer.compare(nota1, nota2);

        if (rezultat > 0) {
            System.out.println("Studentul 1 are nota mai mare: " + nota1);
        } else if (rezultat < 0) {
            System.out.println("Studentul 2 are nota mai mare: " + nota2);
        } else {
            System.out.println("Amandoi studenti au aceiasi nota: " + nota1);
        }
    }
}

