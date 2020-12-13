package advanced.classes.anonymous_classes;

public class AnonymousClassExample {
    public static void main(String[] args) {

        AbstractPlantClass plantClass = new AbstractPlantClass() {
            @Override
            public String getPlantName() {
                return "Liepa";
            }
        };

        printTreeName(plantClass);
    }

    public static void printTreeName(AbstractPlantClass object) {
        System.out.println(object.getPlantName());
    }

}
