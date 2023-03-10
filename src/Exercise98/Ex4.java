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

// Reference
// https://www.baeldung.com/java-overflow-underflow#:~:text=Java%20does%20not%20throw%20an,to%20handle%20a%20possible%20overflow.