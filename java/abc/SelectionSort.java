import java.util.*;
class SelectionSort
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
            for(j=0;j<n-1;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
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