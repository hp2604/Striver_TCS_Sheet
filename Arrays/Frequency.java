import java.util.*;

class CountFrequency{
 
  public void counting(int a[],boolean v[] ,int s)
   {
       int count=1;
      for(int i=0;i<s;i++)
      {
            for(int j=i+1;j<s;j++)
           {  if(a[i]==a[j] && v[j]==false)
              {
                 count ++;
                 v[j]=true;
               }
           }
          System.out.println(a[i] + " " + count);
           count=1;
              
      }
    }

}


public class Frequency
{
   public static void main(String arg[])
   {
      Scanner sc=new Scanner(System.in);
      
      // Input  Array 
      System.out.print("Enter size of Array : " );
      int size = sc.nextInt();
      int arr[]=new int[size];
      boolean visit[]=new boolean[size];
      for(int i=0;i<size;i++)
      {
         System.out.print("Enter " + (i+1) + " element " );
          arr[i]=sc.nextInt();
           visit[i]=false;

       }
       CountFrequency c=new CountFrequency();
       c.counting(arr,visit,size);
    }
 }