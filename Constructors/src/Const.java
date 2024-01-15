public class Const {
    public static void main(String args[]){
        Parent obj1=new Parent(10);
        Child obj2=new Child(10,30);
        Child obj3=new Child(10);

        System.out.println("This is the parent class  "+obj1.firstInstance);
        System.out.println("This is the child class with 2 instance variables "+obj2.firstInstance+" "+obj2.secondInstance);
        System.out.println("This is the child class with overloaded constructor  "+obj3.secondInstance);


    }
}
