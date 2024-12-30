package w4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {

    @Test
    public void testSendEmailValidEmail() {
        NotificationService service = new NotificationService();

        boolean result = service.sendEmail("user@example.com", "Hello, this is a test message!");

        assertTrue(result, "Email should be sent successfully for a valid email and message.");
    }

    @Test
    public void testSendEmailInvalidEmail() {
        NotificationService service = new NotificationService();

        boolean result = service.sendEmail("invalid-email", "This is a test message!");

        assertFalse(result, "Email should not be sent for an invalid email address.");
    }

    @Test
    public void testSendEmailEmptyMessage() {
        NotificationService service = new NotificationService();

        boolean result = service.sendEmail("user@example.com", "");

        assertFalse(result, "Email should not be sent for an empty message.");
    }

    @Test
    public void testSendEmailNullValues() {
        NotificationService service = new NotificationService();

        boolean result = service.sendEmail(null, null);

        assertFalse(result, "Email should not be sent when email or message is null.");
    }
}
