package advanced.cocurrency.example1;

public class ConcurrencyExample1 {

    public static void main(String[] args) {
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
