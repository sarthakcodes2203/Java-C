class shape
{
    void area(int s)
    {
        int a;
        a=s*s;
        System.out.println("Area of Square="+a);
        
    }
    void area(int l, int b)
    {
        int a;
        a=l*b;
        System.out.println("Area of Rectangle="+a);
        
    }
    void area(double r)
    {
        double a;
        a=3.14*r*r;
        System.out.println("Area of Circle="+a);
        
    }
    public static void main(String args[])
    {
        shape obj=new shape();
        obj.area(5);
        obj.area(5,7);
        obj.area(2.3);
        
    }
}