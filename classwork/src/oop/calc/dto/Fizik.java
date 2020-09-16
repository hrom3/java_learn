package oop.calc.dto;

public class Fizik {
    private final ICalc calc;

    public Fizik(ICalc calc) {
        this.calc = calc;
    }

    public double calc(int a, int b){
        return this.calc.minus(a, b);
    }

    public ICalc getCalc(){
        return this.calc;
    }
}
