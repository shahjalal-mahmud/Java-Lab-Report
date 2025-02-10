class Complex {
    private double realPart;
    private double imaginaryPart;

    // Default constructor
    public Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    // Parameterized constructor
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Addition method
    public Complex add(Complex otherNumber) {
        return new Complex(this.realPart + otherNumber.realPart, this.imaginaryPart + otherNumber.imaginaryPart);
    }

    // Subtraction method
    public Complex subtract(Complex otherNumber) {
        return new Complex(this.realPart - otherNumber.realPart, this.imaginaryPart - otherNumber.imaginaryPart);
    }

    // Multiplication method
    public Complex multiply(Complex otherNumber) {
        double real = this.realPart * otherNumber.realPart - this.imaginaryPart * otherNumber.imaginaryPart;
        double imaginary = this.realPart * otherNumber.imaginaryPart + this.imaginaryPart * otherNumber.realPart;
        return new Complex(real, imaginary);
    }

    // Division method
    public Complex divide(Complex otherNumber) {
        double denominator = otherNumber.realPart * otherNumber.realPart + otherNumber.imaginaryPart * otherNumber.imaginaryPart;
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        double real = (this.realPart * otherNumber.realPart + this.imaginaryPart * otherNumber.imaginaryPart) / denominator;
        double imaginary = (this.imaginaryPart * otherNumber.realPart - this.realPart * otherNumber.imaginaryPart) / denominator;
        return new Complex(real, imaginary);
    }

    // Setters
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    // Getters
    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    // toString method
    @Override
    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}

public class Question07 {
    public static void main(String[] args) {
        Complex num1 = new Complex(4, 5);
        Complex num2 = new Complex(2, -3);

        Complex sum = num1.add(num2);
        Complex difference = num1.subtract(num2);
        Complex product = num1.multiply(num2);
        Complex quotient = num1.divide(num2);

        System.out.println("First Complex Number: " + num1);
        System.out.println("Second Complex Number: " + num2);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
    }
}