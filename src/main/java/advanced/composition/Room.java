package advanced.composition;

public class Room {

    private Bed bed;
    private Tv tv;

    public Room(Bed bed, Tv tv) {
        this.bed = bed;
        this.tv = tv;
    }
}
