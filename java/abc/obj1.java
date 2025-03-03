class obj1
{
    int h,m,s;
    obj1(int p,int q,int r)
    {
        h=p;
        m=q;
        s=r;
    }
    void addition(obj1 a, obj1 b)
    {
        obj1 c=new obj1(0,0,0);
        c.h=a.h+b.h;
        c.m=a.m+b.m;
        c.s=a.s+b.s;
        System.out.println("Hour="+c.h+" Minute="+c.m+" Second="+c.s);
    }
    public static void main(String args[])
    {
        obj1 a=new obj1(5,6,40);
        obj1 b=new obj1(10,10,50);
        obj1 c=new obj1(0,0,0);
    }
}