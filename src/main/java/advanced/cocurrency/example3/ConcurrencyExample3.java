package advanced.cocurrency.example3;


public class ConcurrencyExample3 {
    public static void main(String[] args) {
        StopWatch stopWatch1 = new StopWatch("SW1");
        stopWatch1.start();

        System.out.println("Main thread starts");

        try {
            Thread.sleep(1000);

            StopWatch stopWatch2 = new StopWatch("SW2");
            stopWatch2.start();

            Thread.sleep(2000);
            System.out.println("Main thread is running");
            Thread.sleep(3000);
            System.out.println("Main thread ends");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
