package ErrorCodesExamples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un cod de eroare: ");
        int inputCode = scanner.nextInt();

        ErrorCode error = ErrorCode.fromCode(inputCode);

        if(error != null) {
            //Afisam un mesaj general
            System.out.println(error.getMessagecode());

            // Folosim switch pentru a trata fiecare caz
            switch(error) {
                case INVALID_INPUT:
                    System.out.println("Va rugam sa verificati datele introduse.");
                    break;
                case NOT_FOUND:
                    System.out.println("Asigurati-va ca resursa exista.");
                    break;
                case SERVER_ERROR:
                    System.out.println(" Incercati mai tarziu. Serverul are probleme.");
                    break;
                default:
                    System.out.println("Eroare necunoscuta.");
            }

            if(error == ErrorCode.SERVER_ERROR) {
                System.out.println("Aceasta este o eroare grava. Contactati suportul tehnic.");
            }
        } else {
            System.out.println("Codul introdus nu corespunde unei erori.");
        }
scanner.close();

    }
}
