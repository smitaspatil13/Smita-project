package Practice;

public class ReverseString
{
    static void main(String[] args)
    {
       String Original = "Automation";
       String Reversed = "";
       for(int i= Original.length()-1; i>=0; i--)
       {
           Reversed = Reversed + Original.charAt(i);
       }
        System.out.println("using for loop " + Reversed);

       // StringBuilder sb = new StringBuilder(Original);
       // System.out.println("Using StringBuilder : + sb.reverse");
    }
    }

