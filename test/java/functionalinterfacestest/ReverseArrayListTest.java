package functionalinterfacestest;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.Assert.assertEquals;

public class ReverseArrayListTest {

    @Test
    public void testReverseArrayList() {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Mango"));

        // Expected reversed ArrayList
        ArrayList<String> expectedReversedArrayList = new ArrayList<>(Arrays.asList("Mango", "Grapes", "Orange", "Banana", "Apple"));

        // Reverse the ArrayList
        Collections.reverse(arrayList);

        // Check if the reversed ArrayList matches the expected reversed ArrayList
        assertEquals(expectedReversedArrayList, arrayList);
    }
}


