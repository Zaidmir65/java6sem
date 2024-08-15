public class Main {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught exception in main method: " + e.getMessage());
        }
    }

    public static void method1() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Caught exception in method1: " + e.getMessage());
            throw e; 
        }
    }

    public static void method2() {
        try {
            method3();
        } catch (Exception e) {
            System.out.println("Caught exception in method2: " + e.getMessage());
            throw e; // re-throw the exception
        }
    }

    public static void method3() {
        throw new RuntimeException("Exception in method3");
    }
}