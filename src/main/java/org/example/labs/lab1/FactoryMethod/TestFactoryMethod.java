package org.example.labs.lab1.FactoryMethod;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFactoryMethod {
    @Test
    public void test() {
        FactoryMethodService service = new FactoryMethodService();
        Configuration configuration = new Configuration().initMob();
        String message = service.execute(configuration);
        String expectedMessage = "render MobButton";
        assertEquals(expectedMessage, message);

        configuration = new Configuration().initWeb();
        message = service.execute(configuration);
        expectedMessage = "render WebButton";
        assertEquals(expectedMessage, message);
    }
}
