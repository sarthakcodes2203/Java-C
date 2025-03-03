import java.util.*;
class temp
{
    public static void main(String args[])
    {
        int c,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in centigrate");
        c=sc.nextInt();
        f=(c*9/5)+32;
        System.out.println("Temperature in farenhite="+f);
    }
}