package Homeworks;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citirea unui array unidimensional
        System.out.println("Introduceti un array unidimensional: ");
        int numbers = scanner.nextInt();
        int[]arrayUni = new int[numbers];

        System.out.println("Introduceti elementele array-ului 1D: ");
        for( int i = 0; i < numbers; i++) {
            arrayUni[i] = scanner.nextInt();
        }

        // Rezultatele arrayului 1d
        System.out.println("Rezultate array 1d: ");

        scanner.close();
    }
}
