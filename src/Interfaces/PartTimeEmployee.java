package Interfaces;

public class PartTimeEmployee implements Employee {
    private String name;
    private double hourRate;
    private int hourWork;


    public PartTimeEmployee(String name, double hourRate, int hourWork) {
        this.name = name;
        this.hourRate = hourRate;
        this.hourWork = hourWork;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateSalary() {
        return hourRate * hourWork; // Salariu = ore * tariful pe ora
    }
}
