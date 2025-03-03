class cons 
{
    int a,b;
    cons()
    {
        a=0;
        b=0;
        
    }
    cons(int x,int y)
    {
        a=x;
        b=y;
        
    }
    void display()
    {
        System.out.println("a="+a+"  b="+b);
        
    }
    public static void main(String args[])
    {
        cons obj= new cons();
        obj.display();
        cons obj1=new cons(5,10);
        obj1.display();
    }
}