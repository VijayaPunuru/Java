package arrays;

public class Searching {
    public int searcharr(int[] arr){
        int size=arr.length;
        int temp=89;
        for(int i=0;i<size;i++) {
            if (arr[i] == temp) {
                System.out.println("The element is found at index " + i);
            }
        }

        return 0;
    }
    public static void main(String args[]){
        Searching obj1=new Searching();
        int [] arr=new int[]{1,2,6,1,89,4};
        obj1.searcharr(arr);

    }
}
