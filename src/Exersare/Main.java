package Exersare;

import java.util.Scanner;

class Car {
    String model;
    int hp;
    int kilometraj;

    Car(String model, int hp, int kilometraj) {
        this.model = model;
        this.hp = hp;
        this.kilometraj = kilometraj;

    }
    void displayInfo() {
        System.out.println("Model: " + model +   ", HorsePower: " + hp + ", KM parcursi: " + kilometraj);
    }
}
public class Main {
    public static void main(String[] args) {
        Car YourCar = new Car("bmw", 500, 150);
        YourCar.displayInfo();
        }
    }
