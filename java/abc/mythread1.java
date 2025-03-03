class mythread1 extends Thread{
    @Override
    
    public void run(){
        
        System.out.println("My Thread1 is Running");
        System.out.println("I am happy");    
        
    }
}

class mythread10 extends Thread{
    @Override
    public void run(){
        
        System.out.println("My Thread10 is Running");
        System.out.println("I am sad");    
        
    }
}

class th
{
    public static void main(String args[])
    {
        mythread1 t1=new mythread1();
        mythread10 t10=new mythread10();
        t1.start();
        t10.start();
    }
}