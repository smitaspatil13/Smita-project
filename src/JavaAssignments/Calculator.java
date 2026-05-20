package JavaAssignments;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;
        char operator = '/';

        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;

            case '/':
                // Nested if to handle division by zero
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}
