package collections;

import java.util.ArrayList;

public class ArrayListStrings {


    public static void traverseArrayList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}
