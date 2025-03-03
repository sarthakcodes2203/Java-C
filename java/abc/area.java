import java.util.*;
class area
{
    public static void main(String args[])
    {
        int ch,l,b;
        double a,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for rectangle \nPress 2 for circle");
        ch=sc.nextInt();
        switch(ch)
        {
        case 1:
            System.out.println("Enter length and breadth ");
            l=sc.nextInt();
            b=sc.nextInt();
            a=l*b;
            System.out.println("AREA="+a);
            break;
            case 2:
                System.out.println("Enter radius");
                r=sc.nextDouble();
                a=3.14*r*r;
                System.out.println("AREA="+a);
                break;
                default:
                    System.out.println("Wrong choice");
        }
        
    }
}