import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FormUtilsTest {

    @Test
    public void testContains() {
        String[] roles = {"admin", "editor", "viewer"};
        assertTrue(FormUtils.contains(roles, "editor"));
        assertFalse(FormUtils.contains(roles, "manager"));
    }

    @Test
    public void testCountItems() {
        Integer[] numbers = {1, 2, 3, 4};
        assertEquals(4, FormUtils.countItems(numbers));
    }

    @Test
    public void testAreEqual() {
        assertTrue(FormUtils.areEqual("test", "test"));
        assertFalse(FormUtils.areEqual("test", "TEST"));
    }

    @Test
    public void testCountOccurrences() {
        String[] answers = {"yes", "no", "yes", "maybe", "yes"};
        assertEquals(3, FormUtils.countOccurrences(answers, "yes"));
    }

    @Test
    public void testRemoveNulls() {
        String[] inputs = {"ok", null, "skip", null};
        List<String> result = FormUtils.removeNulls(inputs);
        assertEquals(2, result.size());
        assertTrue(result.contains("ok"));
        assertTrue(result.contains("skip"));
    }
}
