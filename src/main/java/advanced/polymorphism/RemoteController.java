package advanced.polymorphism;

public interface RemoteController {

    String FILE_LOCATION = "/users/Deimantas/Documents/......";

    void enable(boolean action);

    default void print() {
        System.out.println(this.getClass().getSimpleName());
    }
}
