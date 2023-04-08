package P6;
// PS06-Problem-06: Calculator
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        String operator = in.next();
        int num2 = in.nextInt();

        if (operator.equals("+")) {
            System.out.println(add(num1, num2));
        } else if (operator.equals("-")) {
            System.out.println(subtract(num1, num2));
        } else if (operator.equals("*")) {
            System.out.println(multiply(num1, num2));
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println("Error");
            } else {
                System.out.println(divide(num1, num2));
            }
        } else if (operator.equals("%")) {
            System.out.println(modulo(num1, num2));
        } else {
            System.out.println("Invalid operator");
        }
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulo(int num1, int num2) {
        return num1 % num2;
    }
}
