import java.util.*;
class arms
{
    public static void main(String args[])
    {
        int d=0,r,s=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int m=n;
        int x=n;
        while(m>0)
        {
            m=m/10;
            d++;
        }
        while (n!=0)
        {
            r=n%10;
            s=s+(int)Math.pow(r,d);
            n=n/10;
        }
        if(x==s)
        System.out.println("It is an armstrong number");
        else
        System.out.println("It is not an armstrong number");
        
    }
}
