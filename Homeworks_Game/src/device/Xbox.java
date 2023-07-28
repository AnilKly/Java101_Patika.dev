package device;

import control.GameController;

public class Xbox implements GameController {
    @Override
    public void pressButtonA() {
        System.out.println("Xbox Controller: A tuşuna basıldı.");
    }

    @Override
    public void pressButtonB() {
        System.out.println("Xbox Controller: B tuşuna basıldı.");
    }

    @Override
    public void pressButtonX() {
        System.out.println("Xbox Controller: X tuşuna basıldı.");
    }

    @Override
    public void pressButtonY() {
        System.out.println("Xbox Controller: Y tuşuna basıldı.");
    }
}

