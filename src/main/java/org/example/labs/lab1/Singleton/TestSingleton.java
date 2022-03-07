package org.example.labs.lab1.Singleton;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestSingleton {
    @Test
    public void testSingletonService() {
        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();
        assertEquals(connection1, connection2);
    }
}
