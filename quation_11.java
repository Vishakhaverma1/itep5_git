// 11) WAP showing the concept of Insertion sort

import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {   int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Length : "+args.length);
        int arr[]= new int [args.length];
        for( i=0;i<args.length;i++)
        {
            arr[i] = Integer.parseInt(args[i]);    
        }  
       System.out.println();
      for(i=1;i<args.length;i++)
      {
          for(j=i;j>=1;j--)
          {
              if(arr[j-1]>arr[j])
              {
                int temp=arr[j];
                 arr[j]=arr[j-1];
                 arr[j-1]=temp;
              }
          }
      }
      System.out.println(" In Ascending Order :");
      for(i=0;i<arr.length;i++)
      {  
          System.out.print(arr[i]+" ");
      }  
      for(i=1;i<args.length;i++)
      {
          for(j=i;j>=1;j--)
          {
              if(arr[j-1]<arr[j])
              {
                int  temp=arr[j];
                 arr[j]=arr[j-1];
                 arr[j-1]=temp;
              }
          }
      }
      System.out.println(" \n In Descending Order :");
      for(i=0;i<arr.length;i++)
      {  
          System.out.print(arr[i]+" ");
      }     
    }
}
