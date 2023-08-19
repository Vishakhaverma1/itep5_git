// 2) WAP to take n number of elements of an array from user and find out the sum of all the elements.

import java.util.Scanner;
 class prog
{
    public static void main (String args[])
    {  Scanner sc = new Scanner(System.in);
        System.out.println(" Length  : "+args.length);
        int sum=0;
        for (String a : args)
        {
            sum=sum+Integer.parseInt(a);
        }
       System.out.println(" Sum of All Element  Is : "+(sum));
      
}
}