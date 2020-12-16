package se.lexicon.teri.lesson2;

public class Exercise10 {

    public static void main(String[] args) {
        // Exercise 10: multiplication table
        int[] base = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[][] table = {
                base,
                base
        };
        int k = 0;

        for (int i = 0; i < base.length; i++) {
            System.out.println();
            int factor1 = table[k][i];  // Set first factor

            for (int j = 0; j < base.length; j++) {
                int factor2 = table[k][j]; // set second factor
                System.out.print("\t" + (factor1 * factor2));
            }
        }
    }
}