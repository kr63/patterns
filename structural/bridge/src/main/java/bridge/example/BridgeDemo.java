package bridge.example;

import bridge.example.devices.Device;
import bridge.example.devices.Radio;
import bridge.example.devices.Tv;
import bridge.example.remotes.AdvancedRemote;
import bridge.example.remotes.BasicRemote;

public class BridgeDemo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
