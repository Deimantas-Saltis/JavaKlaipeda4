package advanced.polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {

        RemoteController remote = new TvRemoteController();
        RemoteController remoteController = new AcRemoteController();

        remote.enable(true);

        remote = new AcRemoteController();
        remote.enable(false);

        printObject(new TvRemoteController());
        printObject(new AcRemoteController());
    }

    public static void printObject(RemoteController remote) {
        System.out.println(remote.getClass().getSimpleName());
    }

    public static void printTv(TvRemoteController remote) {
        System.out.println(remote.getClass().getSimpleName());
    }

    public static void printAc(AcRemoteController remote) {
        System.out.println(remote.getClass().getSimpleName());
    }
}
