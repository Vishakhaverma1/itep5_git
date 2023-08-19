// 1) WAP to take n number of elements of an array and find out the sum of first and last element of an array. 

import java.util.Scanner;
 class prog
{
    public static void main (String args[])
    {  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        
        System.out.println(" Length  : "+args.length);
        int sum=0;
       System.out.println(" Sum of first element : "+Integer.parseInt(args[0])+" and last element "+Integer.parseInt(args[args.length-1])+" is = "+(Integer.parseInt(args[0])+Integer.parseInt(args[args.length-1])));
      
}
}