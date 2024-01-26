package collections;

import java.util.ArrayList;

public class ConvertToArray {


    public static String[] convertArrayListToArray(ArrayList<String> list) {
        String[] array = new String[list.size()];
        list.toArray(array);

        return array;
    }
}
