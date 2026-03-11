package calculadora.com;




public class Calculator {


    public double add(double sum1, double sum2) {
        return sum1 + sum2;
    }


    public double subtract(double rest1, double rest2) {
        return rest1 - rest2;
    }


    public double multiply(double mult1, double mult2) {
        return mult1 * mult2;
    }


    public double divide(double divide1, double divide2) {
        if (divide2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return divide1 / divide2;
    }
}