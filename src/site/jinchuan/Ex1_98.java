package site.jinchuan;

// IndexOutOfBounds Exception Exercise
public class Ex1_98
{
    public static void main(String[] args)
    {
        int[] arr = new int[2];
        for(int i = 0; i < arr.length+1; i++)
        {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }
}


