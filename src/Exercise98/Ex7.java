package Exercise98;

// Exception control
// Better handle exceptions inside the method so when others invoke the method they do not need to handle the potential exceptions
// More aggregation
public class Ex7
{
    // Reach 2 break
    public static void breakable()
    {
        try
        {
            for (int i = 0; i <= 9; i++)
            {
                if (i == 2)
                {
                    throw new Exception("Break, Error = 2");
                }
                else
                {
                    System.out.println(i);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    // Reach 2 continue
    public static void unbreakable()
    {
        for(int i = 0; i <= 9; i++)
        {
            try
            {
                if (i == 2)
                {
                    throw new Exception("Error = 2");
                }
                else
                {
                    System.out.println(i);
                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }


    public static void main(String[] args)
    {
        // Reach 2 break
        System.out.println("0-9, reach 2 break:");
        breakable();

        System.out.println("================");

        // Reach 2 throw exception continue
        System.out.println("0-9, reach 2 throw exception continue:");
        unbreakable();
    }
}
