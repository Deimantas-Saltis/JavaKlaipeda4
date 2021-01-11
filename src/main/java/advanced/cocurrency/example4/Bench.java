package advanced.cocurrency.example4;

public class Bench {

    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void takeASeat() {
        if (availableSeats > 0) {
            System.out.println("Take a seat.");
            availableSeats--;
            System.out.println("Available seats left: " + availableSeats);
        } else {
            System.out.println("There are no available seats. :(");
        }
    }

    public void takeASeatSynced() {
        System.out.println("Unsynced part!");
        synchronized (this) {
            if (availableSeats > 0) {
                System.out.println("Take a seat.");
                availableSeats--;
                System.out.println("Available seats left: " + availableSeats);
            } else {
                System.out.println("There are no available seats. :(");
            }
        }
    }

    public synchronized void takeASeatSynced1() {
        System.out.println("Unsynced part!");
        if (availableSeats > 0) {
            System.out.println("Take a seat.");
            availableSeats--;
            System.out.println("Available seats left: " + availableSeats);
        } else {
            System.out.println("There are no available seats. :(");
        }
    }
}
