//package exceptions.ex2_3;
//
//import java.util.Collection;
//
//public class SimpleCalculator implements Calculator {
//
//    @Override
//    public Double add(Double nr1, Double nr2) {
//        if (nr1 == null || nr2 == null) {
//            throw new NullParameterException();
//        }
//
//        double result = nr1 + nr2;
//        if (Double.isInfinite(result)) {
//            if (result == Double.POSITIVE_INFINITY) {
//                throw new OverflowException();
//            } else {
//                throw new UnderflowException();
//            }
//        }
//        return result;
//    }
//
//    @Override
//    public Double divide(Double nr1, Double nr2) {
//        if (nr1 == null || nr2 == null) {
//            throw new NullParameterException();
//        }
//
//        if (nr2 == 0) {
//            throw new ArithmeticException("Division by zero");
//        }
//
//        return nr1 / nr2;
//    }
//
//    @Override
//    public Double average(Collection<Double> numbers) {
//        if (numbers == null || numbers.isEmpty()) {
//            throw new NullParameterException();
//        }
//
//        Double sum = 0d;
//        for (Double number : numbers) {
//            sum = add(sum, number); // Utilizează metoda add pentru a evita posibilele excepții de overflow sau underflow
//        }
//
//        return divide(sum, (double) numbers.size());
//    }
//}