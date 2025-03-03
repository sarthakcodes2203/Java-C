import java.util.*;
class NameSort
{
    public static void main(String args[])
    {
        int i,j;
        String temp;
        String n[]=new String[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 names: ");
        for(i=0;i<10;i++)
        {
            n[i]=sc.nextLine();
            
        }
        for(i=0;i<10-1;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if (n[i].compareTo(n[j])>0)
                {
                   temp=n[i];
                   n[i]=n[j];
                   n[j]=temp;
                   
                }
            }
        }
        System.out.println("Sorted Names: ");
        for(i=0;i<10;i++)
        {
            System.out.println(n[i]);
            
        }
    }
}