package Exersare;

public class Arrays {
    public static void main(String[] args) {
        //Declararea unui array
        String strArray[];

       strArray = new String[4]; // Oferirea valorilor unui array, [0, 1, 2, 3]
       for(int i=0; i< strArray.length; i++) { // Rularea acestui array printr-un for
           strArray[i] = new String("Hello" + i);
           System.out.println(strArray[i]);
       }
    }
}
