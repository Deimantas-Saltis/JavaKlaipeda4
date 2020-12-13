package advanced.classes.static_classes;

public class Bicycle {

    private int maxSpeed;

    public Bicycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static class Mechanic {
        public void upgrade(Bicycle bicycle) {
            bicycle.maxSpeed += 3;
        }
    }
}
