package oop.calculator.dto;

public class Fizik<T extends ICalc> {
    private T calc;
    public Fizik(T calc) {
        this.calc = calc;
    }

    public double calc(double a, double b) {
        return this.calc.add(a, b);
    }

    public T getCalc() {
        return calc;
    }

    public void setCalc(T calc) {
        this.calc = calc;
    }
}
