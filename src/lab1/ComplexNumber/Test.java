package lab1.ComplexNumber;

public class Test {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(4, 5);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        ComplexNumber sum = Operations.add(c1, c2);
        System.out.println("Suma: " + sum);

        ComplexNumber product = Operations.multiply(c1, c2);
        System.out.println("Produsul: " + product);
    }
}
