package LoopsandConditions;

public class Person {

    public int ifaperson(int age){
        if(age>=13 && age<=19){
            System.out.println("Teen");
        } else if (age<13) {
            System.out.println("Kid");
        } else if(age>19){
            System.out.println("Adult");
        }
        return 0;
    }
    public static void main(String args[]){
        int age=93;
        Person obj1=new Person();
        obj1.ifaperson(age);
    }

}
