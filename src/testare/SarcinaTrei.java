package testare;

import java.util.Scanner;

public class SarcinaTrei {
   public static void main(String[] args) {
       Scanner point = new Scanner(System.in);
       System.out.println("Introduceti un numar real: ");
       double number = point.nextDouble();

       // Verificarea si afisarea rezultatului
       if (number == 0) {
           System.out.println("zero");
       } else if (number > 0) {
           System.out.println("Pozitiv");
       } else if (number < 0) {
           System.out.println("Negativ");
       }

       if (Math.abs(number) < 1) {
           System.out.println("mic");
       } else if (Math.abs(number) > 1000000) {
           System.out.println("mai mare");
       } else {
           System.out.println();
       }

point.close();
   }

}
