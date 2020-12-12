package advanced.inheritance.animal_example;

public class Cat extends Animal {

    private String color;

    public Cat(boolean mammal, String voice, String color) {
        super(mammal, voice);
        this.color = color;
    }
}
