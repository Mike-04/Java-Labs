package complexExpression;

public class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(re + other.re, im + other.im);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(re - other.re, im - other.im);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(re * other.re - im * other.im, re * other.im + im * other.re);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.re * other.re + other.im * other.im;
        return new ComplexNumber((re * other.re + im * other.im) / denominator, (im * other.re - re * other.im) / denominator);
    }
    public ComplexNumber conjugate() {
        return new ComplexNumber(re, -im);
    }
    @Override
    public String toString() {
        return re + " + " + im + " * i";
    }
}
