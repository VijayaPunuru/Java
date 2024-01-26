package hashmaps;
import java.util.HashMap;
public class Distinctcharacters {
    public static void charcount(String inp) {
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char c : inp.toCharArray()) {
            if (c != ' ') {
                charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
            }
        }
        for (char key : charCounts.keySet()) {
            System.out.printf("%s-%d ", key, charCounts.get(key));
        }
    }
}

