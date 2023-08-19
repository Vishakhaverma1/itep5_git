
// 12) Java Program to Sort Names in an Alphabetical Order

import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {   int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Length : "+args.length);
        String arr[]= new String [args.length];
        for( i=0;i<args.length;i++)
        {
            arr[i] = (args[i]);    
        }  
       System.out.println();
       for (i = 0; i < args.length ; i++) {
        for (j = i + 1; j < args.length; j++) {
            if (arr[i].compareTo(arr[j]) > 0) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    System.out.println(" Array After Sorting : ");
    for (i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + "\t");
    }
    System.out.println();
    }
}
