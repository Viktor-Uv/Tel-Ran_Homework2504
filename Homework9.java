import java.util.Arrays;
import java.util.Random;

public class Homework9 {
    public static void main(String[] args) {
        // Create array
        int[] array = new int[30];

        // Fill with random numbers
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100,101); // [-100;100]
        }

        // Print generated array
        System.out.println("Original:     " + Arrays.toString(array));

        // Increase each element by 10 using three different methods
        increaseForLoop(array);
        increaseWhileLoop(array);
        increaseDoWhileLoop(array);
    }

    private static void increaseForLoop(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }
        System.out.println("For Loop:     " + Arrays.toString(array));
    }
    private static void increaseWhileLoop(int[] array) {
        int i = 0;
        while (i < array.length) {
            array[i] += 10;
            i++;
        }
        System.out.println("While Loop:   " + Arrays.toString(array));
    }
    private static void increaseDoWhileLoop(int[] array) {
        int i = 0;
        do {
            array[i] += 10;
            i++;
        } while (i < array.length);
        System.out.println("DoWhile Loop: " + Arrays.toString(array));
    }
}
