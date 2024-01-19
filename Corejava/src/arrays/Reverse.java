package arrays;

public class Reverse {
    public int rev(int[] arr){
        int temp=0;
        int size=arr.length;

        for(int i=0;i<(size/2);i++){

                temp=arr[i];
                arr[i]=arr[(size-1)-i];
                arr[(size-1)-i]=temp;

        }
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }

        return 0;
    }
    public static void main(String args[]){
        Reverse obj1=new Reverse();
        int [] arr=new int[]{7,45,7,76,87};
        obj1.rev(arr);

    }
}
