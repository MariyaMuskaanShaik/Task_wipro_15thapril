import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first operand
        System.out.print("Enter the first operand: ");
        double operand1 = scanner.nextDouble();

        // Prompt the user to enter the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Prompt the user to enter the second operand
        System.out.print("Enter the second operand: ");
        double operand2 = scanner.nextDouble();

        double result;

        // Perform the operation based on the operator
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }

        // Print the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
