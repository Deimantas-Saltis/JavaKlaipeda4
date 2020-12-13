package advanced.polymorphism;

public class TvRemoteController implements RemoteController {

    @Override
    public void enable(boolean action) {
        System.out.println("Turning TV on - " + action);
    }
}
