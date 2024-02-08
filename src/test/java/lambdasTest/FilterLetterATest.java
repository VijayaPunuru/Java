package lambdasTest;
import java.util.List;
import lambdas.FilterLetterA;
import org.junit.Test;
public class FilterLetterATest {
    @Test
    public void filtertest(){
        List<String> strings = List.of("Vijaya", "bat", "Anju");
        FilterLetterA.filterStrings(strings, s -> !s.startsWith("A"));
    }
    @Test
    public void filtertest1(){
        List<String> strings = List.of("");
        FilterLetterA.filterStrings(strings, s -> !s.startsWith("A"));
    }

}
