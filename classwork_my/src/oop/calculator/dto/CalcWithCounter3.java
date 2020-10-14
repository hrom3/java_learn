package oop.calculator.dto;

public class CalcWithCounter3 implements ICalcWithCount {
    private final ICalc calc;
    private int count = 0;

    public CalcWithCounter3(ICalc calc) {
        this.calc = calc;
    }

    public int getCount() {
        return count;
    }

    public double add(double a, double b) {
       this.count++;
       return this.calc.add(a, b);
    }

    public double minus(double a, double b) {
        this.count++;
        return this.minus(a, b);
    }

    public double mult(double a, double b) {
        this.count++;
        return this.calc.mult(a, b);
    }

    public double div(double a, double b) {
        this.count++;
        return this.calc.div(a, b);
    }

    public double mod(double a) {
        this.count++;
        return this.calc.mod(a);
    }

    public double power(double a, int b) {
        this.count++;
        return this.calc.power(a, b);
    }

    public double sqrt(double a) {
        this.count++;
        return this.calc.sqrt(a);
    }
}
