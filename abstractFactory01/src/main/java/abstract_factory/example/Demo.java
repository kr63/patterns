package abstract_factory.example;

import abstract_factory.example.app.Application;
import abstract_factory.example.factories.GUIFactory;
import abstract_factory.example.factories.LinuxFactory;
import abstract_factory.example.factories.MacOSFactory;
import abstract_factory.example.factories.WindowsFactory;

public class Demo {

    private static Application configureApplication(String os) {

        GUIFactory factory = null;

        switch (os.toLowerCase()) {
            case "mac":
                factory = new MacOSFactory();
                break;
            case "win":
                factory = new WindowsFactory();
                break;
            case "linux":
                factory = new LinuxFactory();
                break;
        }
        assert factory != null;
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application appWin = configureApplication("win");
        appWin.paint();

        Application appMac = configureApplication("mac");
        appMac.paint();

        Application appLinux = configureApplication("linux");
        appLinux.paint();
    }
}
