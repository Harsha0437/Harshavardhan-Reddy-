package functionalinterfacestest;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import static org.junit.Assert.*;

public class SortHashMapTest {

    @Test
    public void testSortHashMap() {
        // Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(4, "Four");
        hashMap.put(2, "Two");

        // Sort HashMap by keys using TreeMap
        Map<Integer, String> sortedMap = new TreeMap<>(hashMap);

        // Expected sorted HashMap by keys
        TreeMap<Integer, String> expectedSortedMap = new TreeMap<>();
        expectedSortedMap.put(1, "One");
        expectedSortedMap.put(2, "Two");
        expectedSortedMap.put(3, "Three");
        expectedSortedMap.put(4, "Four");

        // Check if the sortedMap matches the expectedSortedMap
        assertEquals(expectedSortedMap, sortedMap);
    }
}



