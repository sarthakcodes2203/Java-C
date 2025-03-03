import java.util.*;
class method
{
    int a,b,s;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        
    }
    void sum()
    {
        s=a+b;
    }
    void display()
    {
        System.out.println("SUM="+s);
        
    }
    public static void main(String argd[])
    {
        method obj= new method();
        obj.accept();
        obj.sum();
        obj.display();
    }
}