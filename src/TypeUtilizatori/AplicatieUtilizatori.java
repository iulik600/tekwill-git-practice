package TypeUtilizatori;

import java.util.Scanner;

public class AplicatieUtilizatori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu numele Utilizatorului: ");
        String nume = scanner.nextLine();

        System.out.println("Introdu rolul (ADMIN, MODERATOR, USER): ");
        String rol = scanner.nextLine();

        // Convertim stringul in enum
        UserRole role = UserRole.valueOf(rol);

        //Cream obiectul user
        User user = new User(nume, role);

        // if pentru verificare daca utilizatorul are acces la panoul de administrare
        if(role.hasAccessToAdminPanel()) {
            System.out.println("Acces PERMIS la panoul de administrare.");
        } else {
            System.out.println("Acces restrictionat la panoul de administrare.");
        }
    }
}