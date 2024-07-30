// ExceptionPropagation.java

public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        int num1 = 10;
        int num2 = 0;
        int result = num1 / num2; 
    }
}