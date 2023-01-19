package Exercise98;

// Exception control
public class Ex7
{
    // Reach 2 break
    public static void breakable() throws Exception
    {
        for(int i = 0; i <= 9; i++)
        {
            if(i == 2)
            {
                throw new Exception("Break, Error = 2");
            }
            else
            {
                System.out.println(i);
            }
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
        try
        {
            System.out.println("0-9, reach 2 break:");
            breakable();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("================");

        // Reach 2 throw exception continue
        System.out.println("0-9, reach 2 throw exception continue:");
        unbreakable();



    }
}
