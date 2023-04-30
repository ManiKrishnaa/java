class One extends Thread
{
    public void run()
    {
        for(int i=1; i<5; i++)
        {
            System.out.println(" inside run block1 ");
        }
    }
}
class Two extends Thread
{
    public void run()
    {
        for(int i=1; i<5; i++)
        {
            System.out.println(" inside run block2 ");
        }
    }
}
class Three extends Thread
{
    public void run()
    {
        for(int i=1; i<5; i++)
        {
            System.out.println(" inside run block3 ");
        }
    }
}
class Threadpriorty 
{
    public static void main(String[] args) 
    {
        One t1 = new One();
        Two t2 = new Two();
        Three t3 = new Three();
        t1.start();
        t2.start();
        t3.start();
        t1.setPriority(6);
        t2.setPriority(2);
        t3.setPriority(4);
        System.out.println(" one : "+t1.getPriority());
        System.out.println(" two : "+t2.getPriority());
        System.out.println(" three : "+t3.getPriority());
    }
}