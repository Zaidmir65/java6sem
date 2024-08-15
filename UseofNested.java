public class Main {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Inside inner try block");
                int num = 10 / 0; 
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException in inner catch block");
                throw new RuntimeException("Rethrowing RuntimeException");
            }
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException in outer catch block");
        }
    }
}