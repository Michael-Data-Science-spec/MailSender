package mailsender;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private Client client1;
    private Client client2;

    @BeforeEach
    void SetUp() {
        client1 = new Client("Joe", 78, Gender.MALE);
        client2 = new Client("Anne", 24, Gender.FEMALE);
    }

    @Test
    void getId() {
        assertEquals(client1.getId(), 5);
        assertEquals(client2.getId(), 6);
    }

    @Test
    void getName() {
        assertEquals(client1.getName(), "Joe");
        assertEquals(client2.getName(), "Anne");
    }

    @Test
    void getAge() {
        assertEquals(client1.getAge(), 78);
        assertEquals(client2.getAge(), 24);
    }
}