interface printable
{
    void print();
}
interface showable
{
     void show();
}
class Test implements printable,showable
{
    public void print()
    {
        System.out.println("Hello");
    }
    public void show()
    {
        System.out.println("Wrold");
    }
    public static void main(String args[])
    {
        Test obj=new Test();
        obj.print();
        obj.show();
    }
}
