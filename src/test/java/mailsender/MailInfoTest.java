package mailsender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
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
    void getClient() {
        assertEquals("Adam", mailInfo.getClient().getName());
    }

    @Test
    void getMailCode() {
        assertEquals("happy_birthday.txt", mailInfo.getMailCode().getFilename());
    }
}