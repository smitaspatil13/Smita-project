package Practice;
import java.util.Scanner;

public interface client
{
    void input();
    void output();
}

class Raju implements client
{
    String name; double sal;
    public void input()
    {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter username :");
        name = r.nextLine();
        System.out.println("Enter Salary:");
        sal = r.nextDouble();

    }
    public void output()
    {
        System.out.println(name+"  "+sal);

    }

    static void main(String [] args)
    {
        client c = new Raju();
        c.input();
        c.output();

    }
}
