package loopsandconditions;

public class Reverse {
    int temprev=0;
    public int Reversedigits(int num){
        while(num>0){
            temprev=temprev*10+num%10;

            num=num/10;
        }
        return temprev;
    }
    public static void main(String args[]){
        int number=12345;
        Reverse obj1=new Reverse();
        System.out.println("reverse digits="+obj1.Reversedigits(number));
    }
}
