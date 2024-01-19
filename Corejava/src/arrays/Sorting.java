package arrays;

public class Sorting {
    public int sortingarr(int[] arr){

        int size=arr.length;
        int temp=0;
        for(int i=0;i<size-1;i++) {
            for(int j=0;j<size-i-1;j++){
                if(arr[j]> arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print(" Sorted array :");

        for(int k1=0;k1<size;k1++){
            System.out.print(" "+arr[k1]);
        }
        return 0;
    }
    public static void main(String args[]){
        Sorting obj1=new Sorting();
        int [] arr=new int[]{1,2,3,4,5,89};
        obj1.sortingarr(arr);

    }
}
