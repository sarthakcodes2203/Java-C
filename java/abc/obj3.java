class obj3
{
    int p,q,i,r;
    obj3(int x,int y)
    {
        p=x;
        q=y;
    }
    obj3 add(obj3 a, obj3 b)
    {
        
        obj3 c=new obj3(0,0);
        c.r=a.r+b.r;
        c.i=a.i+b.i;
        return c;
    }
    void display()
    {
        System.out.println(r+"+"+i+"i");
    }
    public static void main(String args[])
    {
        obj3 a=new obj3(5,6);
        obj3 b=new obj3(10,12);
        obj3 x=new obj3(0,0);
        x=x.add(a,b);
        a.display();
        b.display();
        x.display();
    }
}
