package device;

import control.GameController;
public class Computer {
    private boolean isOpen = false;

    public void open() {
        if (isOpen) {
            throw new RuntimeException("Computer zaten açık.");
        }
        System.out.println("Computer: Güç açılıyor.");
        isOpen = true;
    }

    public void shutdown() {
        if (!isOpen) {
            throw new RuntimeException("Computer zaten kapalı.");
        }
        System.out.println("Computer: Kapanıyor.");
        isOpen = false;
    }

    public void addController(GameController controller) {
        // Bilgisayara controller ekleme işlemleri burada yapılabilir.
    }

    public void playGame() {
        if (!isOpen) {
            throw new RuntimeException("Computer kapalıysa oyun oynanamaz.");
        }
        System.out.println("Computer: Oyun başladı.");
    }
}
