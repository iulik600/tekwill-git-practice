package TypeUtilizatori;

public enum UserRole {
    ADMIN(3, "Administrator complet"),
    MODERATOR(2, "Poate modera continutul"),
    USER(1, "Utilizator obisnuit");

    private int permissionLevel;
    private String description;

    UserRole(int permissionLevel, String description) {
        this.permissionLevel = permissionLevel;
        this.description = description;
    }

    // getteri


    public int getPermissionLevel() {
        return permissionLevel;
    }

    public String getDescription() {
        return description;
    }

    public boolean hasAccessToAdminPanel() {
        return this ==  ADMIN || this == MODERATOR;
    }
}
