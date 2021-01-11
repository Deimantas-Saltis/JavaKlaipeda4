package advanced.cocurrency.example3;

public class StopWatch extends Thread {

    private String prefix;

    public StopWatch(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(prefix + " " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
