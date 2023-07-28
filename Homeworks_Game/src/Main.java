import control.GameController;
import control.Xbox;
import control.Playstation;
import device.Computer;

public class Main {
    public static void main(String[] args) {
        GameController xboxController = new Xbox();
        GameController psController = new Playstation();

        Computer computer = new Computer();

        try {
            computer.open();
            computer.addController(xboxController);
            xboxController.pressButtonA();
            xboxController.pressButtonB();
            computer.playGame();
            computer.shutdown();
        } catch (RuntimeException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        try {
            computer.open();
            computer.addController(psController);
            psController.pressButtonX();
            psController.pressButtonY();
            computer.playGame();
            computer.shutdown();
        } catch (RuntimeException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
