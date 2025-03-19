package testare;

import java.util.Scanner;

public class LessonsTekwill {
    public static void main(String[] args) {
        System.out.println("introdu varsta: ");
       Scanner scanner = new Scanner(System.in);
       int varsta = scanner.nextInt();
       String personYear = (varsta <= 18)? "Minor":
               (varsta >= 18 && varsta < 29)? "Tanar":
                       (varsta >= 30 && varsta <= 64)? "Adult":
                               (varsta <= 65)? "Senior" : " ";
        System.out.println("Varsta personala: " + personYear);
        scanner.close();
        }

    }
