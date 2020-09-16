package oop.calculator.dto;

public class Fizik {
    private ICalc calc;
    public Fizik(ICalc calc) {
        this.calc = calc;
    }

    public double calc(double a, double b) {
        return this.calc.add(a, b);
    }

    public ICalc getCalc() {
        return this.calc;
    }
}
