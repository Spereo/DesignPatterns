package org.example.labs.lab1.AbstractFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.labs.lab1.AbstractFactory.Mob.MobInput;
import org.example.labs.lab1.AbstractFactory.Web.WebInput;
import org.junit.jupiter.api.Test;

public class TestAbstractFactory {
    @Test
    public void test() {
        WebInput webInput = new WebInput();
        webInput.setValue("web input");
        assertEquals("web input", webInput.getValue());

        MobInput mobInput = new MobInput();
        mobInput.setValue("mob input");
        assertEquals("mob input", mobInput.getValue());

        Configuration configuration = Configuration.initMob();
        testMob(configuration);
        configuration = Configuration.initWeb();
        testWeb(configuration);
    }

    public void testMob(Configuration configuration) {
        AbstractFactoryService service = new AbstractFactoryService();

        FormElementFactory factory = service.initFactory(configuration);
        Button button = factory.createButton();
        assertEquals("render MobButton", button.render());
        assertEquals("Event on click MobButton", button.onClick());

        Input input = factory.createInput();
        String value = "S";
        input.setValue(value);
        assertEquals(String.format("render MobInput with value %s", input.getValue()), input.render());

        Checkbox checkbox = factory.createCheckbox();
        boolean state = true;
        checkbox.state(state);
        assertEquals(String.format("render MobCheckbox with state %s", checkbox.state()), checkbox.render());
    }

    public void testWeb(Configuration configuration) {
        AbstractFactoryService service = new AbstractFactoryService();

        FormElementFactory factory = service.initFactory(configuration);
        Button button = factory.createButton();
        assertEquals("render WebButton", button.render());
        assertEquals("Event on click WebButton", button.onClick());

        Input input = factory.createInput();
        String value = "W";
        input.setValue(value);
        assertEquals(String.format("render WebInput with value %s", input.getValue()), input.render());

        Checkbox checkbox = factory.createCheckbox();
        boolean state = false;
        checkbox.state(state);
        assertEquals(String.format("render WebCheckbox with state %s", checkbox.state()), checkbox.render());
    }
}
