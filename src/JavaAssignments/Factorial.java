package JavaAssignments;

public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        // Using long to prevent overflow for larger factorials
        long result = 1;

        // Loop from 1 up to n
        for (int i = 1; i <= n; i++) {
            // Multiply the running total by the current counter
            result *= i;
        }

        // Print the final result
        System.out.println("The factorial of " + n + " is: " + result);

    }

}
