// 8) WAP showing the concept of Bubble sort  (Ascending order | Descending order)

import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length : "+args.length);
        int arr[]= new int [args.length];
        for(int i=0;i<args.length;i++)
        {
            arr[i] = Integer.parseInt(args[i]);    
        }  
        for(int i=0;i<args.length;i++)
        {
            for(int j=0;j<args.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }    
        System.out.println("\nArray elements in Ascending order : ");
        for(int i=0;i<args.length;i++)
        {
            System.out.print("\t"+arr[i]);
        }
        for(int i=0;i<args.length;i++)
        {
            for(int j=0;j<args.length-1-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }    
        System.out.println("\n Array elements in Descending order : ");
        for(int i=0;i<args.length;i++)
        {
            System.out.print("\t"+arr[i]);
        }
        
    }
}
