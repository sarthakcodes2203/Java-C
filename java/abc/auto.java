import java.util.*;
class auto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int p=(int)Math.pow(n,2);
        while(n>0)
        {
            if(n%10==p%10)
            System.out.println("It is an automorphic number");
            else
            System.out.println("It is not an automorphic number");
            n=n/10;
            p=p/10;
        }
    }
}