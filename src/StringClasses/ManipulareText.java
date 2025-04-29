package StringClasses;

import java.util.Scanner;

public class ManipulareText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citim propozitia de la utilizator
        System.out.println("Introdu o propozitie: ");
        String propozitie = scanner.nextLine();

        //Afisam propozitia in majuscule
        String propozitieUpper = propozitie.toUpperCase();
        System.out.println("Propozitia in majuscule: ");
        System.out.println(propozitieUpper);

        //Inlocuim java cu python
        String inlocuire = propozitie.replace("Java", "Python");
        System.out.println("Dupa inlocuirea cuvantului 'Java' cu 'Python': ");
        System.out.println(inlocuire);

        //Verificam daca propozitia incepe cu "Salut"
        boolean incepeCuSalut = propozitie.startsWith("Salut");
        System.out.println("Incepe cuc 'Salut' ? "  + (incepeCuSalut ? "Da" : "Nu"));

        //Verificam daca propozitia se termina cu "!"
        boolean seTerminaCuSemnExclamare = propozitie.endsWith("!");
        System.out.println("Se termina cu '!' ? " + (seTerminaCuSemnExclamare ? "Da" : "Nu"));
        scanner.close();
    }
}
