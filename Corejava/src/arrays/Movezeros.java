package arrays;

public class Movezeros {
    public int movezero(int[] arr){

        int size=arr.length;
        int temp=0;
        int [] arr1=new int[size];
        int k=0;
        for(int i=0;i<size;i++) {
            if (arr[i] != 0) {
                arr1[k]=arr[i];
                k++;
            }
            else temp++;
        }
        for(int i=size-temp;i<size;i++) {
            arr1[i]=0;
        }
        for(int k1=0;k1<size;k1++){
            System.out.print(" "+arr1[k1]);
        }
        return 0;
    }
    public static void main(String args[]){
        Movezeros obj1=new Movezeros();
        int [] arr=new int[]{0,0,5,0,2,0,0};
        obj1.movezero(arr);

    }
}
