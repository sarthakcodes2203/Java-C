import java.util.*;
class time
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TIME IN SECONDS ");
        int n=sc.nextInt();
        double h,m,s;
        h=n/3600;
        m=(n-(3600*h))/60;
        s=(n-(3600*h)-(3600*m));
        System.out.println("Hour:"+h+"Min:"+m+"Sec:"+s);
    }
}