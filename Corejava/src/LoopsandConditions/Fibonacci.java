package LoopsandConditions;

public class Fibonacci {
    public int fibon(int N){
        int temp=0;
        int temp1=1;
        System.out.print(temp);
        System.out.print(" "+temp1);

        for(int i=0;i<N-2;i++){
            int c=temp+temp1;
            System.out.print(" "+c);
            temp=temp1;
            temp1=c;
        }
        return 0;
    }
    public static void main(String args[]){
        int N=10;
        Fibonacci obj1=new Fibonacci();
        obj1.fibon(N);
    }
}
