package JavaAssignments;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 7; // The number for which we need the table

        // Loop from 1 to 12
        for (int i = 1; i <= 12; i++) {
            // Calculate the product
            int result = n * i;

            // Print the output in the specified format
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
