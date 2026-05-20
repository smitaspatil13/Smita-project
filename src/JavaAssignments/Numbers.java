package JavaAssignments;

public class Numbers {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0; // Initialize sum variable

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i; // Add current number to the sum
        }

        // Print the total sum
        System.out.println("The sum of natural numbers from 1 to " + n + " is: " + sum);

        // Check if the sum is even or odd using modulus operator
        if (sum % 2 == 0) {
            System.out.println("The result is Even.");
        } else {
            System.out.println("The result is Odd.");
        }
    }
}
