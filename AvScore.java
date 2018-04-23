import java.util.Scanner;
class AvScore
{
   public static void main(String arg[])
	
    {
	
       int a;
	   double b=0;
	
       Scanner n=new Scanner(System.in);
 
       System.out.println("How many numbers you want to enter:");
	   
       a=n.nextInt();
 
       int s[]=new int[a];
 
       System.out.println("\nEnter   "+a+"  numbers");
 
       for(int i=0;i<a;i++)
	   s[i]=n.nextInt();
 
       for(int i=0;i<a;i++)
	   b =b+s[i];
 	 	    
        System.out.println("average="+b/a);
 
    }
 
}