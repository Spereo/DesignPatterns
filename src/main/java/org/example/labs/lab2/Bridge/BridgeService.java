package org.example.labs.lab2.Bridge;

public class BridgeService {
    public void execute() { testDevice(new Radio()); }
    //Чтобы изменить реализацию устройства с TV на Radio
    //или наоборот, необходимо изменить передаваемый в качестве аргумента
    //метода testDevice объект с TV на Radio или с Radio на TV соответственно

    private void testDevice(Device device) {
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        System.out.println(basicRemote.power());
        System.out.println(device.getStatus());

        System.out.println("Tests with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        System.out.println(advancedRemote.power());
        System.out.println(advancedRemote.mute());
        System.out.println(device.getStatus());
    }
}
