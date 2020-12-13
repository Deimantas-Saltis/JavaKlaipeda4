package advanced.classes.local_classes;

public class LocalClassExample {
    public static void main(String[] args) {
        System.out.println("Local class example!");

        for (int i = 0; i < 10; i++) {
            class Pair {
                String key;
                int value;

                public Pair (String key, int value) {
                    this.key = key;
                    this.value = value;
                }
            }
        }

        // Local class is not visible
        // Pair pair = new Pair("k1", 1);
    }
}
