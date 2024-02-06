package functionalinterfacestest;
import functionalInterfaces.RepeatedDigits;
import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedDigitsTest {

    @Test
    public void testFindRepeatedDigits_NoRepeatedDigits() {
        int inputNumber = 123456789;
        String expected = "";
        assertEquals(expected, RepeatedDigits.findRepeatedDigits(inputNumber));
    }

    @Test
    public void testFindRepeatedDigits_OneRepeatedDigit() {
        int inputNumber = 122345554;
        String expected = "2 4 5";
        assertEquals(expected, RepeatedDigits.findRepeatedDigits(inputNumber));
    }

    @Test
    public void testFindRepeatedDigits_AllRepeatedDigits() {
        int inputNumber = 999999;
        String expected = "9";
        assertEquals(expected, RepeatedDigits.findRepeatedDigits(inputNumber));
    }

    @Test
    public void testFindRepeatedDigits_AllUniqueDigits() {
        int inputNumber = 1234567890;
        String expected = "";
        assertEquals(expected, RepeatedDigits.findRepeatedDigits(inputNumber));
    }
}


