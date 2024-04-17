package arrays;

import java.util.Arrays;

public class bruteForceSort {
    public static void main(String[] args) {
        // Create an array using InitializeArray
        int[] array = InitializeArray(10);

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Sort the array using BruteForceSort
        BruteForceSort(array);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    // Function to initialize an array with random integers
    public static int[] InitializeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100); // Generates random integers between 0 and 99
        }
        return array;
    }

    // Brute force sorting function
    public static void BruteForceSort(int[] array) {
        int n = array.length;
        // Iterate over each element in the array
        for (int i = 0; i < n - 1; i++) {
            // Compare each element with all subsequent elements
            for (int j = i + 1; j < n; j++) {
                // Swap if the current element is greater than the next element
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
