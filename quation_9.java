// 9) WAP to find out the largest(maximum) element from an array

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
       int num =arr[0];
      for(i=0;i<arr.length;i++)
      {
          if(num<arr[i])
          {
             num=arr[i];
          }
      }
      System.out.print(num+" Largest Element From Array : ");   
    }
}