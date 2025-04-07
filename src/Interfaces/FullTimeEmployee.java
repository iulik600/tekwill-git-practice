package Interfaces;

public class FullTimeEmployee implements Employee {
    private String name;
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
