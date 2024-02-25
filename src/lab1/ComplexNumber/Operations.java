package lab1.ComplexNumber;

public class Operations {

    // https://russianblogs.com/article/4554177842/

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        float re = c1.getReal() + c2.getReal();
        float im = c1.getImagin() + c2.getImagin();
        return new ComplexNumber(re, im);
    }

    public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
        float re = c1.getReal() * c2.getReal() - c1.getImagin() * c2.getImagin();
        float im = c1.getReal() * c2.getImagin() + c1.getImagin() * c2.getReal();
        return new ComplexNumber(re, im);
    }
}
