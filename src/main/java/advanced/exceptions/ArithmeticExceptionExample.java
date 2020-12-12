package advanced.exceptions;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int firstNum = 10;
        int secondNum = 2;

        try {
            System.out.println(firstNum / secondNum);
        } catch (ArithmeticException exception) {
            System.out.println("Can't divide " + firstNum + " by " + secondNum);
        } finally {
            System.out.println("Executing finally block");
        }
    }
}
