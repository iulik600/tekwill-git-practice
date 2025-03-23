package Homeworks;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {12, 5, 78, 2, 34};

        Arrays.sort(array);
        System.out.println("Minimum value: " + array[0]);
        System.out.println("Maximum value: " + array[array.length - 1]);
    }
}
