

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class EventLoggerTest {

    @Test
    void testUserLoginLogger() {
        EventLogger<EventLogger.UserLogin> logger = new EventLogger<>();
        logger.logEvent(new EventLogger.UserLogin("anna", "09:00"));
        logger.logEvent(new EventLogger.UserLogin("jordi", "10:15"));

        assertEquals(2, logger.getAllEvents().size());
        assertEquals("jordi", logger.getLastEvent().toString().contains("jordi") ? "jordi" : "fail");
    }

    @Test
    void testEmptyLogger() {
        EventLogger<EventLogger.BankTransaction> logger = new EventLogger<>();
        assertNull(logger.getLastEvent());
        assertTrue(logger.getAllEvents().isEmpty());
    }

    @Test
    void testSystemErrorLogger() {
        EventLogger<EventLogger.SystemError> logger = new EventLogger<>();
        logger.logEvent(new EventLogger.SystemError("Critical failure", 999));

        EventLogger.SystemError last = logger.getLastEvent();
        assertNotNull(last);
        assertTrue(last.toString().contains("Critical failure"));
    }
}
