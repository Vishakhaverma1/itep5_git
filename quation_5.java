// 5) WAP to reverse individual elements of an array

import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {   Scanner sc = new Scanner (System.in);
        System.out.println("length : "+args.length);
       
        int arr[]= new int [args.length];
        for(int i=0;i<args.length;i++)
        {
            arr[i] = Integer.parseInt(args[i]);    // Copying Args In Array 
        }  
        for(int i=0;i<args.length;i++)
        {   int rev =0,rem=0;
            int element = arr[i]; 
            while(element!=0)
            {   
                 rem = element%10;
                rev= rev*10+rem; 
                element = element/10; 
            } System.out.print(rev+"  ");
        }  
       
    }
}
