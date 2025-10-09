

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClasseGenericaTest {

    @Test
    public void testStringElements() {
        ClasseGenerica<String> c = new ClasseGenerica<>();
        c.addElement("Hello");
        c.addElement("Goodbye");

        assertEquals("Hello", c.getFirstElement());
        assertEquals("Goodbye", c.getLastElement());
        assertEquals(2, c.getTotalElements());
    }

    @Test
    public void testIntegerElements() {
        ClasseGenerica<Integer> c = new ClasseGenerica<>();
        c.addElement(1);
        c.addElement(2);
        c.addElement(3);

        assertEquals(1, c.getFirstElement());
        assertEquals(3, c.getLastElement());
        assertEquals(3, c.getTotalElements());
    }

    @Test
    public void testEmptyListReturnsNull() {
        ClasseGenerica<Double> c = new ClasseGenerica<>();
        assertNull(c.getFirstElement());
        assertNull(c.getLastElement());
        assertEquals(0, c.getTotalElements());
    }
}
