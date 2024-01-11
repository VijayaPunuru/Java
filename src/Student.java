public class Student {
    String name;
    public String getName() {
        name="Vijayalakshmi";
        return name;
    }
    public static void main(String[] args)
    {
        Student obj=new Student();
        System.out.println("My name is "+obj.getName());
    }
}
