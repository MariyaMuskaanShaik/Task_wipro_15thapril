package arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements from the user
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the target element from the user
        System.out.print("Enter the target element to search: ");
        int target = scanner.nextInt();

        // Call PerformLinearSearch function to search for the target element
        int index = PerformLinearSearch(array, target);

        // Output the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }

    // Function to perform linear search
    public static int PerformLinearSearch(int[] array, int target) {
        // Iterate through the array elements
        for (int i = 0; i < array.length; i++) {
            // If the current element matches the target, return its index
            if (array[i] == target) {
                return i;
            }
        }
        // If the target is not found, return -1
        return -1;
    }
}
