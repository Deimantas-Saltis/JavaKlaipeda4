package advanced.exceptions;

public class ArrayIndexOutOfBoundariesExceptionExample {
    public static void main(String[] args) {
        int[] arr = {510, 456};

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array index is out of bounds! Array length = " + arr.length);
        }

        System.out.println("Programa baigė darbą sėkmingai!");
    }
}
