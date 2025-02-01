import java.util.*;

public class SecondElement {

  public static void main(String args[])
  {
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter the size of Array : ");
     
      int size = sc.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
         System.out.print("Enter " + (i+1) + " element" );
         arr[i]=sc.nextInt();
       }

       int small=arr[0];
       int large=arr[0];
       int second_small=0;
       int second_large=0; 
      for(int i=1;i<size;i++)
     {
        if(arr[i]<small)
        {
           second_small=small;
           small=arr[i];    
         }
        else if(arr[i]<large)
        {
            second_small=arr[i];
         }
         else
         {
            second_large=large;
            large=arr[i];
          }
        
      }
      System.out.print("Second Smallest Element : " + second_small);
      System.out.print("Second Largest Element : " + second_large); 
 

  }




}