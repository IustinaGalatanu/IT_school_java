package org.example.Homework.session18;
//Create a generic method to swap the positions of two elements in an array.
public class Swap {
    public static <T> void swap(T[] array, int i, int j) {
        T nr = array[i];
        array[i] = array[j];
        array[j] = nr;
    }
}
 class Swaps {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        Swap.swap(numbers, 1, 3);

        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}

