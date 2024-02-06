package functionalinterfacestest;

import functionalInterfaces.Factorial;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FactorialTest {


        @Test
        public void testFactorialforPositive() {
            long x = 5;
            Factorial FactorialNumber = null;
            assertEquals(120, Factorial.factorial(x));
        }
        @Test
        public void testFactorialforZero() {
            long x = 0;
            Factorial FactorialNumber = null;
            assertEquals(1, Factorial.factorial(x));
        }

        @Test
        public void testFactorialforOne() {
            long x = 1;
            Factorial FactorialNumber = new Factorial();
            Assertions.assertEquals(1, FactorialNumber.factorial(x));
        }

        @Test
        public void testFactorialforNegative() {
            long x = -5;
            Factorial FactorialNumber = null;
            FactorialNumber.factorial(x);
        }
    }

