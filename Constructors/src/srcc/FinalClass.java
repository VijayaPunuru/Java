package srcc;

public class FinalClass {
    private final int temp1;

    public FinalClass(int temp1) {
        this.temp1 = temp1;
    }

    final void finalMethod() {
        System.out.println("This is the final method");
    }
}
