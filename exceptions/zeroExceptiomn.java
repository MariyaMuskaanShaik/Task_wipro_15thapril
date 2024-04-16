package exceptions;

public class zeroExceptiomn {
        public static void main(String[] args) {
            try {
                // Attempt to divide by zero
                int result = divideByZero();
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Catch the ArithmeticException and provide a custom message
                System.out.println("Error: Attempted to divide by zero!");
            }
        }
    
        // Method that attempts to divide by zero
        public static int divideByZero() {
            int numerator = 10;
            int denominator = 0;
            return numerator / denominator;
        }
    }
    
