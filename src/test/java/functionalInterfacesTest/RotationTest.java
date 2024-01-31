package functionalInterfacesTest;

import functionalInterfaces.Rotation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotationTest {
    public void checkrotationstringstest(){
        String str="vijaya";
        String str1="ayajiv";
        String result=Rotation.rotationstrings(str);
        assertEquals(str1,result);
    }

    @Test
    public void checkrotationstringstest1(){
        String str="hello world";
        String str1="dlrow olleh";
        String result=Rotation.rotationstrings(str);
        assertEquals(str1,result);
    }
}
