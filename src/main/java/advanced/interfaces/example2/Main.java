package advanced.interfaces.example2;

public class Main {
    public static void main(String[] args) {
        Balloon balloon = new Balloon(54);
        Plane plane = new Plane(580);

        System.out.println("Maksimalus greiciai");
        System.out.println(balloon.maxSpeed());
        System.out.println(plane.maxSpeed());

        System.out.println("Ar TP gali skristi?");
        System.out.println(balloon.canFly("bad"));
        System.out.println(plane.canFly("bad"));
        
        // Polymorphism
        AirTransport transport = new Balloon(1);
        Fly transport2 = new Plane(20);
    }
}
