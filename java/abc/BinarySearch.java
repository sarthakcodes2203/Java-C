import java.util.*;
class BinarySearch
{
    public static void main(String args[])
    {
        int scr,fl=0,i,pos=0,n;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size of array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter sorted array Elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter searching element");
        scr=sc.nextInt();
        int lb=0,ub=n-1;
        while(lb<=ub)
        {
            int mid=(lb+ub)/2;
            if(a[mid]>scr)
            ub=mid-1;
            if(a[mid]<scr)
            lb=mid+1;
            if(a[mid]==scr)
            {
                fl=1;
                pos=mid;
                break;
            }
            
        }
        if(fl==1)
        System.out.println("Searching element present at "+ pos+1);
        else
        System.out.println("Searching element not found!!");
        
    }
}