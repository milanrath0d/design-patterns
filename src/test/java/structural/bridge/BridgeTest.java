package structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Test for Bridge Pattern implementation
 */
class BridgeTest {

    @Test
    void testSendShortMessageViaSms() {
        MessageSender messageSender = new SMS();
        Message message = new ShortMessage(messageSender);
        assertDoesNotThrow(() -> message.sendMessage("Hello"));
    }

    @Test
    void testSendLongMessageViaEmail() {
        MessageSender messageSender = new Email();
        Message message = new LongMessage(messageSender);
        assertDoesNotThrow(() -> message.sendMessage("This is a longer message that would be sent via email"));
    }

    @Test
    void testSendShortMessageViaEmail() {
        MessageSender messageSender = new Email();
        Message message = new ShortMessage(messageSender);
        assertDoesNotThrow(() -> message.sendMessage("Short email"));
    }

    @Test
    void testSendLongMessageViaSms() {
        MessageSender messageSender = new SMS();
        Message message = new LongMessage(messageSender);
        assertDoesNotThrow(() -> message.sendMessage("Long SMS message"));
    }
} 