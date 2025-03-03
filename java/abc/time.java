import java.util.*;
class time
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TIME IN SECONDS ");
        int n=sc.nextInt();
        double h,m,s;
        s=n%60;
        h=n/60;
        m=h%60;
        h=h/60;
        System.out.println("Hour:"+(int)h+"Min:"+(int)m+"Sec:"+(int)s);
    }
}