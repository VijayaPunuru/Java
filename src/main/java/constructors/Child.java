package constructors;

public class Child extends Parent{
    int secondInstance;

    public Child(int firstInstance, int secondInstance) {
        super(firstInstance);
        this.secondInstance = secondInstance;
    }

    public Child(int secondInstance) {
        super(34);
        this.secondInstance = secondInstance;
    }
}
