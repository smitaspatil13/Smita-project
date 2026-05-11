package JavaAssignments;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1221;
        int originalNumber = n; // Store original value for final comparison
        int reversedNumber = 0;

        // Using a for loop to reverse the digits
        // We initialize 'temp' with 'n', continue as long as 'temp' > 0,
        // and reduce 'temp' by dividing by 10 in each iteration.
        for (int temp = n; temp > 0; temp /= 10) {
            int digit = temp % 10;                // Extract the last digit
            reversedNumber = (reversedNumber * 10) + digit; // Append digit to reversed number
        }

        // Output the results
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);

        // Check if original equals reversed
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a Palindrome.");
        } else {
            System.out.println(originalNumber + " is not a Palindrome.");
        }
    }
}
