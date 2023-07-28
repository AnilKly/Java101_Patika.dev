package device;

public class Device {
    private boolean isPluggedIn = false;

    public void plugIn() {
        if (isPluggedIn) {
            throw new RuntimeException("Cihaz zaten takılı.");
        }
        System.out.println("Cihaz: Bilgisayara bağlandı.");
        isPluggedIn = true;
    }

    public void unplug() {
        if (!isPluggedIn) {
            throw new RuntimeException("Cihaz zaten çıkarıldı.");
        }
        System.out.println("Cihaz: Bilgisayardan çıkarıldı.");
        isPluggedIn = false;
    }
}
