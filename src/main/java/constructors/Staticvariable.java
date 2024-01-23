package constructors;

class Staticvariable
{
    static int count=0;
    public void increment()
    {
        count++;
        System.out.println(" "+count);
    }

    public static void main(String args[])
    {
        Staticvariable obj1=new Staticvariable();
        Staticvariable obj2=new Staticvariable();
        obj1.increment();
        System.out.println("Obj1: count is="+Staticvariable.count);
        obj2.increment();

        System.out.println("Obj2: count is="+Staticvariable.count);
    }
}