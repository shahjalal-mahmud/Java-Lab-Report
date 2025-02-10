public class Question06 {
    public static void main(String[] args) {
        try {
            BoroInt num1 = new BoroInt("12345");
            BoroInt num2 = new BoroInt("6789");
            
            BoroInt sum = num1.add(num2);
            BoroInt difference = num1.subtract(num2);
            BoroInt product = num1.multiply(num2);
            BoroInt quotient = num1.divide(num2);
            
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

class BoroInt {
    private String val;

    // Default constructor
    public BoroInt() {
        this.val = "0";
    }

    // Constructor that takes a string value
    public BoroInt(String val) {
        try {
            if (!validValue(val)) {
                throw new BoroIntErModdheNumberCharaArKisuDeyaJaiNaException("Invalid input: Only numerical values allowed.");
            }
            this.val = trim(val);
        } catch (BoroIntErModdheNumberCharaArKisuDeyaJaiNaException e) {
            System.out.println(e.getMessage());
            this.val = "0"; // Assign default value on error
        }
    }

    // Constructor that takes an integer value
    public BoroInt(int val) {
        this.val = String.valueOf(val);
    }

    // Constructor that takes another BoroInt object
    public BoroInt(BoroInt other) {
        this.val = other.val;
    }

    // Method to trim spaces from a string
    public String trim(String _val) {
        return _val.replaceAll("\\s", "");
    }

    // Method to validate if the string contains only numeric values
    public boolean validValue(String _val) {
        return _val.matches("\\d+");
    }

    // Addition method
    public BoroInt add(BoroInt _val) {
        java.math.BigInteger result = new java.math.BigInteger(this.val).add(new java.math.BigInteger(_val.val));
        return new BoroInt(result.toString());
    }

    // Subtraction method
    public BoroInt subtract(BoroInt _val) {
        java.math.BigInteger result = new java.math.BigInteger(this.val).subtract(new java.math.BigInteger(_val.val));
        return new BoroInt(result.toString());
    }

    // Multiplication method
    public BoroInt multiply(BoroInt _val) {
        java.math.BigInteger result = new java.math.BigInteger(this.val).multiply(new java.math.BigInteger(_val.val));
        return new BoroInt(result.toString());
    }

    // Division method
    public BoroInt divide(BoroInt _val) {
        try {
            if (_val.val.equals("0")) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            java.math.BigInteger result = new java.math.BigInteger(this.val).divide(new java.math.BigInteger(_val.val));
            return new BoroInt(result.toString());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return new BoroInt("0"); // Assign default value on error
        }
    }

    // Custom exception class
    public static class BoroIntErModdheNumberCharaArKisuDeyaJaiNaException extends Exception {
        public BoroIntErModdheNumberCharaArKisuDeyaJaiNaException(String message) {
            super(message);
        }
    }

    // Method to print value
    @Override
    public String toString() {
        return this.val;
    }
}