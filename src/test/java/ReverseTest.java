import org.junit.Test;
import strings.Reverse;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
public class ReverseTest {
    @Test
    public void testAreReverse() {
        String input = "Hello";
        String expectedOutput = "olleH";

        String result = Reverse.reverseWords(input);
        assertEquals(expectedOutput, result);

        String input1 = "Java J2EE Reverse Me";
        String expectedOutput1 = "avaJ EE2J esreveR eM";
        String result1 = Reverse.reverseWords(input1);
        assertEquals(expectedOutput1, result1);

        String input2 = "";
        String expectedOutput2 = "";
        String result2 = Reverse.reverseWords(input2);
        assertEquals(expectedOutput2, result2);
    }

}