public class swap {
    public static void main(String[] args) {
        // Declare two integer variables
        int a = 5;
        int b = 10;

        // Print the original values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the values without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Print the swapped values
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}