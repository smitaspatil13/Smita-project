package JavaAssignments;

public class LargeNumber {
    public static void main(String[] args) {
        int a = 54, b = 89, c = 73;

        if (a >= b) {
            // If we are here, a is greater than or equal to b
            if (a >= c) {
                // If a is also greater than c, a is the largest
                System.out.println("The largest number is: " + a);
            } else {
                // If a was >= b but a < c, then c is the largest
                System.out.println("The largest number is: " + c);
            }
        } else {
            // If we are here, b is greater than a
            if (b >= c) {
                // If b is also greater than c, b is the largest
                System.out.println("The largest number is: " + b);
            } else {
                // If b was > a but b < c, then c is the largest
                System.out.println("The largest number is: " + c);
            }
        }
    }
}
