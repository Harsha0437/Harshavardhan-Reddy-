package functionalinterfacestest;


    import static org.junit.Assert.assertEquals;
import org.junit.Test;

    public class SwapTest {

        @Test
        public void testSwapBasic() {
            int a = 5;
            int b = 10;

            // Perform swapping
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            // Check the result
            assertEquals(10, a);
            assertEquals(5, b);
        }

        @Test
        public void testSwapEqualValues() {
            int a = 8;
            int b = 8;

            // Perform swapping
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            // Check the result
            assertEquals(8, a);
            assertEquals(8, b);
        }

        @Test
        public void testSwapNegativeValues() {
            int a = -15;
            int b = -20;

            // Perform swapping
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            // Check the result
            assertEquals(-20, a);
            assertEquals(-15, b);
        }

        // Add more test cases as needed...

    }


