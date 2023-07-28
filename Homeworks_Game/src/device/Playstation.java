package device;

import control.GameController;

public class Playstation implements GameController {
    private boolean isOpen = false;

    @Override
    public void pressButtonA() {
        System.out.println("Playstation: A tuşuna basıldı.");
    }

    @Override
    public void pressButtonB() {
        System.out.println("Playstation: B tuşuna basıldı.");
    }

    @Override
    public void pressButtonX() {
        System.out.println("Playstation: X tuşuna basıldı.");
    }

    @Override
    public void pressButtonY() {
        System.out.println("Playstation: Y tuşuna basıldı.");
    }

    public void open() {
        if (isOpen) {
            throw new RuntimeException("Playstation zaten açık.");
        }
        System.out.println("Playstation: Güç açılıyor.");
        isOpen = true;
    }

    public void shutdown() {
        if (!isOpen) {
            throw new RuntimeException("Playstation zaten kapalı.");
        }
        System.out.println("Playstation: Kapanıyor.");
        isOpen = false;
    }

    public void addController(GameController controller) {
        // Playstation'a controller ekleme işlemleri burada yapılabilir.
    }

    public void playGame() {
        if (!isOpen) {
            throw new RuntimeException("Playstation kapalıysa oyun oynanamaz.");
        }
        System.out.println("Playstation: Oyun başladı.");
    }
}

