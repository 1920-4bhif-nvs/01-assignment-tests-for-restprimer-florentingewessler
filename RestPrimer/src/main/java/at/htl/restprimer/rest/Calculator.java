package at.htl.restprimer.rest;

public class Calculator {
    private double number1;
    private double number2;

    public String divide(double a, double b) throws Exception {

        if(b == 0)
            throw new ArithmeticException("/ by zero");
        return String.valueOf(a / b);
    }
}
