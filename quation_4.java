// 4) WAP to reverse all the elements of an array

class prog
{
    public static void main(String args[])
    {
        System.out.println("length : "+args.length);

        for(int i=0;i<args.length/2;i++)
        {
            String temp = args[i];
            args[i] = args[args.length-1-i];
            args[args.length-1-i] = temp;
        }    
        System.out.println("\nReverse Array\n");
        for(String s : args)
        {
            System.out.print("\t"+s);
        }
       
    }
}
