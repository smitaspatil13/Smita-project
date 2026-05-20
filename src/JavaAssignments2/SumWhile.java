package JavaAssignments2;

public class SumWhile
{
    static void main()
    {
        // Declare and initialize the variables
        int i=1;
        int sum =0;
        // Use a while loop to iterate from 1 to 20
        while (i <= 20)
        {
           // i= sum + i;
            sum = sum + i; // Add the current value of i to sum
            i++; // Increment i at the end of each iteration

        }
        System.out.println("sum of all numbers " +i); // Print the final sum after the loop finishes
    }
}
