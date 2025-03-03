import java.util.*;
class arrpal
{
    public static void main(String args[])
    {
        int i,rn=0,n,d,p,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        n=sc.nextInt();
        int a[]= new int[n];
        for(i=0;i<n;i++)
        {
            p=a[i];
            while(p>0)
            {
                d=p%10;
                rn=rn*10+d;
                p=p/10;
                
            }
            if(rn==a[i])
            c++;
            rn=0;
        }
        System.out.println("No of palindrome numbers present="+c);
        
    }
}