package device;

import control.GameController;
import control.Playstation;
import control.Xbox;

public class DeviceService {

    public static void connect(GameController controller, Device device) {
        device.plugIn();
        System.out.println("Cihaz bilgisayara bağlandı.");

        if (controller instanceof Xbox) {
            System.out.println("Xbox Controller bağlandı.");
        } else if (controller instanceof Playstation) {
            System.out.println("Playstation Controller bağlandı.");
        }
    }

    public static void disconnect(Device device) {
        device.unplug();
        System.out.println("Cihaz bilgisayardan çıkarıldı.");
    }
}
