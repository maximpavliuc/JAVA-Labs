package com.oop_pub.exceptions.ex2_3;

import java.util.List;

public class MainEx2 {
    public static void main(String[] args) {
        // Initialize the calculator
        Calculator calculator = new MyCalculator();

        // Test basic functionality
        System.out.println("Addition: " + calculator.add(2d, 3d));
        System.out.println("Division: " + calculator.divide(9d, 4d));
        System.out.println("Average: " + calculator.average(List.of(1d, 2d, 3d, 4d)));

        // Test edge cases that would throw exceptions
        try {
            // Null parameter
            calculator.add(null, 5d);
        } catch (NullParameterException e) {
            System.err.println("NullParameterException caught: " + e.getMessage());
        }

        try {
            // Division by zero
            calculator.divide(10d, 0d);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: " + e.getMessage());
        }

        try {
            // Overflow
            calculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (OverflowException e) {
            System.err.println("OverflowException caught: " + e.getMessage());
        }

        try {
            // Underflow
            calculator.add(Double.MIN_VALUE, -Double.MAX_VALUE);
        } catch (UnderflowException e) {
            System.err.println("UnderflowException caught: " + e.getMessage());
        }
    }
}
