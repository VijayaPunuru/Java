package collections;

import java.util.ArrayList;

public class ConvertToArray {
    public static void main(String[] args) {
        ArrayList<String> inp = new ArrayList();
        inp.add("adding 1st element");
        inp.add("adding 2nd element");
        inp.add("adding 3rd element");
        inp.add("adding 4th element");
        inp.add("adding 5th element");
        inp.add("adding 6th element");

        String [] arr1=new String[inp.size()];
         arr1 = inp.toArray(arr1);

        for (String s : arr1) {
            System.out.println(s);
        }
    }
}
