package advanced.cocurrency.example2;

public class ConcurrencyExample2 {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        System.out.println("Main thread starts");

        try {
            Thread.sleep(2000);
            System.out.println("Main thread is running");
            Thread.sleep(3000);
            System.out.println("Main thread ends");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
