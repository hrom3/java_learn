package oop;

import pensia_calc.*;

import java.util.Scanner;

public class OopMain4 {
    public static void main(String[] args) {
        Man man1 = new Man();
        Man president = new Man();
        Man mil = new Man();

        man1.setName("Vania");
        president.setName("Sania");
        mil.setName("Vika");
        man1.setType(ETypeMan.HUMAN);
        president.setType(ETypeMan.PPRESIDENT);
        mil.setType(ETypeMan.MILLITARY);
        mil.setYearOld(20);
        man1.setYearOld(20);
        man1.setHairLength(25);

        IPensiaCalc calc = new MultiPenciaCalc();
        System.out.println(calc.calc(man1));
        System.out.println(calc.calc(mil));
        System.out.println(calc.calc(president));

    }
}
