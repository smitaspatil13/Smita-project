package JavaAssignments2;

public class FizzBuzzCounter
{
    public static void main(String[] args) {
        // Variable to keep track of FizzBuzz count
        int fizzBuzzCount = 0;

        // Loop from 1 to 50
        for (int i = 1; i <= 50; i++) {

            // Rule 1: Check if divisible by both 3 and 5 (or divisible by 15)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                fizzBuzzCount++; // Increment the counter
            }
            // Rule 2: Check if divisible by 3 only
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Rule 3: Check if divisible by 5 only
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Rule 4: Otherwise, print the number itself
            else {
                System.out.println(i);
            }
        }

        // Print the total count at the end
        System.out.println("\nTotal count of times \"FizzBuzz\" was printed: " + fizzBuzzCount);
    }
}
