class One extends Thread
{
    public void run()
    {
        System.out.println(" -- this code is running -- ");
        for(int i=1; i<5; i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
class Two implements Runnable 
{
    public void run()
    {
        System.out.println(" -- this code is running -- ");
        for(int i=6; i<10; i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
class Threadex
{
    public static void main(String args[])
    {
        One t1 = new One();
        Two obj = new Two();
        Thread t2 = new Thread(obj);
        t1.start();
        t2.start();
    }
}