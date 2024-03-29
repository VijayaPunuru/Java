package objectarrays;

public class Person {
    private int height;
    private double weight;
    private int ssn;
    private int phonenumber;

    public Person(int height, double weight, int ssn, int phonenumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phonenumber = phonenumber;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Person){
                Person obj2 = (Person) obj;
            return this.ssn == obj2.ssn;
        }
        return false;
    }

    public static void main(String[] args) {
        Person person1 = new Person(175, 70.5, 123456789, 35678761);
        Person person2 = new Person(180, 65.8, 987654321, 87649056);
        Person person3 = new Person(175, 70.5, 123456789, 35678761);

        if (person1.equals(person3)) {
            System.out.println("person1 ssn matches with the person3 ");
        } else {
            System.out.println(" person1 ssn does not match with the person3");
        }


    }
}






