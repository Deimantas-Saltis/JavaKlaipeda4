package advanced.cocurrency.example4;

public class BenchMain {
    public static void main(String[] args) {
        Bench bench = new Bench(1);

        SeatTakerThread seatTaker1 = new SeatTakerThread(bench);
        SeatTakerThread seatTaker2 = new SeatTakerThread(bench);

        seatTaker1.start();
        seatTaker2.start();
    }
}
