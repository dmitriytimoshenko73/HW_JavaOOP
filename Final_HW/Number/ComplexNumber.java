package Final_HW.Number;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    ComplexNumber(double real, double imaginary) {
        realPart = real;
        imaginaryPart = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double real = this.realPart + other.realPart;
        double imaginary = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double real = this.realPart - other.realPart;
        double imaginary = this.imaginaryPart - other.imaginaryPart;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double real = this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart;
        double imaginary = this.realPart * other.imaginaryPart + this.imaginaryPart * other.realPart;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {

        double denominator = other.realPart * other.realPart + other.imaginaryPart * other.imaginaryPart;
        if (denominator == 0) {
            throw new ArithmeticException("Делить на 0 нельзя!");
        }
        double realQuot = (this.realPart * other.realPart + this.imaginaryPart * other.imaginaryPart) / denominator;
        double imagQuot = (this.imaginaryPart * other.realPart - this.realPart * other.imaginaryPart) / denominator;

        return new ComplexNumber(realQuot, imagQuot);
    }

    @Override
    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}
