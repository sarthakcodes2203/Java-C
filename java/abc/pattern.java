import java.util.*;
class pattern

{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,ch,k=1;
        System.out.println("Enter number of rows");
        int n= sc.nextInt();
        System.out.println("Enter choices 1to5 for patterns");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                for(i=1;i<=n;i++)
                {
                    for(j=1;j<=i;j++)
                    {
                        System.out.print(k+" ");
                        k++;
                        
                    }
                    System.out.println();
                    
                }
                break;
                case 2:
                    for(i=1;i<=n;i++)
                    {
                        for(j=1;j<=i;j++)
                        {
                        System.out.print(j);
                        
                        }
                        System.out.println();
                    
                    }
                    break;
                    case 3:
                        for(i=1;i<=n;i++)
                    {
                        for(j=1;j<=i;j++)
                        {
                        System.out.print(i);
                        
                        }
                        System.out.println();
                    
                    }
                    break;
                    case 4:
                    int sp=n-1,p=1;
                    for(i=1;i<=n;i++)
                    {
                        for(j=1;j<=sp;j++)
                        {
                        System.out.print(" ");
                        
                        }
                        for(k=1;k<=i;k++)
                        {
                            System.out.print(p);
                            p++;
                        }
                        System.out.println();
                        sp--;
                    
                    }
                    break;
                    case 5:
                        for(i=n;i>=1;i--)
                    {
                        for(j=1;j<=i;j++)
                        {
                        System.out.print(j+" ");
                        
                        }
                        System.out.println();
                    
                    }
                    break;
                    default:
                        System.out.println("Wrong Choice");
                        
        }
    }
}