package TypeUtilizatori;


public class User {
    private String name;
    private UserRole role;

    public User(String name, UserRole role) {
        this.name = name;
        this.role = role;
    }

    //Metoda pentru a afisa detalii despre utilizator
    public void displayInfo () {
        System.out.println("Nume: " + name);
        System.out.println("Rol: " + role);
        System.out.println("Descriere: " + role.getDescription());
        System.out.println("Nivel permisiune: " + role.getPermissionLevel());

        // switch pentru a oferi un mesaj personalizat in functie de rol
        switch (role) {
            case ADMIN:
                System.out.println("Ai toate permisiunile.");
            break;
            case MODERATOR:
                System.out.println("Poti modera continutul.");
                break;
            case USER:
                System.out.println("Ai acces limitat.");
                break;
        }

        // if pentru a verifica acces la panoul de admin
        if(role.hasAccessToAdminPanel()) {
            System.out.println("Ai acces la panoul de administrare !");
        } else {
            System.out.println("Nu ai acces la panoul de administrare.");
        }
    }

}
