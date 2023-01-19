package Exercise98;

// Traverse array to see when will exception happens
public class Ex3
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4};
        int index = 0;

        try
        {
            for (int i = 0; i < a.length+1; i++)
            {
                System.out.println("a[" + i + "] = " + a[i]);
                index++;
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("a[" + index + "] " + e.toString());
        }
    }
}
