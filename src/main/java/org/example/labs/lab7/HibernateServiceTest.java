package org.example.labs.lab7;

import org.junit.jupiter.api.Test;

public class HibernateServiceTest {
    @Test
    public void test() {
        HibernateSessionService service = new HibernateSessionService();
        service.execute();
    }
}
