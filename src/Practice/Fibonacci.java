package Practice;

public class Fibonacci
{
    static void main() {
        int n = 7;
        int a = 0, b = 1;
        System.out.println("Fibonacci Series :" + a + " ," + b);

        for (int i = 0; i < n; i++)
        {
            int next = a + b;
            System.out.println(", " + next);
            a = b;
            b = next;
        }
    }


}
