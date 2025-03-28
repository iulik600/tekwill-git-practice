package AplicareaInPractica;

 class Student {
    private String nume;
    private int varsta;
    private double notaFinala;

    public Student (String nume, int varsta, double notaFinala) {
        this.nume = nume;
        this.varsta = varsta;
        this.notaFinala = notaFinala;

    }

     public void afiseazaInformatii() {
        System.out.println("Nume Student: " + nume + ", Varsta: " + varsta + ", Nota finala: " + notaFinala);


    }

 }
 public class Main {
     public static void main(String[] args) {
         Student student = new Student("Iulian", 19, 7.50);
         Student student2 = new Student("Tekwill", 20, 10);

         student.afiseazaInformatii();
         student2.afiseazaInformatii();
     }
 }

