import java.util.*;

// Using Recursive approach
class Recursion {
    public void reverse(int a[],int index,int s)
    { 
    
       // base case condition 
        if(index==s-1)
        {
            System.out.print(a[index]);
            return;
        }
        
       // recursive call
        reverse(a,index+1,s);
        System.out.print(a[index]);
    
     }

}

public class ReverseArray{
   public static void main (String args[]){
      Scanner sc =new Scanner(System.in);
      System.out.print("Enter size of Array : ");
      int size=sc.nextInt();
      int arr[]=new int [size];
      for(int i=0;i<size;i++)
     {
        System.out.print("Enter " + (i+1) + " element  : " ) ;
        arr[i]=sc.nextInt(); 
      }
      for(int i=size-1;i>=0;i--)
      {
         System.out.print(arr[i]);
       }

      Recursion r=new Recursion();
      r.reverse(arr,0,size);
      

   }

}