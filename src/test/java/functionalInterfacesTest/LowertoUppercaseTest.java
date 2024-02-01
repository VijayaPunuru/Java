package functionalInterfacesTest;

import functionalInterfaces.LowerToUpperCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LowertoUppercaseTest {
    @Test
    public void checkrotationstringstest(){
        String str="vIjayA";
        String result= LowerToUpperCase.lowertoupper(str);
        assertEquals("ViJAYa",result);
    }

    @Test
    public void checkrotationstringstest1(){
        String str="heLlo worLd";
        String result=LowerToUpperCase.lowertoupper(str);
        assertEquals("HElLO WORlD",result);
    }
}
