import java.util.*;
class roots
{
    public static void main  (String args[])
    {
        double a,b,c, n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of a,b,c-");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        n1=((-1*b)+Math.sqrt(b*b-4*a*c))/(2*a);
        n2=((-1*b)-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("The Roots Are:"+n1+" "+n2);
    }
}