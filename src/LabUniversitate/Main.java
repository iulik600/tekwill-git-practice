package LabUniversitate;

import java.util.*;

class Graf {
    private int nrNoduri; // Numărul total de noduri
    private List<List<Integer>> listaAdiacenta; // Lista de adiacenta pentru graf

    // Constructor care primeste numarul de noduri
    public Graf(int nrNoduri) {
        this.nrNoduri = nrNoduri;
        listaAdiacenta = new ArrayList<>();

        // Inițializam lista de adiacența cu liste goale pentru fiecare nod
        for (int i = 0; i < nrNoduri; i++) {
            listaAdiacenta.add(new ArrayList<>());
        }
    }

    // Metoda pentru adaugarea unei muchii intre doua noduri
    public void adaugaMuchie(int nod1, int nod2) {
        listaAdiacenta.get(nod1).add(nod2);
        listaAdiacenta.get(nod2).add(nod1); // fiind graf neorientat
    }

    // Metoda BFS care pornește de la un nod dat
    public void bfs(int start) {
        boolean[] vizitat = new boolean[nrNoduri]; // vector care reține nodurile vizitate
        Queue<Integer> coada = new LinkedList<>(); // coada pentru parcurgere

        vizitat[start] = true; // marchez nodul de start ca vizitat
        coada.add(start);      // il adaug în coada

        System.out.print("Parcurgere BFS: ");

        // Cat timp coada nu este goala
        while (!coada.isEmpty()) {
            int nodCurent = coada.poll(); // extrag primul nod din coadă
            System.out.print(nodCurent + " ");

            // Parcurg toți vecinii nodului curent
            for (int vecin : listaAdiacenta.get(nodCurent)) {
                if (!vizitat[vecin]) {
                    vizitat[vecin] = true; // marchez vecinul ca vizitat
                    coada.add(vecin);      // îl adaug în coadă
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citim numarul de noduri și de muchii
        System.out.print("Introduceți numărul de noduri: ");
        int n = scanner.nextInt();

        System.out.print("Introduceți numărul de muchii: ");
        int m = scanner.nextInt();

        Graf graf = new Graf(n); // cream graful

        System.out.println("Introduceți muchiile (nod1 nod2):");
        for (int i = 0; i < m; i++) {
            int nod1 = scanner.nextInt();
            int nod2 = scanner.nextInt();
            graf.adaugaMuchie(nod1, nod2); // adaugam muchia in graf
        }

        // Citim nodul de start
        System.out.print("Introduceți nodul de start pentru BFS: ");
        int start = scanner.nextInt();

        // Apelam parcurgerea BFS
        graf.bfs(start);
    }
}

