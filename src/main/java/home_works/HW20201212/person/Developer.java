package home_works.HW20201212.person;

public abstract class Developer extends Person {

    protected int ageOfExperience;

    public Developer(String name, int ageOfExperience) {
        super(name);
        this.ageOfExperience = ageOfExperience;
        System.out.println(Developer.class.getSimpleName() + " constructor is called");
    }

    public String getDeveloper() {
        return String.format("Name: %s age of experience: %s",name, ageOfExperience);
    }
}
