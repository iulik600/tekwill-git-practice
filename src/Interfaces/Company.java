package Interfaces;

public class Company {
    public static void main(String[] args) {
        //Crearea unui array de angajati, fiecare fiind de un tip diferit
        Employee[] employees = new Employee[3];

        employees[0] = new FullTimeEmployee("Maria", 4000);
        employees[1] = new PartTimeEmployee("Ion", 20, 80); // 20 euro ora/ 80 ore
        employees[2] = new Freelance("Mihai", 500, 5);

        for (Employee employee : employees) {
            System.out.println(employee.getName() +  " castiga " + employee.calculateSalary() + " Dolari.");
        }
    }
}
