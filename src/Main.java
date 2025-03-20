<<<<<<< HEAD
 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); // Am creat un obiect scanner
        System.out.println("Adauga un numar:");
        int numar = scanner.nextInt(); // Citim un numar de la tastatura

        // Verificarea daca numarul este par sau impar
        if (numar % 2 == 0) {
            System.out.println(numar + " este par");
        } else {
            System.out.println(numar + " este impar");
        }
        scanner.close();
    }
}


>>>>>>> 7acaf9bffc394c2a97eecd31cd480174e126c438
