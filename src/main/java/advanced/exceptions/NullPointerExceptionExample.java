package advanced.exceptions;

public class NullPointerExceptionExample {
    public static void main(String[] args) {

        try {
            String text = null;
            System.out.println(text.charAt(5));
        } catch (NullPointerException test) {
            System.out.println("Buvo gautas null-pointeris");
        }
    }
}
