package control;

public class Playstation implements GameController {
    @Override
    public void pressButtonA() {
        System.out.println("Playstation Controller: A tuşuna basıldı.");
    }

    @Override
    public void pressButtonB() {
        System.out.println("Playstation Controller: B tuşuna basıldı.");
    }

    @Override
    public void pressButtonX() {
        System.out.println("Playstation Controller: X tuşuna basıldı.");
    }

    @Override
    public void pressButtonY() {
        System.out.println("Playstation Controller: Y tuşuna basıldı.");
    }
}
