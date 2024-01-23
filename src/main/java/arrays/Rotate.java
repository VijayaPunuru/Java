package arrays;

public class Rotate {
    public int rotatearr(int[] arr){
        int x=2;
        int size=arr.length;
        int [] arr1=new int[x];
        int k=0;
        for(int i=0;i<x;i++){
            arr1[k]=arr[i];
            k++;
        }
        k=0;
        for(int i=x;i<size;i++){
            arr[k]=arr[i];
            k++;
        }
        k=size-1;
        for(int i=x-1;i>=0;i--){
         arr[k]=arr1[i];
         k--;
        }
        for(int i=0;i<size;i++){

            System.out.print(" "+arr[i]);

        }
        return 0;
    }
    public static void main(String args[]){
        Rotate obj1=new Rotate();
        int [] arr=new int[]{1,2,3,4,5,6,7};
        obj1.rotatearr(arr);

    }
}
