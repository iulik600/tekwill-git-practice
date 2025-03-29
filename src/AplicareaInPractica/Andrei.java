package AplicareaInPractica;

import java.util.Scanner;

public class Andrei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creare contului bancar cu date de la utilizator
        System.out.println("Introdu numele titularului: ");
        String numeTitular = scanner.nextLine();

        System.out.println("Introdu soldul initial: ");
        double soldInitial = scanner.nextDouble();

        ContBancar cont = new ContBancar(numeTitular, soldInitial);

        // Meniul interactiv
        int optiune;
        do {
            System.out.println("==  Meniu cont bancar == ");
            System.out.println("1. Depune Bani");
            System.out.println("2. Retragere bani");
            System.out.println("3. Verificare sold");
            System.out.println("4. Iesire");
            System.out.println("Alege o optiune: ");

            optiune = scanner.nextInt();

            // Un switch in do{} pentru a da logica meniuluui
            switch (optiune) {
                case 1:
                    System.out.println("Introdu suma de depunere: ");
                    double sumaDepunere = scanner.nextDouble();
                    cont.depunere(sumaDepunere);
                    break;

                case 2:
                    System.out.println("Introdu suma de retragere a banilor: ");
                    double sumaRetragere = scanner.nextDouble();
                    break;

                case 3:
                    cont.afiseazaSold();
                    break;

                case 4:
                    System.out.println("Iesire din meniu. O zi buna !");
                    break;

                default:
                    System.out.println("Optiune invalida, alege un numar din meniu !");
            }
        } while (optiune != 4);

        scanner.close();
    }
}
