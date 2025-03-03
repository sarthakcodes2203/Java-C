class obj2
{
    int h,m,s;
    obj2(int p,int q,int r)
    {
        h=p;
        m=q;
        s=r;
    }
    obj2 addition(obj2 a, obj2 b)
    {
        
        obj2 c=new obj2(0,0,0);
        c.h=a.h+b.h;
        c.m=a.m+b.m;
        c.s=a.s+b.s;
        return (c);
    }
    void display()
    {
        System.out.println("Hour="+h+" Minute="+m+" Second="+s);
    }
    public static void main(String args[])
    {
        obj2 a=new obj2(5,6,40);
        obj2 b=new obj2(10,10,50);
        obj2 x=new obj2(0,0,0);
        x=x.addition(a,b);
        a.display();
        b.display();
        x.display();
    }
}
