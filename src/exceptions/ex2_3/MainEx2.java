//package exceptions.ex2_3;
//
//import java.util.List;
//
//public class MainEx2 {
//    public static void main(String[] args) {
//        Calculator calculator = new SimpleCalculator();
//
//        try {
//            System.out.println(calculator.add(2d, 3d));
//            System.out.println(calculator.divide(9d, 4d));
//            System.out.println(calculator.average(List.of(1d, 2d, 3d, 4d)));
//
//            // Testăm cazurile limită care aruncă excepții
//            System.out.println(calculator.add(Double.MAX_VALUE, Double.MAX_VALUE)); // OverflowException
//            System.out.println(calculator.add(-Double.MAX_VALUE, -Double.MAX_VALUE)); // UnderflowException
//            System.out.println(calculator.divide(5d, 0d)); // ArithmeticException: Division by zero
//            System.out.println(calculator.average(null)); // NullParameterException
//        } catch (Calculator.NullParameterException | Calculator.OverflowException |
//                 Calculator.UnderflowException | ArithmeticException e) {
//            System.out.println("Caught exception: " + e.getMessage());
//        }
//    }
//}