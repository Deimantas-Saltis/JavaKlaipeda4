package advanced.generics.wildcard;

import java.util.Collection;

public class PrintClass {

    // Example with generic
    public static <T> void printCollectionG(Collection<T> collection) {
        for (T element : collection) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    // Example with wildcard
    public static void printCollectionW(Collection<?> collection) {
        for (Object element : collection) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
