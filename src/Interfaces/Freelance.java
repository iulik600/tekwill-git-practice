package Interfaces;

public class Freelance implements Employee {
    private String name;
    private double paymentPerProject;
    private int projectsCompleted;

    public Freelance(String name, double paymentPerProject, int projectsCompleted) {
        this.name = name;
        this.paymentPerProject = paymentPerProject;
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public double calculateSalary() {
        return paymentPerProject * projectsCompleted; // calcuarea salariului per proiect (Salariu = plata * proiecte)
    }
}
