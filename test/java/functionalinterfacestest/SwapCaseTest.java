package functionalinterfacestest;

import functionalInterfaces.SwapCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class SwapCaseTest {

    @Test
    public void testSwapCase() {
        // Test input string
        String inputString = "Hello World";

        // Expected output after swapping cases
        String expectedString = "hELLO wORLD";

        // Call the swapCase method

        String swappedString = SwapCase.swapCase (inputString);

        // Check if the swappedString matches the expectedString
        assertEquals(expectedString, swappedString);
    }
}


