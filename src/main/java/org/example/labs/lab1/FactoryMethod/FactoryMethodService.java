package org.example.labs.lab1.FactoryMethod;

public class FactoryMethodService {
    public void execute() {
        Configuration configuration = Configuration.initMob();
        //Чтобы получить вывод в консоль render MobButton, необходимо и достаточно
        //вызвать метод initMob класса Configuration вместо initWeb

        Dialog dialog;
        switch (configuration.getPlatform()) {
            case (Configuration.WEB) -> dialog = new WebDialog();
            case (Configuration.MOB) -> dialog = new MobDialog();
            default -> {
                dialog = null;
                try {
                    throw new Exception("Platform type is not declared");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        assert dialog != null;
        dialog.render();
    }
}
