package Exercise98;
import java.util.Scanner;

// Age validation
public class Ex6
{
    public static void main(String[] args)
    {
        //int age;
        boolean judge = true;
        Scanner scan = new Scanner(System.in);

        while (judge)
        {
            try
            {
                System.out.println("Enter your age(int): ");
                int age = Integer.parseInt(scan.next());
                System.out.println("Your age is: " + age);
                judge = false;
            }
            catch (NumberFormatException e)
            {
                System.err.println("Age should be an integer");
                //judge = true;
            }
            finally
            {
                scan.reset();
            }
        }
    }
}
