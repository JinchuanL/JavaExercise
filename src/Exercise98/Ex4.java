package Exercise98;

// int overflow exception
class Number
{
    int count(int a, int b)
    {
        return a*b;
    }
}

public class Ex4
{
    public static void main(String[] args)
    {
        int a = 12315;
        int b = 57876876;

        Number n = new Number();

        try
        {
            System.out.println(n.count(a, b));
            Math.multiplyExact(a,b);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.toString());
        }
    }
}
