interface lab
{
    int m1 = 35;
    abstract public void ispasslab(int marks);
}
interface theorey
{
    int m2 = 40;
    abstract public void istheoreypass(int mark);
}
class Interfacesex implements lab,theorey
{
    public void ispasslab(int marks)
    {
        System.out.println(" -- lab passed -- marks -- "+m1);
    }
    public void istheoreypass(int mark)
    {
        System.out.println(" -- theorey passed -- marks -- "+m2);
    }
    public static void main(String args[])
    {
        Interfacesex obj = new Interfacesex();
        obj.ispasslab(40);
        obj.istheoreypass(50);
    }
}