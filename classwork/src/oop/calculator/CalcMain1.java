package oop.calculator;

import oop.calculator.dto.*;

import javax.swing.*;

public class CalcMain1 {
    public static void main(String[] args) {
        CalcWithOper calc1 = new CalcWithOper();
        CalcWithCopy calc2 = new CalcWithCopy();
        CalcWithExtend calc3 = new CalcWithExtend();
        ICalc calc4 = calc1;

//        CalcWithCounter3 calc5 = new CalcWithCounter3(null);
        ICalcWithCount calc5 = new CalcWithCounter3(calc4);

        Fizik fizik1 = new Fizik(calc2);
        double calcResult = fizik1.calc(123, 2);

        System.out.println(calcResult);

        Fizik fizik2 = new Fizik(calc5);
        double calcResult2 = fizik2.calc(123, 45);

        System.out.println(calcResult2);
        System.out.println(calc5.getCount());

        Fizik fizik3 = new Fizik(new CalcWithCounter3(calc1));
        double calcResult3 = fizik3.calc(123, -123);
        ICalcWithCount calcSaved = (ICalcWithCount) fizik3.getCalc();

        System.out.println(calcResult3);
        System.out.println(calcSaved.getCount());

        Fizik fizik4 = new Fizik(calc5);
        double calcResult4 = fizik4.calc(123, -485);
//        ICalcWithCount calcSaved1 = (ICalcWithCount) fizik4.getCalc();


        System.out.println(calcResult4);
//        System.out.println(calcSaved.getCount());
        fizik4.getCalc().add(45, 56);
//        System.out.println(((ICalcWithCount) fizik4.getCalc()).getCount());
        ICalc savedCalc4 = fizik4.getCalc();

        if (savedCalc4 instanceof ICalcWithCount) {
            System.out.println(((ICalcWithCount) fizik4.getCalc()).getCount());
        }

    }
}
