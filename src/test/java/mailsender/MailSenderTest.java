package mailsender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailSenderTest {
    private Client client;
    private MailCode mailCode;
    private MailInfo mailInfo;

    @BeforeEach
    void SetUp() {
        mailCode = mailCode.HAPPY_BIRTHDAY;
        client = new Client("Adam", 32, Gender.MALE);
        mailInfo = new MailInfo(client, mailCode);
    }

    @Test
    void sendMail() {
        assertEquals("", "");
    }
}