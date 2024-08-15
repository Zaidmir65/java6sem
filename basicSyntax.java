public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
           
            int num = 10 / 0;
            System.out.println("This line will not be executed if an exception is thrown");
        } catch (ArithmeticException e) {
           
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            
            System.out.println("Finally block executed");
        }
    }
}