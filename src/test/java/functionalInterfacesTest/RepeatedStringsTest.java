package functionalInterfacesTest;

import functionalInterfaces.RepeatedStrings;
import org.junit.Test;
public class RepeatedStringsTest {
    @Test
    public void checkrepeatedstringstest(){
        String str="vijaya";
        RepeatedStrings.repeatedchars(str);
    }

    @Test
    public void checkrepeatedstringstest1(){
        String str="Hello World";
        RepeatedStrings.repeatedchars(str);
    }
}
