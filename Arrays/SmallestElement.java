import java.util.*;

public class SmallestElement
{
        public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print(" Enter the size of array :");
	int size=sc.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++)
	{
                    System.out.print("Enter " + (i+1) +"element");
	   arr[i]=sc.nextInt();
	}
	int small=arr[0];
	for(int i=1;i<size;i++)
	{
	    if(arr[i]<small)
	    {
	        small=arr[i];
	     }
	}
                  System.out.println("Smallest Element is " + small);
		
	
    }
}