package se.lexicon.teri.lesson2;

import java.util.Arrays;

public class Exercise13 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = new int[array1.length];
        int frontIndex = 0;
        int backIndex = array1.length - 1;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array2[frontIndex] = array1[i];
                frontIndex++;
            }
            else {
                array2[backIndex] = array1[i];
                backIndex--;
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}