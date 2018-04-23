import java.util.Scanner;

public class MaxNum
{
    public static void main(String[] args)
    {
        int x;
		int max;
        Scanner s = new Scanner(System.in);
        System.out.print("How many Numbers do you want to input ? ");
        
        x = s.nextInt();
        int array[] = new int[x];
		System.out.println("\nEnter Values:");
       
        for(int i = 0; i < x; i++)
        {
            array[i] = s.nextInt();
        }
        
        max = array[0];
        for(int i = 0; i < x; i++)
        {
            if(max < array[i])
            {
                max = array[i];
            }
        }
        System.out.println("The highest Number is "+max);
    }
}