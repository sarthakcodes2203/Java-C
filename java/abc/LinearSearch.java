import java.util.*;
class LinearSearch
{
    public static void main(String args[])
    {
        int scr,fl=0,i,pos=0,n;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size of array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array Elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter searching element");
        scr=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==scr)
            {
                pos=i;
                fl=1; 
                break;
            }
        }
        if(fl==1)
        System.out.println("Searching element present at "+ pos+1);
        else
        System.out.println("Searching element not found!!");
        
    }
}