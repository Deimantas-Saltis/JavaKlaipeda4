package advanced.inheritance.animal_example;

public abstract class Animal {

    protected boolean mammal;
    protected String voice;

    public Animal(boolean mammal, String voice) {
        this.mammal = mammal;
        this.voice = voice;
    }

    public String yieldVoice() {
        return ("My voice: " + voice);
    }
}
