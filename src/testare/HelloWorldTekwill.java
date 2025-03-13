package testare;

import java.util.Scanner;

public class HelloWorldTekwill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti codul valutar(EUR, GBP, INR, AUD: ");
        String moneda = scanner.next();

        System.out.println("Introduceti valoarea in USD: ");
        double sumaUSD = scanner.nextDouble();

        double sumaConvertita = 0;
        boolean monedaValida = true;

        switch (moneda) {
            case "EUR":
                sumaConvertita = sumaUSD * 0.85;
                break;
            case "GBP":
                sumaConvertita = sumaUSD * 0.75;
                break;
            case "INR":
                sumaConvertita = sumaUSD * 75.0;
                break;
            case "AUD":
                sumaConvertita = sumaUSD * 1.35;
                break;
            default:
                System.out.println("Valuta nu este acceptata");
        }

        if(monedaValida) {
            System.out.println("Suma convertita: " +  sumaConvertita + moneda);
        }

        scanner.close();

    }
}
