package lab2.task1;

public class Test {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(5, 2);

        // сложение
        c1.addWithComplex(c2);

        // вывод результата
        c1.showNumber();
    }
}
