import java.util.*;
class BubbleSort
{
    public static void main(String args[])
    {
        int i,j,n,t;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size of array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array Elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Before Sorting: ");
         for(i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
                }
                
            }
            
        }
        System.out.println("After Sort:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}