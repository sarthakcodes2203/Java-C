class test1
{
    public static void main(String args[])
    {
        int a=5,b=0;
        try
        {
            int c=a/b;
            System.out.println("Result="+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide!!");
        }
        finally
        {
            System.out.println("Finally Executed!!");
        }
    }
}