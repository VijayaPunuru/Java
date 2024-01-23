package arrays;

public class Smallandlarge {
   public int sandl(int[] arr){
       int largenum=arr[0];
       int smallnum=arr[0];
       for(int i=0;i<5;i++){
           if(largenum<arr[i])
           {
               largenum=arr[i];
           }
           if(arr[i]<smallnum)
           {
               smallnum=arr[i];
           }

       }
       System.out.println("The largest number in the array is "+largenum);
       System.out.println("The smallest number in the array is "+smallnum);
       return 0;
   }
    public static void main(String args[]){
        Smallandlarge obj1=new Smallandlarge();
        int [] arr=new int[]{0,45,897,76,9};
        obj1.sandl(arr);

    }
}
