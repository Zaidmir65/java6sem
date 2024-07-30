// Define a class called ExceptionHandler
public class ExceptionHandler {

    
    public static void divide(int numerator, int denominator) {
        try {
            
            int result = numerator / denominator;
            System.out.println("The result is: " + result);

           
            int[] array = new int[5];
            System.out.println(array[10]); 

        } catch (ArithmeticException e) {
           
            System.out.println("ArithmeticException caught: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());

        } catch (Exception e) {
            
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        }
    }

    
    public static void main(String[] args) {
        
        divide(10, 2); 
        divide(10, 0); 
        divide(10, 2);
    }
}