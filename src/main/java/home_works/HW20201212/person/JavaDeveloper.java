package home_works.HW20201212.person;

public class JavaDeveloper extends Developer {

    public JavaDeveloper(String name, int ageOfExperience) {
        super(name, ageOfExperience);
        System.out.println(JavaDeveloper.class.getSimpleName() + " constructor is called");
    }

    @Override
    public String textInCapital(String surname) {
       return super.textInCapital(String.format("%s %s", name, surname));
    }
}
