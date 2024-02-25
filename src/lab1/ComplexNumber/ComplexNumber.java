package lab1.ComplexNumber;

public class ComplexNumber {

    // действительная и мнимая часть
    private float re;
    private float im;

    public ComplexNumber(float re, float im) {
        this.re = re;
        this.im = im;
    }

    public float getReal() {
        return re;
    }

    public void setReal(float re) {

        this.re = re;
    }

    public float getImagin() {

        return im;
    }

    public void setImagin(float im) {
        this.im = im;
    }

    @Override
    public String toString() {
        return re + " + "
        +im;
    }
}
