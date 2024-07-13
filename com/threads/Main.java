package com.threads;

public class Main 
{
    public static void main(String[] args) throws InterruptedException 
    {
        A a = new A();
        
        Thread t1 = new Thread(a, "Deepak");
        Thread t2 = new Thread(a, "Dara");
        Thread t3 = new Thread(a, "Hii");
        Thread t4 = new Thread(a, "Hello");
        Thread t5 = new Thread(a, "All");
        Thread t6 = new Thread(a, "goodMorning");
        
        t1.start();
        Thread.sleep(1000);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();     
        Thread.sleep(1000);

        t3.start();
        Thread.sleep(1000);


        t4.start();
        Thread.sleep(1000);

        t5.start();
        Thread.sleep(1000);

        t6.start();
        Thread.sleep(1000);

        

    }
}

class A implements Runnable
{
    int count = 0;
    
    @Override
    public void run() 
    {
        synchronized(this)
        {
            dummy();
        }
    }
    
    public void dummy()
    {
        for(int i=1; i<=10; i++)
        {
            count++;
            System.out.println(Thread.currentThread().getName() + " = " + count);
        }
    }
}
