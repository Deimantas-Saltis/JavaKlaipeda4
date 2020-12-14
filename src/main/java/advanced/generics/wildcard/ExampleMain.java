package advanced.generics.wildcard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExampleMain {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c");
        Set<Integer> integers = new HashSet<>(Arrays.asList(2, 3, 54, 1));

        PrintClass.printCollectionW(strings);
        PrintClass.printCollectionW(integers);

        PrintClass.printCollectionG(strings);
        PrintClass.printCollectionG(integers);
    }
}
