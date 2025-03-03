import java.util.*;
class swap
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        System.out.println("Before Swap:"+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap:"+a+" "+b);
    }
}