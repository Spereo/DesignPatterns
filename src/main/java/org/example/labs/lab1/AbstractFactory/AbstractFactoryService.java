package org.example.labs.lab1.AbstractFactory;

import org.example.labs.lab1.AbstractFactory.Mob.MobFormElementFactory;
import org.example.labs.lab1.AbstractFactory.Web.WebFormElementFactory;

public class AbstractFactoryService {
    private Configuration configuration;
    public FormElementFactory initFactory(Configuration config) {
        configuration = config;
        //Чтобы изменить реализацию фабрики с Web платформы на Mod платформу,
        //необходимо и достаточно изменить вызываемый метод класса Configuration
        //с initWeb на initMob

        FormElementFactory factory;
        switch (configuration.getPlatform()) {
            case (Configuration.WEB):
                factory = new WebFormElementFactory();
                break;
            case (Configuration.MOB):
                factory = new MobFormElementFactory();
                break;
            default:
                factory = null;
                try {
                    throw new Exception("Platform type is not declared");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
        return factory;
    }

    private void renderForm(FormElementFactory factory) {
        Input input = factory.createInput();
        Button button = factory.createButton();

        input.setValue("Test value");
        input.render();
        button.render();
    }

    public void execute() {
        renderForm(initFactory(configuration));
    }
}
