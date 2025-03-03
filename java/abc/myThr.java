class myThr extends Thread{
    public myThr(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("I am a Thread");   
    }
}

class MyTh
{
    public static void main(String args[])
    {
        String name="Sarthak";
        myThr t=new myThr(name);
        t.start();
        System.out.println("ID of the thread="+t.getId());
        System.out.println("ID of the thread="+t.getName());
    }
}