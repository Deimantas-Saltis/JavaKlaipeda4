package advanced.enumerators;

public class EnumExampleMain {
    public static void main(String[] args) {
        String coffee = "latte";
        Coffee coffeeEnum = Coffee.valueOf(coffee.toUpperCase());

        System.out.println(coffeeEnum);
        System.out.println(Coffee.AMERICANO);

        System.out.println(AutoMakers.VOLVO.getEngineSize());
    }
}
