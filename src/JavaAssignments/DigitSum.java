package JavaAssignments;

public class DigitSum {
    public static void main(String[] args) {
        int n = 4567;
        int originalNumber = n;
        int sum = 0;

        // Process until the number is reduced to 0
        while (n > 0) {
            int lastDigit = n % 10; // Extract the last digit
            sum = sum + lastDigit;  // Add it to our running total
            n = n / 10;             // Remove the last digit from n
        }

        System.out.println("The sum of digits in " + originalNumber + " is: " + sum);
    }
}
