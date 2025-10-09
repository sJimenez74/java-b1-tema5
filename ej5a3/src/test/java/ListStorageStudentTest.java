
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ListStorageStudentTest {

    @Test
    public void testSaveAndGetCV() {
        ListStorageStudent< ListStorageStudent.CV > storage = new ListStorageStudent<>();
        ListStorageStudent.CV cv = new ListStorageStudent.CV("Ana", "ana@example.com", "Engineer");
        storage.save(cv);
        assertEquals("Ana", storage.get(0).getName());
    }

    @Test
    public void testGetAllAndClearCertificates() {
        ListStorageStudent< ListStorageStudent.Certificate > storage = new ListStorageStudent<>();
        storage.save(new ListStorageStudent.Certificate("Java", 2021, "Oracle"));
        storage.save(new ListStorageStudent.Certificate("Docker", 2022, "Linux Foundation"));

        List<ListStorageStudent.Certificate> all = storage.getAll();
        assertEquals(2, all.size());
        assertEquals("Java", all.get(0).getTitle());

        storage.clear();
        assertEquals(0, storage.count());
    }

    @Test
    public void testCountAfterMultipleInserts() {
        ListStorageStudent<String> storage = new ListStorageStudent<>();
        storage.save("A");
        storage.save("B");
        storage.save("C");
        assertEquals(3, storage.count());
    }

    @Test
    public void testGetInvalidIndex() {
        ListStorageStudent<Integer> storage = new ListStorageStudent<>();
        storage.save(10);
        assertThrows(IndexOutOfBoundsException.class, () -> storage.get(5));
    }

    @Test
    public void testClearThenInsertAgain() {
        ListStorageStudent<String> storage = new ListStorageStudent<>();
        storage.save("test1");
        storage.clear();
        assertEquals(0, storage.count());
        storage.save("test2");
        assertEquals("test2", storage.get(0));
    }

    @Test
    public void testSaveNullItem() {
        ListStorageStudent<String> storage = new ListStorageStudent<>();
        storage.save(null);
        assertNull(storage.get(0));
    }
}
