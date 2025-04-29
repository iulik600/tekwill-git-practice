package StringClasses;



public class ComparareStringSiStringBuiilder {
    public static void main(String[] args) {

        // Construim textul cu String simplu(concat + )
        long startString = System.currentTimeMillis();
        constructWithString();
        long endString = System.currentTimeMillis();
        System.out.println("Timp executie cu String " + (endString - startString) + " ms");

        // Construim textul cu StringBuilder.append()
        long startBuilder = System.currentTimeMillis();
        constructWithStringBuilder();
        long endBuilder = System.currentTimeMillis();
        System.out.println("Timp executie cu StringBuilder: " + (endBuilder - startBuilder) + " ms");

    }

    private static void constructWithStringBuilder() {
        String text = "";
        for(int i = 1; i <= 10000; i++) {
            text += i + " "; // foloseste acelasi obiect, mai eficient
        }
    }

    private static void constructWithString() {
        String text = "";
        for(int i = 1; i <= 10000; i++) {
            text += i + " "; // la fiecare pas se creeaza un nou obiect String
        }
    }
}
