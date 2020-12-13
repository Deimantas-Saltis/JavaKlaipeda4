package advanced.composition;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(
                new Bed(2.5, 4),
                new Tv("4k")
        );

        Bed bed = new Bed(5.5, 8.8);
        Tv tv = new Tv("2k");
        Room anotherRoom = new Room(bed, tv);
    }
}
