class mythread2 implements Runnable
{
    public void run()
    {
        System.out.println("I am Thread 2");
    }
}

class mythread20 implements Runnable
{
    public void run()
    {
        System.out.println("I am Thread 20");
    }
}

class th
{
    public static void main(String args[])
    {
        mythread2 t2= new mythread2();
        Thread ta=new Thread(t2);   
        
        mythread20 t20= new mythread20 ();
        Thread tb=new Thread(t20);
        
        ta.start();
        tb.start();
    }
}