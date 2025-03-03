import java.util.*;
class A
{
    public int l,b,ar;
    A(int x,int y)
    {
        l=x;
        b=y;
    }
    void area()
    {
        ar=l*b;
    }
    void display1()
    {
        System.out.println("Area= "+ar);
    }
}
class B extends A
{
    int h,vol;
    B(int x,int y,int z)
    {
        super(x,y);
        h=z;
    }
    void volume()
    {
        vol=l*b*h;
        super.area();
    }
    void display2()
    {
        System.out.println("Volume= "+vol);
        super.display1();
    }
    public static void main(String args[])
    {
        B obj=new B(5,3,2);
        obj.volume();
        obj.display2();
    }
}