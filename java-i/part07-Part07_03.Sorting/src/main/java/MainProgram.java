
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            MainProgram.swap(array, i, MainProgram.indexOfSmallestFrom(array, i));
        }
    }

    public static int smallest(int[] array) {
        int smallest = 1000000;
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        return MainProgram.indexOfSmallestFrom(array, 0);
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = 0;
        int smallestFrom = 1000000;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallestFrom) {
                index = i;
                smallestFrom = array[i];
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int storer = array[index1];
        array[index1] = array[index2];
        array[index2] = storer;
    }

}
