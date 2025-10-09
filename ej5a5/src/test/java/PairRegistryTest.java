import org.junit.jupiter.api.*;
import java.util.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class PairRegistryTest {

    private PairRegistry<String, Integer> registry;

    @BeforeEach
    public void setUp() {
        registry = new PairRegistry<>();
        registry.addPair("Shirt", 20);
        registry.addPair("Trousers", 15);
        registry.addPair("Shoes", 30);
    }

    @Test
    public void testAddAndGetValueByKey() {
        assertEquals(20, registry.getValueByKey("Shirt"));
        assertEquals(15, registry.getValueByKey("Trousers"));
        assertNull(registry.getValueByKey("Hat"));  // Not present
    }

    @Test
    public void testSumValues() {
        assertEquals(65, registry.sumValues());
    }

    @Test
    public void testPrintAllOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));

        registry.printAll();

        System.setOut(original);
        String output = out.toString().trim();

        assertTrue(output.contains("Shirt - 20"));
        assertTrue(output.contains("Trousers - 15"));
        assertTrue(output.contains("Shoes - 30"));
    }

    @Test
    public void testEmptyRegistrySumReturnsNull() {
        PairRegistry<String, Integer> emptyRegistry = new PairRegistry<>();
        assertNull(emptyRegistry.sumValues(), "Sum on empty list should return null");
    }

    @Test
    public void testOverwriteSameKey() {
        registry.addPair("Shirt", 50); // Adds another entry with same key
        // Should return the first value found
        assertEquals(20, registry.getValueByKey("Shirt"));
    }

    @Test
    public void testDifferentTypeFailsOnSum() {
        PairRegistry<String, String> textRegistry = new PairRegistry<>();
        textRegistry.addPair("One", "1");
        textRegistry.addPair("Two", "2");

        assertNull(textRegistry.sumValues(), "Sum should return null if values are not Integer");
    }
}
