package JavaAssignments;

public class OddNumberCounter {
    public static void main(String[] args) {
        int count = 0; // Initialize the counter

        // Loop through numbers 1 to 50
        for (int i = 1; i <= 50; i++) {
            // Check if the number is odd using the modulus operator
            if (i % 2 != 0) {
                System.out.println(i);
                count++; // Increment counter for each odd number found
            }
        }

        // Print the final count outside the loop
        System.out.println("Total count of odd numbers: " + count);
    }
}
