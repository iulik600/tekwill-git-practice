import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); // Am creat un obiect scanner
        System.out.println("Adauga un numar:");
        int numar = scanner.nextInt(); // Citim un numar de la tastatura

        // Verificarea daca numarul este par sau impar
        if (numar % 2 == 0) {
            System.out.println(numar + " este par");
        } else {
            System.out.println(numar + " este impar");
        }
        scanner.close();
    }
}


