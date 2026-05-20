package Practice;

public class Reversestring1
{
    public static void main(String[] args)
    {
        String Original = "Automation";
        StringBuilder sb = new StringBuilder(Original);
        System.out.println("Using StringBuilder :" + sb.reverse());
    }
}
