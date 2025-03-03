interface Bank
{
    float rateofinterest();
}
class SBI implements Bank
{
    public float rateofinterest()
    {
        return 6.5f;
    }
}
class BOI implements Bank
{
    public float rateofinterest()
    {
        return 4.5f;
    }
}
class Test
{
    public static void main(String args[])
    {
        Bank s=new SBI();
        System.out.println(s.rateofinterest());
        Bank b= new BOI();
        System.out.println(b.rateofinterest());
    }
}