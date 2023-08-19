// 7) WAP showing the concept of Selection sort (Ascending order | Descending order)

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
            for(int j=i+1;j<args.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
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
            for(int j=i+1;j<args.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
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
