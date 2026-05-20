package JavaAssignments2;

public class AtmPinSimulation {
    public static void main(String[] args) {
        // Correct system PIN
        int correctPin = 4521;

        // Loop controls
        int attempt = 1;
        int maxAttempts = 3;
        boolean accessGranted = false;

        // While loop controlled by the attempt counter
        while (attempt <= maxAttempts) {
            int enteredPin = 0;

            // Simulating user input values per requirement for each attempt
            if (attempt == 1) {
                enteredPin = 1234;
            } else if (attempt == 2) {
                enteredPin = 0000;
            } else if (attempt == 3) {
                enteredPin = 4521;
            }

            // Check if the simulated PIN matches the correct PIN
            if (enteredPin == correctPin) {
                System.out.println("Access Granted. Welcome!");
                accessGranted = true;
                break; // Exit the loop immediately
            } else {
                int remaining = maxAttempts - attempt;
                System.out.println("Incorrect PIN. " + remaining + " attempt(s) remaining.");
            }

            attempt++; // Move to the next attempt
        }

        // If all 3 attempts fail and access wasn't granted
        if (!accessGranted) {
            System.out.println("Card Blocked. Contact your bank.");
        }
    }
}