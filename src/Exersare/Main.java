package Exersare;

class Car {
    //Intiallizarea de variable, tip private
    private String brand;
    private int year;
//Formularea unui constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    //Aplicarea unei meetode
    public void displayInfo() {
        System.out.println("Marca:" + brand);
        System.out.println("Year: " + year);
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("TOYOTA", 2005);
        Car car1 = new Car("Lada", 2001);

        car.displayInfo();
        car1.displayInfo();
    }
}



