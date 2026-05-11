package JavaAssignments;

public class NumberPattern {

        public static void main(String[] args) {
            int n = 5; // Total number of rows

            // Outer loop for the number of rows
            for (int i = 1; i <= n; i++) {

                // Inner loop for numbers in each row
                for (int j = 1; j <= i; j++) {
                    // Print the number followed by a space
                    System.out.print(j + " ");
                }

                // Move to the next line after finishing a row
                System.out.println();
            }
        }
}
