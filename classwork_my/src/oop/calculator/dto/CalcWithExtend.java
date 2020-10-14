package oop.calculator.dto;

public class CalcWithExtend extends CalcWithOper {
    public double mod(double a) {
        return Math.abs(a);
    }

    public double power(double a, int b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
