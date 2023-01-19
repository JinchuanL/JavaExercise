package Exercise98;
import java.util.Scanner;

class MyException extends Exception
{
    public MyException(String ErrorMessage)
    {
        super(ErrorMessage);
    }
}

class Computer
{
    public static int GCD(int a, int b) throws MyException
    {
        if(a < 0 || b < 0)
        {
            throw new MyException("Number can't be negative");
        }

        if(b == 0)
        {
            return a;
        }

        return a%b == 0 ? b : GCD(b, a%b);
    }
}

public class Ex8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;

        try
        {
            System.out.print("Enter the first number: ");
            a = Integer.parseInt(scan.next());
            System.out.print("Enter the second number: ");
            b = Integer.parseInt(scan.next());

            Computer com = new Computer();
            System.out.println("The greatest common divider is: " + com.GCD(a, b));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        scan.close();
    }
}
