import java.util.*;

public class LargestElement
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter theSize of Array ");
          int size=sc.nextInt();
          int arr[]=new int[size];
          for(int i=0;i<size;i++)
          {
             System.out.print("Enter " + (i+1) + " element : " );
              arr[i]=sc.nextInt();   
           }
           int large=arr[0];
           for(int i=0;i<size;i++)
          {
	if(arr[i]>large)
	{
                      large=arr[i];
                  }
           }
           System.out.print("Largest Element is " +  large );
         
      
    }
}