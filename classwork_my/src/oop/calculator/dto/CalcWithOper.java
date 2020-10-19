package oop.calculator.dto;

public class CalcWithOper implements ICalc{
    public double add(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }
    public double mult(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double mod(double a) {
        return a > 0 ? a : -a;
    }

    public double power(double a, int b) {
        double result = 1;
        for (int i = 1; i <= b; i++) {
               result *= 0;
        }
        return result;
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}

